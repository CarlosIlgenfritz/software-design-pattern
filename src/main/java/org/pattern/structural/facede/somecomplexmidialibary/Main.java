package org.pattern.structural.facede.somecomplexmidialibary;

import org.pattern.structural.facede.somecomplexmidialibary.facade.VideoConversionFacade;

public class Main {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
