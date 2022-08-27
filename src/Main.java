
import java.util.regex.Pattern;

public class Main {

    public static void valid(String validate1, String validate2){
        if (!Pattern.matches("^[A-Za-z0-9+_.-]+$", validate1)){
            throw new WrongLoginException("Ошибка ввода в логине");
        }
        if (!Pattern.matches("^[A-Za-z0-9+_.-]+$", validate2)){
            throw new WrongPasswordException("Ошибка ввода в пароле");
        }
    }

    public static boolean chek(String login, String password, String confirmPassword) {
        valid(login, password);
        try {
            if (login.length() <= 20 && password.length() < 20 && password.equals(confirmPassword)) {
                return true;
            }
        } catch (RuntimeException a) {
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(chek("Dfgf_12213про", "012345", "012345"));

    }
}