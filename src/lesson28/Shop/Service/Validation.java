package Shop.Service;

import Shop.DTO.Errors.ErrorCode;
import Shop.DTO.Errors.ErrorDto;
import Shop.DTO.ProductDto;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    public List<ErrorDto> validate(ProductDto productDto) {
        List<ErrorDto> errors = new ArrayList<>();
        if (productDto.getProductName() == null) {
            ErrorDto errorDto = new ErrorDto(ErrorCode.IE_413, "Product can not be null");
            errors.add(errorDto);
        }
        if (productDto.getProductName().trim().length() < 3 || productDto.getProductName().trim().length() > 10) {
            ErrorDto errorDto = new ErrorDto(ErrorCode.IE_415, "Product name must have more than 3 and less than 10 letters");
            errors.add(errorDto);

        }
        if (productDto.getPrice() == null || productDto.getPrice() <= 0) {
            ErrorDto errorDto = new ErrorDto(ErrorCode.IE_415, "Product price can not be null and must bigger than 0");
            errors.add(errorDto);


        }
        return errors;
    }
}