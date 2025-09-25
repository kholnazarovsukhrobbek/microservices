package transaction.model.dto;


import lombok.Getter;
import lombok.Setter;
import transaction.enums.TransactionStatusEnum;

@Getter
@Setter
public class TransactionStatusUpdateRequest {
    private TransactionStatusEnum status;
}

