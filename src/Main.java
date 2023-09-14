import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int valor = 10;

        System.out.println("Variavel do tipo int : " + valor);

        byte meuByte = 127;

        System.out.println("meuByte = " + meuByte);

        short meuShort = 1000;

        System.out.println("meuShort = " + meuShort);


        long meuLong = 1000000000L;

        System.out.println("meuLong = " + meuLong);


        boolean meuBoolean = true;

        System.out.println("meuBoolean = " + meuBoolean);


        char meuChar = 'A';

        System.out.println("meuChar = " + meuChar);

        float meuFloat = 3.14f;

        System.out.println("meuFloat = " + meuFloat);
        Scanner scanner = new Scanner(System.in);

        double meuDouble = 3.14159265359;
        System.out.println("Insira o numero1: ");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o numero2: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + soma);


        int numero = scanner.nextInt();


        System.out.println("Numero: " + numero);

        System.out.println("Insira o numero3: ");
        int numero3 = scanner.nextInt();
        ;   System.out.println("Insira o numero4: ");
        int numero4 = scanner.nextInt();
        ;

        int dividir = numero3 / numero4;

        System.out.println("A divisão de " + numero3 + " e " + numero4 + " é igual a " + dividir);
        System.out.println("Insira o numero5: ");
        int numero5 = scanner.nextInt();
        System.out.println("Insira o numero6: ");
        int numero6 = scanner.nextInt();

        int multiplicar = numero5 * numero6;

        System.out.println("A multiplicação de " + numero3 + " e " + numero4 + " é igual a " + multiplicar);

        System.out.println("Insira o numero7: ");
        int numero7 = scanner.nextInt();
        System.out.println("Insira o numero8: ");
        int numero8 = scanner.nextInt();

        int subtrair = numero7 - numero8;

        System.out.println("A subtração de " + numero3 + " e " + numero4 + " é igual a " + subtrair);

        int par = scanner.nextInt();
        int impar = scanner.nextInt();


        scanner.close();
    }
}


