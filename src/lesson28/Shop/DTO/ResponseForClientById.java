package Shop.DTO;

import Shop.DTO.Errors.ErrorDto;

import java.util.List;

public class ResponseForClientById {

    private ProductForClient productForClients;
    private List<ErrorDto> errorDtoList;

    public ResponseForClientById(ProductForClient productForClients, List<ErrorDto> errorDtoList) {
        this.productForClients = productForClients;
        this.errorDtoList = errorDtoList;
    }

    public ProductForClient getProductForClients() {
        return productForClients;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientById{" +
                "productForClients=" + productForClients +
                ", errorDtoList=" + errorDtoList +
                '}';
    }


}
