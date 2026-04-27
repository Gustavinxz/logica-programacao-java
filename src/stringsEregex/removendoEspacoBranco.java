package stringsEregex;
import java.util.Scanner;
public class removendoEspacoBranco {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String nome, nomeFormatado;

     System.out.println("Digite seu nome: ");
     nome = sc.nextLine();

     nomeFormatado = nome.trim();
     System.out.println("Nome sem espaços: " +nomeFormatado);

     sc.close();
    }
}
