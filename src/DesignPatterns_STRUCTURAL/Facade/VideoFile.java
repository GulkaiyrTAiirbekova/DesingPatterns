package src.DesignPatterns_STRUCTURAL.Facade;


// 3rd-party complex library (simulated)

public class VideoFile {
    private String filename;

    public VideoFile(String filename){
        this.filename = filename;
    }
    public String getName(){
        return filename;
    }
    }
