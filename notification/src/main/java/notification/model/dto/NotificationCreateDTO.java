package notification.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationCreateDTO {
    @NotBlank(message = "Message required")
    private String message;
    @NotBlank(message = "PhoneNumber required")
    private String phoneNumber;
}
