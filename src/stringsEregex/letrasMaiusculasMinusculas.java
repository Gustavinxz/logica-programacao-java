package stringsEregex;
import java.util.Scanner;
public class letrasMaiusculasMinusculas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String texto;

        System.out.println("Digite um texto: ");
        texto = sc.nextLine();

        System.out.println("Maiúsculo: "+texto.toUpperCase());
        System.out.println("-------------------------------------");
        System.out.println("Minúsculo "+texto.toLowerCase());

        sc.close();
    }
}
