package contacts;

import lombok.Data;

@Data
public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
}