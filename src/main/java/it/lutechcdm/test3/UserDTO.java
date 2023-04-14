package it.lutechcdm.test3;

import java.util.Date;
import java.util.List;

public record UserDTO(String name, String lastName, int age, List<String> hobbies) {
}
