package com.pahakia.annotation.processor.test;

public class WithOverride extends Soccer {

    @Override
    public void play() {
        System.out.println("good play");
    }
}
