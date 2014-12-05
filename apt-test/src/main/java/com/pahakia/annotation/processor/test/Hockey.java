package com.pahakia.annotation.processor.test;

import com.pahakia.annotation.processor.test.annotation.Region;
import com.pahakia.annotation.processor.test.annotation.Sport;

@Sport("winter")
@Region("Canada")
public class Hockey {

    public void play() {
        System.out.println("hockey is fun");
    }
}
