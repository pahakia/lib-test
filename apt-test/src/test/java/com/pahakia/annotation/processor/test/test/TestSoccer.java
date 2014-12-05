package com.pahakia.annotation.processor.test.test;

import com.pahakia.annotation.processor.test.annotation.Sport;

@Sport("summer")
public class TestSoccer {

    public void play() {
        System.out.println("soccer is fun");
    }
}
