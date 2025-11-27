package src.DesignPatterns_STRUCTURAL.Facade;

public class BitrateReader {

    public static String read(String filename, Codec codec) {
        System.out.println("BitrateReader : reading file ...");
        return filename + " _buffer";
    }

    public static String convert (String buffer, Codec codec){
        System.out.println("BitrateReader : converting... ");
        return buffer + "_converted_to_" + ((codec instanceof MPEG4CompressionCodec));
    }
}
