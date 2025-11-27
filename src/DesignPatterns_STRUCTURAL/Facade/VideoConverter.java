package src.DesignPatterns_STRUCTURAL.Facade;
import java.io.File;

public class VideoConverter {
    public File convert(String filename, String format) {
        System.out.println("VideoConverter:  converting ' " + filename + " to " + format);

        VideoFile file = new VideoFile(filename);

        Codec sourceCodec = new CodecFactory().extract(file);

        Codec destinationCodec;

        if (format.equalsIgnoreCase("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        } else{
            destinationCodec = new OggCompressionCodec();
        }

        String buffer = BitrateReader.read(filename, sourceCodec);
        String result = BitrateReader.convert(buffer, destinationCodec);

        result = new AudioMixer().fix(result);

        //Simulation of saving to file

        File output = new File(result + "." + format);
        return output;


    }
}
