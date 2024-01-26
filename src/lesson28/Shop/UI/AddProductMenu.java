package Shop.UI;

import Shop.DTO.ProductDto;
import Shop.DTO.ResponseForClientAddProduct;
import Shop.Service.ProductService;

import java.util.Scanner;

public class AddProductMenu implements MenuCommand{

    private final ProductService productService;

    public AddProductMenu(ProductService productService) {
        this.productService = productService;
    }


    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter name of product");
        String name = scanner.nextLine();
        System.out.println("Please, enter description of product");
        String description = scanner.nextLine();
        System.out.println("Please, enter price of product");
        Double price = scanner.nextDouble();

        ProductDto productDto = new ProductDto(name, price, description);
        ResponseForClientAddProduct AddCommandResult = productService.addNewProduct(productDto);
        System.out.println(AddCommandResult);


    }

    @Override
    public String getMenuName() {
        return "Add new product";
    }
}
