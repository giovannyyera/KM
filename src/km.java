import java.util.Scanner;

public class km {
    public static void main(String[] args) {
        System.out.println("Insira o numero3: ");
        Scanner scanner = new Scanner(System.in);
        float numero3 = scanner.nextFloat();
        ;   System.out.println("Insira o numero4: ");
        float numero4 = 1000;
        ;

        float dividir = numero3 / numero4;

        System.out.println("O caminho que você irá fazer será " + numero3 + " metros e " + numero4 + " é igual a " + dividir + "KM");
    }
}
