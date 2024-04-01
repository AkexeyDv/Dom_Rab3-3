public class Main {


    public static void main(String[] args) throws InterruptedException {
        String login = "Abfbf_erer";
        String password = "Qwerty123";
        String confirmPassword = "Qwerty123";

        try {
            Validator.checkAccount(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());

        }
    }

}