package facade;

/**
 * Класс-Facade для класса BinOps
 */
public class BinOpsFacade {
    private BinOps binOps = new BinOps();

    public String sumAndMult(String a, String b) {
        return "Сумма чисел в двоичной системе: " + binOps.sum(a, b) +
               "\nПроизведение чисел в двоичной системе: " + binOps.mult(a, b);
    }
}

