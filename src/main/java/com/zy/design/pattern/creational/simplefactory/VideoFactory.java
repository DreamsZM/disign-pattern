package com.zy.design.pattern.creational.simplefactory;

public class VideoFactory {

    public Video getVideo(String type){

        return null;
    }

    public Video getVideo(Class clazz){
        Video video = null;
        try {
            video = (Video) clazz.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
