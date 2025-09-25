package transaction.model.dto;


import lombok.Getter;
import lombok.Setter;
import transaction.enums.TransactionStatusEnum;

import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionDTO {
    private String id;
    private String fromCardId;
    private String toCardId;
    private Long amount;
    private TransactionStatusEnum transactionStatus;
    private LocalDateTime createdDate;
}
