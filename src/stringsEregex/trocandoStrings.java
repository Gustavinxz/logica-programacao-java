package stringsEregex;
import java.util.Scanner;
public class trocandoStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int continuar;

        do {

          String texto, novaPalavra, palavraAlvo, textoModificado;

          System.out.println("-----------------------------");
          System.out.println("     Remodelando Texto");
          System.out.println("-----------------------------");

          System.out.println("Digite seu texto: ");
          texto = sc.nextLine();
          System.out.println("Digite o que você quer substituir: ");
          palavraAlvo = sc.nextLine();

          if (texto.contains(palavraAlvo)) {
              System.out.println("Digite a nova palavra: ");
              novaPalavra = sc.nextLine();

              textoModificado = texto.replace(palavraAlvo, novaPalavra);
              System.out.println("Novo texto: " + textoModificado);
          } else {
              System.out.println("Não foi encontrado a palavra " + palavraAlvo);
              break;
          }

          System.out.println("Deseja tentar outro texto?: 1 - Sim / 2 - Não");
            continuar = Integer.parseInt(sc.nextLine());
      }while (continuar == 1);
        sc.close();
    }
}
