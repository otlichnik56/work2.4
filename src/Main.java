
import java.util.regex.Pattern;

public class Main {

    private static void valid(String validate1, String validate2) throws Exception{
        if (!Pattern.matches("^\\w+$", validate1)){
            throw new WrongLoginException("Ошибка ввода в логине");
        }
        if (!Pattern.matches("^\\w+$", validate2)){
            throw new WrongPasswordException("Ошибка ввода в пароле");
        }
    }

    private static boolean chek(String login, String password, String confirmPassword) throws Exception{

        try {
            valid(login, password);
            if (login.length() <= 20 && password.length() < 20 && password.equals(confirmPassword)) {
                return true;
            }
        } catch (RuntimeException a) {
            return false;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(chek("Dfgf_12213", "012345", "012345"));

    }
}