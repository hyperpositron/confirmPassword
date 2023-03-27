// Создаем Класс RegexChecker 2-Я проверка через РЕГУЛЯРНЫЕ ВЫРАЖЕНИЯ
public class RegexChecker implements Checker{
    @Override
    public boolean isValid(String s) {
        return s.matches("^\\w+$");
    }
}
