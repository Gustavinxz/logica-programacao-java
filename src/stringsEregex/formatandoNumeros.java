package stringsEregex;
import java.util.Scanner;
public class formatandoNumeros {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("     Formatando Números");
        System.out.println("-----------------------------");

        System.out.println("Digite um número (ex: 1,11111): ");
        double numero = sc.nextDouble();

        String valorFormatado = String.format("R$ %.2f",numero);
        System.out.println("Número formatado: "+valorFormatado);

        sc.close();
    }
}
