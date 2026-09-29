package biblioteca;

public class Test3 {
    public static void main(String[] args) {
        int[][] prueba = basicas.fillFromKeyboard(2, 2);
        int traza = basicas.trace(prueba);
        System.out.println("La traza es " + traza);
        boolean simetrica = basicas.esSimetrica(prueba);
        System.out.println("Es simetrica: " + simetrica);
    }
}
