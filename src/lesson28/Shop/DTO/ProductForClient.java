package Shop.DTO;

public class ProductForClient {


    private String productName;

    private String description;

    public ProductForClient(String productName, String description) {
        this.productName = productName;
        this.description = description;
    }



    public String getProductName() {
        return productName;
    }



    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +

                ", productName='" + productName + '\'' +

                ", description='" + description + '\'' +
                '}';
    }
}


