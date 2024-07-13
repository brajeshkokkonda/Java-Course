package com.mainmod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main module!");
        //call mod-1 & mod-2 classes
        com.mod1.Main.hello();
        com.mod2.Main.hello();
    }
}