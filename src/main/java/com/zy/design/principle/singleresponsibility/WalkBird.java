package com.zy.design.principle.singleresponsibility;

import java.util.Date;

public class WalkBird {

    public static void main(String[] args) {
        while (true){
            String s = new String("now :" + new Date());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(s);
                }
            }).start();
        }
    }
}
