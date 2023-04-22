import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        int num1 = 1, num2 = 0;
        int n, i=0;
        boolean existeNaSequencia = false;

        System.out.println("Digite um número: ");
        Scanner numero = new Scanner(System.in);
        n = numero.nextInt();

        while (i <= n){
            if (num1 == n || n == 0) {
                existeNaSequencia = true;
                break;
            }else{
                existeNaSequencia = false;
            }

            num1 = num1 + num2;
            num2 = num1 - num2;
            i++;
        }

        if (existeNaSequencia) {
            System.out.println("O número faz parte da sequência de Fibonacci.");
        }else{
                System.out.println("O número NÃO faz parte da sequência de Fibonacci");
        }

    }
}
