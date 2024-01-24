package Shop.App;

import Shop.Ripository.ProductRepository;
import Shop.Ripository.ProductRepositoryArrayList;
import Shop.Service.ProductService;
import Shop.Service.Validation;
import Shop.UI.AddProductMenu;
import Shop.UI.FindAllProductsMenu;

public class ShoppingListApp {
    public static void main(String[] args) {

        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();
        ProductService service = new ProductService(repository, validation);

        AddProductMenu addProductMenu = new AddProductMenu(service);
        FindAllProductsMenu findAllProductsMenu = new FindAllProductsMenu(service);









    }
}
