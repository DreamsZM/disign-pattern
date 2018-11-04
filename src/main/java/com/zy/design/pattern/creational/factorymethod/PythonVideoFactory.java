package com.zy.design.pattern.creational.factorymethod;

public class PythonVideoFactory extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
