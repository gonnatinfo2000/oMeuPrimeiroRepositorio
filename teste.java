import java.util.Scanner;

public class Teste {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um primeiro n�mero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um segundo n�mero: ");
        int num2 = scanner.nextInt();
        int soma_numeros = num1 + num2;
        System.out.println("Soma:" + soma_numeros);
    }

}