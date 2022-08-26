public class Main {

    public static boolean chek(String login, String password, String confirmPassword) {

        if (login.length() > 20 ){
            throw new WrongLoginException("В логине слишком много симловов");
        }
        if (password.length() >= 20 || password.equals(confirmPassword) == false){
            throw new WrongPasswordException("Пароль не совпадает или много символов");
        }

        try {
            if (login.length() <= 20 && password.length() < 20 && password.equals(confirmPassword)){
                 return true;
            }
        } catch (WrongLoginException a) {
            return false;
        }
        catch (WrongPasswordException e) {
             return false;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(chek("Dfgf_12213", "0123450000", "012345"));
    }
}