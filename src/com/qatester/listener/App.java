package com.qatester.listener;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

public class App 
{
    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
            System.out.println("oop");
        }
        catch (Exception ex) {
            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new GlobalKeyListener());
    }
}