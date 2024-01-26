package Shop.App;

import Shop.Ripository.ProductRepository;
import Shop.Ripository.ProductRepositoryArrayList;
import Shop.Service.ProductService;
import Shop.Service.Validation;
import Shop.UI.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {

        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();
        ProductService service = new ProductService(repository, validation);

        AddProductMenu addProductMenu = new AddProductMenu(service);
        FindAllProductsMenu findAllProductsMenu = new FindAllProductsMenu(service);
        SearchByID searchByID = new SearchByID(service);
        DeleteByID deleteByID = new DeleteByID(service);
        ExitMenu exitMenu = new ExitMenu();

        List<MenuCommand> commands = new ArrayList<>();
        commands.add(addProductMenu);
        commands.add(findAllProductsMenu);
        commands.add(searchByID);
        commands.add(deleteByID);
        commands.add(exitMenu);


        UserMenu UI = new UserMenu(commands);
        UI.startUserMenu();









    }
}
