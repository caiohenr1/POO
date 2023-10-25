package Aula04;

public class Aula04 {

    public static void main(String[] args) {

        Caneta caneta1 = new Caneta("Bic", 2.3, true);
        System.out.println(String.format("""
                MODELO: %s
                PONTA: %.1f
                TAMPADA?: %b
                """, caneta1.getModelo(), caneta1.getPonta(), caneta1.isTampada()));

    }

}
