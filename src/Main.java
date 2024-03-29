import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login;
        String password;
        String confirmPassword;

        login = "Abfbf_erer";
        password = "Qwerty123";
        confirmPassword = "Qwerty123";
        try {
            checkAccount(login, password, confirmPassword);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


    }

    public static void checkAccount(String login, String password, String confimPassword) throws WrongLoginPasswordException {
        Pattern pattern = Pattern.compile("(\\w){1,20}");
        Matcher matLog = pattern.matcher(login);
        Matcher matPass = pattern.matcher(password);
        if (!matLog.matches()) {
            throw new WrongLoginException("Формат логина неверен");
        }
        if (!matPass.matches()) {
            throw new WrongPasswordException("Формат пароля неверен");
        }
        if (!password.equals(confimPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }


    }


}