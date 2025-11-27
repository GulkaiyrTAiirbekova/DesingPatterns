package src.DesignPatterns_STRUCTURAL.Facade;

public class CodecFactory {
        public Codec extract(VideoFile file){
            System.out.println("CodeFactory : extracting codec from " + file.getName());
            return  new OggCompressionCodec();
        }
}
