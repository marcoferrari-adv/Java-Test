package it.lutechcdm.test3;

import java.util.Collection;
import java.util.List;

/**
 *  Il candidato dovrà completare l'implementazione dei due metodi:
 *  il metodo getUniqueCollection dovrà ritornare una collection univoca dei valori presenti nella variable list
 *  il metodo getUniqueAlphabeticReversedCollection dovrà ritornare una collection univoca dei valori della variabile list
 *  ordinati in ordine alfabetico contrario e.s. D, C, B, A
 */
public class CollectionManipulation1 {

    public static List<String> list = List.of("B", "A", "C", "D", "A", "E", "B");

    public static Collection<String> getUniqueCollection() {
        return list;
    }

    public static Collection<String> getUniqueAlphabeticReversedCollection() {
        return list;
    }
}
