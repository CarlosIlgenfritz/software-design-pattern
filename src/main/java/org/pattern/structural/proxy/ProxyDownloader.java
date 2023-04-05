package org.pattern.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyDownloader implements Dowloader {
    private Map<String, String> cache = new HashMap<>();
    private RealDownloader realDownloader = new RealDownloader();

    @Override
    public void download(String url) {
        if (isCached(url)) {
            System.out.println("File found in cache. Retrieving from cache...");
        } else {
            realDownloader.download(url);
            addToCache(url);
        }

        logDownload(url);
    }

    private boolean isCached(String url) {
        return cache.get(url) != null;
    }

    private void addToCache(String url) {
        cache.put(url, "Is cached now.");
    }

    private void logDownload(String url) {
        System.out.println("Dowloading the file...");
    }
}
