package pl.session5mi637;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio2Test {

    @Test
    public void testCompruebaLoginEnBD() {
        Ejercicio2 login = new Ejercicio2();

        assertTrue(login.compruebaLoginEnBD("user", "pass"));
        assertFalse(login.compruebaLoginEnBD("user", "wrongpass"));
        assertFalse(login.compruebaLoginEnBD("wronguser", "pass"));
        assertFalse(login.compruebaLoginEnBD("wronguser", "wrongpass"));
    }

    @Test
    public void testLogin() {
        Ejercicio2 login = new Ejercicio2();

        assertTrue(login.login("user", "pass"));
        assertFalse(login.login("", "pass"));
        assertFalse(login.login("user", ""));
        assertFalse(login.login("user", "passmorethanthirtycharacters"));
        assertFalse(login.login("usermorethanthirtycharacters", "pass"));
    }

}