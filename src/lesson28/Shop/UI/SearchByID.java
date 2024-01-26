package Shop.UI;

import Shop.DTO.ResponseForClientById;
import Shop.Service.ProductService;

import java.util.Scanner;

public class SearchByID implements MenuCommand {
    private final ProductService productService;

    public SearchByID(ProductService productService) {
        this.productService = productService;
    }


    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write ID of product you are looking for");
        Integer searchID = scanner.nextInt();
        ResponseForClientById responseID = productService.findById(searchID);
        System.out.println(responseID);
    }

    @Override
    public String getMenuName() {
        return "Search by ID";
    }
}
