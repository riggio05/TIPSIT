/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxypatterndownload;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sirim
 */
public class ProxyVideoDownloader implements VideoDownloader{
    private final Map<String, Video> videoCache = new HashMap<>();
    private final RealVideoDownloader downloader = new RealVideoDownloader();

    public Video getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)) {
            videoCache.put(videoName, downloader.getVideo(videoName));
        }
        return videoCache.get(videoName);
    }
}