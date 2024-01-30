package bridgePattern;

public class HDVideoProcessor implements VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println("processing HD video");
    }
}
