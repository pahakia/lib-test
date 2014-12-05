package com.pahakia.annotation.processor.test.test;

import com.pahakia.annotation.processor.test.annotation.Region;
import com.pahakia.annotation.processor.test.annotation.Sport;

@Sport("winter")
@Region("Canada")
public class TestHockey {

    public void play() {
        System.out.println("test   hockey is fun");
    }
}
