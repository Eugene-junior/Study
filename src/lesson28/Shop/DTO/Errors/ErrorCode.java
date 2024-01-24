package Shop.DTO.Errors;

public enum ErrorCode {



    IE_500("Internal Server Error", 500),
    IE_400("Database error", 400),
    IE_413("Product name validation error", 413),
    IE_415("Product price validation error", 415);
    private String description;
    private Integer statusCode;

    ErrorCode(String description, Integer statusCode) {
        this.statusCode = statusCode;
        this.description = description;
    }


}
