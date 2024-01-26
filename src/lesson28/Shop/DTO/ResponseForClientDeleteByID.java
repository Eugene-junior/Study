package Shop.DTO;

import Shop.DTO.Errors.ErrorDto;

import java.util.List;

public class ResponseForClientDeleteByID {

    private boolean DeleteStatus;
    List<ErrorDto> errorDtoList;

    public ResponseForClientDeleteByID(Boolean deleteStatus, List<ErrorDto> errorDtoList) {
        DeleteStatus = deleteStatus;
        this.errorDtoList = errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientDeleteByID{" +
                "DeleteStatus=" + DeleteStatus +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
