package Shop.UI;

public class ExitMenu implements MenuCommand{
    @Override
    public void executeCommand() {
        System.out.println("Good bye!");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit";
    }
}
