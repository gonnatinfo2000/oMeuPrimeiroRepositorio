import java.util.Scanner;

public class Teste {

    public static int soma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um segundo número: ");
        int num2 = scanner.nextInt();
        int soma_numeros = soma(num1, num2);
        System.out.println("Soma:" + soma_numeros);
    }

}