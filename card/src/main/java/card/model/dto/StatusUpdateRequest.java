package card.model.dto;

import card.enums.CardStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusUpdateRequest {
    private CardStatus status;
}