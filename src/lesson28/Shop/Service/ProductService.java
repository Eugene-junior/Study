package Shop.Service;

import Shop.DTO.*;
import Shop.DTO.Errors.ErrorCode;
import Shop.DTO.Errors.ErrorDto;
import Shop.Entity.Product;
import Shop.Ripository.ProductRepository;
import Shop.Ripository.ProductRepositoryArrayList;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private final ProductRepository productRepository;
    private final Validation validation;

    public ProductService(ProductRepository productRepository, Validation validation) {
        this.productRepository = productRepository;
        this.validation = validation;
    }

    public ResponseForClientAddProduct addNewProduct(ProductDto productDto) {
        List<ErrorDto> errors = validation.validate(productDto);
        //first option=================
        //if(errors.isEmpty()){
        // Integer newId = productRepository.addProduct(productDto);
        // return new ResponseForClientAddProduct(newId, errors);
        // } else {
        // return new ResponseForClientAddProduct(0, errors);

        //second option ================== instead of "IF" we can use "?"
        Integer newId = errors.isEmpty() ? productRepository.addProduct(productDto) : 0;
        return new ResponseForClientAddProduct(newId, errors);
    }

    public ResponseForClientFindAllProducts findAll() {
        List<Product> products = productRepository.findAll();

        List<ErrorDto> errors = new ArrayList<>();
        List<ProductForClient> response = new ArrayList<>();
        for (Product product : products) {
            response.add(new ProductForClient(product.getProductName(), product.getDescription()));
        }
        if (products.isEmpty()) {
            errors.add(new ErrorDto(ErrorCode.IE_400, "Product list is empty"));
        }
        return new ResponseForClientFindAllProducts(response, errors);

    }

    public ResponseForClientById findById(Integer id) {
        List<ErrorDto> errorId = new ArrayList<>();
        Product productById = productRepository.findById(id);
        ProductForClient productForClient = new ProductForClient("","");

        if (productById != null) {
            productForClient = new ProductForClient(productById.getProductName(), productById.getDescription());
        } else {
            errorId.add(new ErrorDto(ErrorCode.IE_400, "Product with ID " + id + " no found"));

        }
        return new ResponseForClientById(productForClient, errorId);
    }

    public ResponseForClientDeleteByID deleteById(Integer id) {
        List<ErrorDto> errors = new ArrayList<>();
        boolean deleted = productRepository.deleteById(id);
        if (!deleted) {
            errors = List.of(new ErrorDto(ErrorCode.IE_400, "Product by ID: " + id + " not found"));
        }

        return new ResponseForClientDeleteByID(deleted, errors);
    }
}