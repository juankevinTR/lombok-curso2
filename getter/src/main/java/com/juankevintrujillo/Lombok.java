package com.juankevintrujillo;

import com.juankevintrujillo.lombok.LombokExample;

public class Lombok {

    public static void main(String[] args) {
        LombokExample lombokExample = new LombokExample();

        System.out.println("*** Lombok class ***");
        System.out.println("Integer: " + lombokExample.getIntegerData());
        System.out.println("Long: " + lombokExample.getLongData());
        System.out.println("Double: " + lombokExample.getDoubleData());
        System.out.println("String: " + lombokExample.getStringData());
    }

}
