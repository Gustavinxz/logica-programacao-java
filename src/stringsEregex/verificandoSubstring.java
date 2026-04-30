package stringsEregex;
import java.util.Scanner;
public class verificandoSubstring {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("Encontrando palavras no texto");
        System.out.println("-----------------------------");

        System.out.println("Digite seu texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite a palavra que deseja encontrar: ");
        String palavras = sc.nextLine();

        if(texto.contains(palavras)){
            System.out.println("A palavra "+palavras+" está no texto.");
        }else{
            System.out.println("A palavra "+palavras+" Não está no texto.");
        }
        sc.close();
    }
}
