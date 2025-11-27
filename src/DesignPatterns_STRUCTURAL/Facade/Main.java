package src.DesignPatterns_STRUCTURAL.Facade;

import java.io.File;

//Application / Client Code


public class Main {
    public static void main(String [] args){
        VideoConverter converter = new VideoConverter();
        File mp4 = converter.convert("funny-cats-video.ogg", "mp4");

        System.out.println("Saved file: "  + mp4.getName());
    }
}
