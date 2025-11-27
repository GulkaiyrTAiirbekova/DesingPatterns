package src.DesignPatterns_STRUCTURAL.Facade;

public class AudioMixer {
    public String fix(String result) {
        System.out.println("AudioMixer: fixing audio...");
        return result + "_ audio_fixed";
    }
}
