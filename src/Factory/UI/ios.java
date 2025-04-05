package Factory.UI;

public class ios implements UI {

    @Override
    public void setResolution(int width, int height) {
        System.out.println("ios Resolution: " + width + "x" + height);
    }

    @Override
    public void setFrameRate(int frameRate) {
        System.out.println("ios FrameRate: " + frameRate);
    }

    @Override
    public UIComponentFactory getComponentFactory() {
        return new iosComponentFactory();
    }

    @Override
    public void display() {

    }
}
