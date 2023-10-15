public class Mucca {
    public void muglia() {
        System.out.println("Muuuu!");
    }

    public void mangia() {
        System.out.println("La mucca sta mangiando erba.");
    }

    public void dormi() {
        System.out.println("La mucca sta dormendo.");
    }
}


public class TestMucca {
    public static void main(String[] args) {
        Mucca mucca1 = new Mucca();
        Mucca mucca2 = new Mucca();

        mucca1.muglia();
        mucca1.mangia();
        mucca1.dormi();

        mucca2.muglia();
        mucca2.mangia();
        mucca2.dormi();
    }
}
