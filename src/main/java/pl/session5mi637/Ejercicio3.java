package pl.session5mi637;

public class Ejercicio3 {
    public String hidePassword(String password) {
        if(password.length() < 5)
            return "Password is too short";

        if(password.length() >= 5 && password.length() <= 8)
            return "********";
        if(password.length() >= 12 && password.length() <= 40)
            return "************";
       else return "Password is too long";
    }
}
