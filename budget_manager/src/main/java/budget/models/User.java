package budget.models;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Getter
    @Setter
    private int userId;

    @Setter
    @NotEmpty(message = "First name required")
    @Size(max = 50, message = "firstName must be shorter than 50 characters")
    private String firstName;

    @Getter
    @Setter
    @NotEmpty(message = "Last name required")
    @Size(max = 50, message = "lastName must be shorter than 50 characters")
    private String lastName;

    @Getter
    @Setter
    @NotEmpty(message = "Email required")
    @Email(message = "Invalid Email")
    @Size(max = 50, message = "email must be shorter than 50 characters")
    private String email;

    @Getter
    @Setter
    @NotEmpty(message = "Password required")
    private String password;
}