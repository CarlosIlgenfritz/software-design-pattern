package org.pattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        ProxyDownloader dowload = new ProxyDownloader();
        dowload.download("123");
        dowload.download("ABC");
        dowload.download("123");
    }
}
