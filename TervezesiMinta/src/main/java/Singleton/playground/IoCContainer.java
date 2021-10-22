package Singleton.playground;

public class IoCContainer {

    public static Slide getSlider() {
        return Slide.getInstance();
    }
}
