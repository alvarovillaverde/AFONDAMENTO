package biblioteca;

public class Test4 {
    public static void main(String[] args) {
        int[][] prueba = basicas.fillFromKeyboard(2, 2);
        System.out.println("Es diagonal su traza: " + basicas.verificarFueraDiagonal(prueba));
    }
}
