package com.zy.design.pattern.creational.factorymethod;

public class JavaVideoFactory extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
