package lexicon.se;

import java.sql.Array;
import java.util.Arrays;

public class Repository {

    public static int getSize() {

        int[] a = new int[8];
        a[0] = 3;
        a[2] = 6;

        System.out.println(a[2]); // 6

        for (int i = 0; i < 8; i++)
            System.out.println(a[i]);

        for (int j = 0; j < a.length; j++);
        System.out.println(a[a.length]);
    }


    public static void setNames(String[] names) {
        String[] name = new String[5];
        names[0] = "Ali";
        System.out.println(names[0]);

        System.out.println(names);
    }

    public static void clear() {
     Array .Splice(A.array.length);
    int [] a ={12,5,7,83,25};

    }

    public static String[] findAll() {


        String[] findAll = new String[4];
        findAll[0] = " Ali";
        findAll[2] = " Ulf";
        System.out.println(findAll[2]); // Ulf
    }
}
















