interface Camera {
    void capture();
}

// Interface extending another Interface
interface VideoRecorder extends Camera {
    void record();
}

class GoPro implements VideoRecorder {
    public void capture() { System.out.println("Photo Captured."); }
    public void record() { System.out.println("Video Recording Started."); }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        GoPro hero = new GoPro();
        hero.capture();
        hero.record();
    }
}
