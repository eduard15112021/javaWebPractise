package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayerBean",MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName()+"  "+ musicPlayer.getVolume());
        context.close();
    }
}
