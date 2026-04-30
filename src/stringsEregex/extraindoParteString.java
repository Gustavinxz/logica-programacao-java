package stringsEregex;
import java.util.Scanner;
public class extraindoParteString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String arquivo = sc.nextLine();

        int posicaPonto = arquivo.lastIndexOf(".");
        if(posicaPonto != -1){
            String nomeSemExtensao = arquivo.substring(0, posicaPonto);
            System.out.println("Nome do arquivo sem extensão: "+nomeSemExtensao);
        }else{
            System.out.println("O arquivo não possui extensão.");
        }

    sc.close();
    }
}
