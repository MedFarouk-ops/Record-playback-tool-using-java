package com.qatester.player;

import java.awt.AWTException;
import java.awt.AWTKeyStroke;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;

public class TestScriptPlayer {
	
	private String testScipt;
    private boolean loop = false;
    private long resumptionTime = 0;
    
    // get the test script from file
    
    public String getTestScriptFromFile(File testScript) {
    	return this.testScipt; 
    }
    
    
    
    
    // run test script //
    public void playScript(final String script){
        new Thread(){
            public void run(){
            	
            }
        }.start();
    }

}
