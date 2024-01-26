package Shop.UI;

import Shop.DTO.ResponseForClientById;
import Shop.DTO.ResponseForClientDeleteByID;
import Shop.Service.ProductService;
import Shop.Service.UserInput.UserInput;

import java.util.Scanner;

public class DeleteByID implements MenuCommand{

    private final ProductService productService;

    public DeleteByID(ProductService productService) {
        this.productService = productService;
    }



    @Override
    public void executeCommand() {
        Integer idFroDelete = UserInput.getInt("Please enter product id for delete:");

        ResponseForClientDeleteByID deleteResult = productService.deleteById(idFroDelete);
        System.out.println(deleteResult);

    }

    @Override
    public String getMenuName() {
        return "Delete by ID";
    }
}
