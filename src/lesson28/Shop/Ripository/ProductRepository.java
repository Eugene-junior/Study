package Shop.Ripository;

import Shop.DTO.ProductDto;
import Shop.Entity.Product;

import java.util.List;

public interface ProductRepository {


    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);
    boolean deleteById(Integer id);





}
