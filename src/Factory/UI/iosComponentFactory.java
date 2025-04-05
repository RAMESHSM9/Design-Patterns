package Factory.UI;

public class iosComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new iosButton();
    }

    @Override
    public Menu createMenu() {
        return new iosMenu();
    }

    @Override
    public NavBar createNavBar() {
        return new iosNavBar();
    }
}
