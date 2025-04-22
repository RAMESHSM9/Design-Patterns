package Factory.UI;

public interface UI {
    public void setResolution(int width, int height);
    public void setFrameRate(int frameRate);
    public UIComponentFactory getComponentFactory();
    public void display();
}
