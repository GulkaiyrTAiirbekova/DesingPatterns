package src.DesignPatterns_STRUCTURAL.Facade;

import java.io.File;


//These are some of the classes of a complex 3rd-party video
//conversion framework. We don't control that code, therefore
//can't simplify it
/*
class VideoFile
class OggCompressionCodec

class MPEG4CompressionCodec
class CodecFactory
class BitrateReader
class AudioMixer
 */
//Application / Client Code

//Application classes don't depend on a billion classes
//provided by the complex frameworks. Also, if you decide to switch frameworks, you only need to rewrite the facade class.


public class Main {
    public static void main(String [] args){
        VideoConverter converter = new VideoConverter();
        File mp4 = converter.convert("funny-cats-video.ogg", "mp4");

        System.out.println("Saved file: "  + mp4.getName());
    }
}
