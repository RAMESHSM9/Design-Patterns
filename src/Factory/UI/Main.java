package Factory.UI;

public class Main {
    public static void main(String[] args) {

        //@ android UI elements
        UI android = new Android();
        UIComponentFactory componentFactory = android.getComponentFactory();

        componentFactory.createButton().displayButton();
        componentFactory.createMenu().displayMenu();
        componentFactory.createNavBar().displayNavBar();

        //@ ios UI elements
        UI ios = new ios();
        UIComponentFactory ioscomponentFactory = ios.getComponentFactory();

        ioscomponentFactory.createButton().displayButton();
        ioscomponentFactory.createMenu().displayMenu();
        ioscomponentFactory.createNavBar().displayNavBar();


    }
}
