package Shop.UI;

import Shop.DTO.ProductDto;
import Shop.DTO.ResponseForClientAddProduct;
import Shop.DTO.ResponseForClientFindAllProducts;
import Shop.Service.ProductService;

import java.util.Scanner;

public class FindAllProductsMenu implements MenuCommand{
    private final ProductService productService;

    public FindAllProductsMenu(ProductService productService) {
        this.productService = productService;
    }



    @Override
    public void executeCommand() {

        ResponseForClientFindAllProducts searchResult = productService.findAll();
        System.out.println(searchResult);
    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }
}
