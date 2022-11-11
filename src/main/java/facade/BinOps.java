package facade;

/**
 * Класс-Facade
 */
public class BinOps {

    /**
     * Метод производит перехват чисел из двоичной записи в
     * строках в int, их сложение и перевод
     * обратно в двоичную запись
     */
    public String sum(String a, String b) {
        if (validationForArguments(a, b)) {
            return "Не удалось произвести суммирование";
        } else {
            int arg1 = Integer.parseInt(a, 2);
            int arg2 = Integer.parseInt(b, 2);
            int resultSum = arg1 + arg2;
            return Integer.toBinaryString(resultSum);
        }
    }

    /**
     * Метод производит перехват чисел из двоичной записи в
     * строках в int, их умножение и перевод
     * обратно в двоичную запись
     */
    public String mult(String a, String b) {
        if (validationForArguments(a, b)) {
            return "Не удалось произвести умножение";
        } else {
            int arg1 = Integer.parseInt(a, 2);
            int arg2 = Integer.parseInt(b, 2);
            int resultMult = arg1 * arg2;
            return Integer.toBinaryString(resultMult);
        }
    }

    private boolean validationForArguments(String a, String b) {
        if (a.startsWith("-") || b.startsWith("-")) {
            System.out.println("Нет возможности переводить отрицательные двоичные числа!");
            return true;
        } else if (a.isBlank() || b.isBlank()) {
            System.out.println("В аргументы метода переданы пустые данные!");
            return true;
        } else return false;
    }
}
