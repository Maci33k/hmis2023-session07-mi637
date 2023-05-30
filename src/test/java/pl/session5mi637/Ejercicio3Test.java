package pl.session5mi637;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio3Test {
    @Test
    public void testHidePassword() {
        Ejercicio3 e = new Ejercicio3();

        assertEquals("Password is too short", e.hidePassword("123"));
        assertEquals("Password is too long", e.hidePassword("thisisaverylongpasswordthatexceedsthelengthlimit"));
        assertEquals("********", e.hidePassword("passw"));
        assertEquals("********", e.hidePassword("password"));
        assertEquals("********", e.hidePassword("abcdefgh"));
        assertEquals("************", e.hidePassword("password1234"));
        assertEquals("************", e.hidePassword("thisisalongpassword"));
    }

}