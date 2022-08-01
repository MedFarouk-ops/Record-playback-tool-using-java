package com.qatester.listener;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;

public class QaEventListener  implements NativeMouseInputListener , NativeKeyListener{
	
	// String that will capture the UI actions
	private String testScript;

	public QaEventListener() {
		super();
	}
	
	public QaEventListener(String testScript) {
		this.testScript = testScript;
	}
	
	// Capturing Keyboard actions // ********************************************************************************************************************* //
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
//		this.testScript += "Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()) + "\n";
		this.testScript += "qaScreenAction.type(\""+ NativeKeyEvent.getKeyText(e.getKeyCode()) + "\");";
		
		if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
            		try {
                		GlobalScreen.unregisterNativeHook();
            		} catch (NativeHookException nativeHookException) {
                		nativeHookException.printStackTrace();
            		}
        	}
	}

	public void nativeKeyReleased(NativeKeyEvent e) {
		System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
//		this.testScript += "Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode())+ "\n";
		
	}

	public void nativeKeyTyped(NativeKeyEvent e) {
		System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
//		this.testScript += "Key Typed: " + e.getKeyText(e.getKeyCode()) + "\n";
	}
	
	// Capturing mouse actions // ********************************************************************************************************************** //
	public void nativeMouseClicked(NativeMouseEvent e) {
		System.out.println("Mouse Clicked: " + e.getClickCount());
//		this.testScript += "Mouse Clicked: " + e.getClickCount() + "\n";
		this.testScript += "qaScreenAction.click();\n";
		
		
	}

	public void nativeMousePressed(NativeMouseEvent e) {
		System.out.println("Mouse Pressed: " + e.getButton());
		//this.testScript += "Mouse Pressed: " + e.getButton()+ "\n";
		this.testScript += "qaScreenAction.MYROBOT.mousePress(16);\n";
	}

	public void nativeMouseReleased(NativeMouseEvent e) {
		System.out.println("Mouse Released: " + e.getButton());
//		this.testScript += "Mouse Released: " + e.getButton()+ "\n";
		this.testScript += "qaScreenAction.click();\n";
		this.testScript += "qaScreenAction.MYROBOT.mouseRelease(16);";	
	}

	public void nativeMouseMoved(NativeMouseEvent e) {
		System.out.println("Mouse Moved: " + e.getX() + ", " + e.getY());
		this.testScript+= "qaScreenAction.gotoxy("+e.getX() + ", " + e.getY() + ");\n" ; 
	}

	public void nativeMouseDragged(NativeMouseEvent e) {
		System.out.println("Mouse Dragged: " + e.getX() + ", " + e.getY());
		this.testScript += 	"qaScreenAction.gotoxy("+e.getX() + ", " + e.getY() + ");\n" ;
	}
 

	//************************************************************//
	
	public String getTestScript() {
		return testScript;
	}

	public void setTestScript(String testScript) {
		this.testScript = testScript;
	}
	
}

