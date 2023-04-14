package it.lutechcdm.test3;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *  Il candidato dovrà completare l'implementazione dei due metodi:
 *  il metodo getUser dovrà ritornare una collection di UserDTO che dovranno essere costruiti a partire dalla lista di User in modo da rimuovere
 *  le informazioni sensibili (password, data di nascita) dall'oggetto di partenza. Per mappare il parametro age si può utilizzare il metodo getAge già disponibile
 *  o utilizzare un'altra modalità a scelta
 *  il metodo getUserByAge dovrà ritornare una collection di UserDTO contenente solo gli utenti con un età superiore a quella indicata nel parametro age
 */
public class CollectionManipulation2 {

    static Faker f = new Faker(new Random(69));

    public static List<User> users = List.of(newUser(), newUser(), newUser(), newUser(), newUser(), newUser(), newUser(), newUser(), newUser(), newUser(),
            newUser(), newUser(), newUser(), newUser(), newUser(), newUser(), newUser(), newUser());

    static User newUser() {
        return new User(f.name().name(),
                f.name().lastName(), f.internet().password(),
                f.date().birthday(1, 25), List.of(f.programmingLanguage().name(), f.music().instrument()));
    }

    public static Collection<UserDTO> getUser() {
        return null;
    }

    public static Collection<UserDTO> getUserByAge(int age) {
        return null;
    }

    static int getAge(User u) {
        Date dayOfBirth = u.dayOfBirth();
        return (int) ChronoUnit.YEARS.between(dayOfBirth.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate(), LocalDate.now());
    }
}
