package pl.session5mi637;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Ejercicio5Test {

    @Test
    public void testMergeSets() {

        List<Integer> set1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> set2 = Arrays.asList(2, 4, 6, 8);


        List<Integer> mergedSet = Ejercicio5.mergeSets(set1, set2);


        List<Integer> expectedSet = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);


        assertEquals(expectedSet, mergedSet);
    }

    @Test
    public void testMergeSetsWithEmptySets() {

        List<Integer> set1 = new ArrayList();
        List<Integer> set2 = new ArrayList();


        List<Integer> mergedSet = Ejercicio5.mergeSets(set1, set2);


        List<Integer> expectedSet = new ArrayList();


        assertEquals(expectedSet, mergedSet);
    }

    @Test
    public void testMergeSetsWithOneEmptySet() {

        List<Integer> set1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> set2 = new ArrayList();


        List<Integer> mergedSet = Ejercicio5.mergeSets(set1, set2);


        List<Integer> expectedSet = Arrays.asList(1, 3, 5, 7);


        assertEquals(expectedSet, mergedSet);
    }

    @Test
    public void testMergeSetsWithDuplicateElements() {

        List<Integer> set1 = Arrays.asList(1, 3, 5, 5, 7);
        List<Integer> set2 = Arrays.asList(2, 4, 5, 6, 8);


        List<Integer> mergedSet = Ejercicio5.mergeSets(set1, set2);


        List<Integer> expectedSet = Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8);


        assertEquals(expectedSet, mergedSet);
    }

}