/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.chainOfResponsibility;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dell
 */
public class Demo {

    public static void main(String[] args) {
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        
        textHandler.setHandler(docHandler);
        docHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);

        file = new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.doc", "doc", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");
        
        file = new File("Abc.jpg", "video", "C:");
        textHandler.process(file);
    }
}
