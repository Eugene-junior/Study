package Shop.Ripository;

import Shop.DTO.ProductDto;
import Shop.Entity.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductRepositoryArrayList implements ProductRepository{

    private List<Product>dataBase;
    private Integer idCounter;

    public ProductRepositoryArrayList() {
        this.dataBase = new ArrayList<>();
        this.idCounter = 0;
    }

    @Override
    public Integer addProduct(ProductDto productDto) {
        idCounter++;
        dataBase.add(new Product(idCounter, productDto.getProductName(), productDto.getPrice(), productDto.getDescription()));
        return idCounter;
    }

    @Override
    public List<Product> findAll() {
        return dataBase;
    }

    @Override
    public Product findById(Integer id) {
        for (Product currentProduct : dataBase)
            if (currentProduct.getId().equals(id)){
                return currentProduct;
        }return null;


        }

    @Override
    public boolean deleteById(Integer id) {
        Iterator<Product> iterator = dataBase.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if (product.getId().equals(id)){
                iterator.remove();
                return true;
            }
        }

        return false;
    }


}

