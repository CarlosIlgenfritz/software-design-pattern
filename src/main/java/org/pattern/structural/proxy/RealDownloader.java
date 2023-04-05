package org.pattern.structural.proxy;

public class RealDownloader implements Dowloader{
    @Override
    public void download(String url) {
        System.out.println("Downloading file from " + url);
    }
}
