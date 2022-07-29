package com.qatester.player;

import java.awt.AWTException;
import java.awt.AWTKeyStroke;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.StringReader;


public class ScriptPlayer {

    private Robot robot;
    private boolean playing;
    private boolean paused;
    private boolean loop = false;
    private long resumptionTime = 0;

    public void playScript(final String script){
        new Thread(){
            public void run(){
                playing = true;
                paused = false;
                try {
                    if (robot == null)robot = new Robot();
                } catch (AWTException e) {
                    e.printStackTrace();
                }
                do{
                    BufferedReader reader = new BufferedReader(new StringReader(script));
                    try {
                        String line = reader.readLine();
                        int i = 0;
//                        TimeRecorder tr = new TimeRecorder();
//                        while (line != null && playing){
//                            AutoClicker.getInstance().log(++i + ": " + line);
//                            tr.start();
//                            executeCommand(line);
//                            while(paused || resumptionTime > System.currentTimeMillis()){sleep(1);}
//                            AutoClicker.getInstance().logln("     Command Executed In " + tr.getTimeMillisPassed() + " Millis");
//                            line = reader.readLine();
//                        }
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                }while (loop);
                playing = false;
//                AutoClicker.getInstance().stopPlaying();
            }
        }.start();
    }

    //A command can look like this: "keypress: H"
    private void executeCommand(String command){
        if (command.contains("move")){
            int xValue = Integer.parseInt(command.substring(6, command.indexOf("/")));
            int yValue = Integer.parseInt(command.substring(command.indexOf("/") + 1));
            robot.mouseMove(xValue, yValue);
        }else if (command.contains("wait")){
            int value = Integer.parseInt(command.substring(6));
            resumptionTime = System.currentTimeMillis() + value;
        }else if (command.contains("mousepress")){
            int mask = Integer.parseInt(command.substring(12));
            robot.mousePress(mask);
        }else if (command.contains("mouserelease")){
            int mask = Integer.parseInt(command.substring(14));
            robot.mouseRelease(mask);
        }else if (command.contains("keypress")){
            String keytext = command.substring(10);
            AWTKeyStroke ks = AWTKeyStroke.getAWTKeyStroke(keytext);
            System.out.println(keytext);
            robot.keyPress(ks.getKeyCode());
        }else if (command.contains("keyrelease")){
            String keytext = command.substring(12);
            AWTKeyStroke ks = AWTKeyStroke.getAWTKeyStroke(keytext);
            System.out.println(keytext);
            robot.keyRelease(ks.getKeyCode());
        }
    }

    public void terminate(){
        playing = false;
    }

    public void pause(){
        resumptionTime = resumptionTime - System.currentTimeMillis();
        paused = true;
    }

    public void resume(){
        resumptionTime = resumptionTime + System.currentTimeMillis();
        paused = false;
    }

    public void setLoop(boolean loop){
        this.loop = loop;
    }
}