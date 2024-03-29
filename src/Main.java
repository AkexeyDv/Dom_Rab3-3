import java.util.regex.Pattern;

public class Main {
    static final Pattern pattern = Pattern.compile("(\\w){1,20}");

    public static void main(String[] args) {
        String login = "Abfbf_erer";
        String password = "Qwerty123";
        String confirmPassword = "Qwerty123";

        try {
            checkAccount(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkAccount(String login, String password, String confimPassword) throws IllegalArgumentException {

        if (!pattern.matcher(login).matches()) {
            throw new WrongLoginException("Формат логина неверен");
        }
        if (!pattern.matcher(password).matches()) {
            throw new WrongPasswordException("Формат пароля неверен");
        }
        if (!password.equals(confimPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}