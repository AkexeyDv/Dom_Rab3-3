import java.util.regex.Pattern;

public class Validator {
    private static final Pattern pattern = Pattern.compile("(\\w){1,20}");

    public static void checkAccount(String login, String password, String confimPassword) throws InterruptedException {

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
