import facade.BinOps;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();

        try {
            System.out.println(bins.sum("1000", "10"));
            System.out.println(bins.mult("111", "1001"));
        } catch (NullPointerException e) {
            throw new RuntimeException("В аргументы метода передан null!");
        }
    }
}
