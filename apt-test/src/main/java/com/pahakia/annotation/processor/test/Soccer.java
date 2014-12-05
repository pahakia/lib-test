package com.pahakia.annotation.processor.test;

import com.pahakia.annotation.processor.test.annotation.Sport;

@Sport("summer")
public class Soccer {

    public void play() {
        System.out.println("soccer is fun");
    }
}
