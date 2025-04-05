package Factory.UI;

public class Android implements UI{

    @Override
    public void setResolution(int width, int height) {
        System.out.println("Android resolution set to " + width + "x" + height);
    }

    @Override
    public void setFrameRate(int frameRate) {
        System.out.println("Android frame rate set to " + frameRate);
    }

    @Override
    public UIComponentFactory getComponentFactory() {
        return new AndroidComponentFactory();
    }

    @Override
    public void display() {

    }
}
