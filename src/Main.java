public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        boolean result = Validator.validate("teSt_1234", "D_43tfre43_9", "D_94jfgt432d_8");
        if (result) {
            System.out.println("Логин и пароль введен правельно");
        } else {
            System.out.println("Логин введен правильно");
        }
    }
}
}