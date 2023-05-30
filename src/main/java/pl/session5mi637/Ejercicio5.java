package pl.session5mi637;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static <T extends Comparable<T>> List<T> mergeSets(List<T> set1, List<T> set2) {
        List<T> mergedSet = new ArrayList();

        int i = 0;
        int j = 0;


        while (i < set1.size() && j < set2.size()) {
            T element1 = set1.get(i);
            T element2 = set2.get(j);


            if (element1.compareTo(element2) <= 0) {
                mergedSet.add(element1);
                i++;
            } else {
                mergedSet.add(element2);
                j++;
            }
        }


        while (i < set1.size()) {
            mergedSet.add(set1.get(i));
            i++;
        }


        while (j < set2.size()) {
            mergedSet.add(set2.get(j));
            j++;
        }

        return mergedSet;
    }
}
