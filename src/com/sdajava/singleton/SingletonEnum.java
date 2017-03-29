package com.sdajava.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas on 29.03.2017.
 */
public enum SingletonEnum {
    INSTANCE;

    List<String> lista = new ArrayList<String>();

    public void addToList(String value){
        lista.add(value);
    }

    public void iterateOverList(){
        lista.forEach(System.out::println);
    }

    private SingletonEnum(){
        System.out.println("Test");
    }

}
