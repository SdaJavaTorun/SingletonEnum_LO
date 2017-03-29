package com.sdajava.singleton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SingletonEnum.INSTANCE.addToList("Test");
        SingletonEnum.INSTANCE.addToList("Test");
        SingletonEnum.INSTANCE.addToList("Test");

        // System.out.println(SingletonEnum.INSTANCE);

        TestList testList = new TestList();
        testList.test();

    }
}
