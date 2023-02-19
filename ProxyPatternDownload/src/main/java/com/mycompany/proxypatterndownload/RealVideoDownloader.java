/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxypatterndownload;

import javax.swing.JTextArea;

/**
 *
 * @author sirim
 */
public class RealVideoDownloader implements VideoDownloader {
    private JTextArea textArea;
    public RealVideoDownloader(JTextArea textArea) {
        this.textArea = textArea;
    }
    @Override
    public Video getVideo(String videoName) {
        textArea.append("Connecting to https://www.youtube.com ...\n");
        textArea.append("Downloading " + videoName + "\n");
        return new Video(videoName);
    }
}
