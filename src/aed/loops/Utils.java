package aed.loops;

public class Utils {
    public static int maxNumRepeated(Integer[] a, Integer elem) {
        if (elem == null || a == null) throw new IllegalArgumentException(); //Ni el array a ni elem pueden ser null
        int consecutivosMax = 0;// Máximo nº de veces que ha salido repetido de forma consecutiva
        int consecutivos= 0;// Cuenta de repetidos
        for (int i = 0; i < a.length; i++) {
            if (elem.equals(a[i])) {//Si el elemento i de a es igual al elem
                consecutivos++;
                if(consecutivos >= consecutivosMax) consecutivosMax = consecutivos;
            }
            else consecutivos = 0;
        }
        return consecutivosMax;
    }
}