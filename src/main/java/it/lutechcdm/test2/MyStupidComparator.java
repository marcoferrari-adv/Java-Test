package it.lutechcdm.test2;

/**
*Il candidato dovrà correggere il potenziale bug presente nel metodo compareWithConst
*/
public class MyStupidComparator {

    private static final String THE_VALUE = "420";

    public static boolean compareWithConst(String value) {
        return value.equals(THE_VALUE);
    }


}
