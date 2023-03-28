public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("tqsqw1234_", "1478221", "147822");
        if (result) {
            System.out.println("Логин и пароль введен правельно");
        } else {
            System.out.println("Логин введен правильно");
        }
    }
}
