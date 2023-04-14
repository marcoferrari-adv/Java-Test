package it.lutechcdm.test3;

import java.util.Date;
import java.util.List;

public record User(String name, String lastName, String password, Date dayOfBirth, List<String> hobbies) {
}
