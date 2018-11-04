package com.zy.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Child extends Base {

    @Override
    public void method(HashMap hashMap) {
        System.out.println("Child's method is runned!");
    }
}
