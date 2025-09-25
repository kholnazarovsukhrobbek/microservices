package profile.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


import lombok.Getter;
import lombok.Setter;
import profile.model.dto.card.CardDTO;
import profile.model.dto.transaction.NotificationDTO;


import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileDetailDTO {
    private String id;

    private String name;
    private String surname;
    private String phoneNumber;
    private List<CardDTO> cardList;
    private List<NotificationDTO> notificationList;
}
