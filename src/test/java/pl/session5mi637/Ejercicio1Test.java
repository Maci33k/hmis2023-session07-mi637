package pl.session5mi637;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio1Test {




        @Test
        public void testTransform() {
            Ejercicio1 transform = new Ejercicio1();

            // Test case 1:
            int result = transform.transformar(4);
            assertEquals(1, result);

            // Test case 2:
            result = transform.transformar(9);
            assertEquals(1, result);

            // Test case 3:
            result = transform.transformar(25);
            assertEquals(1, result);

            // Test case 4:
            result = transform.transformar(7);
            assertEquals(7, result);

            // Test case 5:
            result = transform.transformar(30);
            assertEquals(1, result);

            // Test case 6: x is 0
           // result = transform.transformar(0);
           // assertEquals(0, result);

            // Test case 7: x is 1
            result = transform.transformar(1);
            assertEquals(1, result);
        }




    }

