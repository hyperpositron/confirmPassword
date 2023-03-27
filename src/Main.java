public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("12345678911234567892", "D_43tfre43_9", "D_43tfre43_9");
        if (result) {
            System.out.println("Логин и пароль введен правельно");
        } else {
            System.out.println("Логин введен правильно");
        }
    }
}
