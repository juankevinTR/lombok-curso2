package com.juankevintrujillo;

import com.juankevintrujillo.java.JavaExample;

public class Java {

    public static void main(String[] args) {
        JavaExample javaExample = new JavaExample();

        System.out.println("*** Java class ***");
        System.out.println("Integer: " + javaExample.getIntegerData());
        System.out.println("Long: " + javaExample.getLongData());
        System.out.println("Double: " + javaExample.getDoubleData());
        System.out.println("String: " + javaExample.getStringData());
    }

}
