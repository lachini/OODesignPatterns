/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.chainOfResponsibility;

/**
 *
 * @author Dell
 */
public class VideoFileHandler extends Handler {

    private Handler handler;
    private String handlerName;

    public VideoFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {

        if (file.getFileType().equals("video")) {
            System.out.println("Process and saving video file... by " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " fowards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File not supported");
        }

    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
