package pl.session5mi637;

public class Ejercicio2 {

    public boolean compruebaLoginEnBD
            (String username, String password){
// método mock (simulado)
        if (username.equals("user") && password.equals("pass"))
            return true;
        else
            return false;
    }

    public boolean login (String username, String password){
        if (username.length() != 0 && password.length() != 0 && username.length() < 30
            && password.length() < 30)
        return compruebaLoginEnBD(username, password);
        else
            return false;
    }

}
