package it.lutechcdm.test1;


/**
 * Il candidato dovrà correggere gli errori presenti in questo
 * design pattern di tipo singleton
 */
public class Singleton {

    private static Singleton singleton;

    public Singleton() {

    }

    public static Singleton getInstance() {
        if(singleton == null)
            singleton = new Singleton();

        return singleton;
    }
}
