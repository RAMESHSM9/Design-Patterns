package Factory.UI;

public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public NavBar createNavBar() {
        return new AndroidNavBar();
    }
}
