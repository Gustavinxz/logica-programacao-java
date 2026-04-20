package ForWhile;
import java.util.Scanner;
import java.util.ArrayList;
public class listaConvidados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> convidados = new ArrayList<>();

        System.out.println("--------------------------");
        System.out.println("  Lista de Convidados ");
        System.out.println("--------------------------");

        while (true){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String nome = sc.nextLine();
            if(nome.equalsIgnoreCase("sair")){
                System.out.println("Lista encerrada.");
                break;
            }else if(nome.equalsIgnoreCase("ver")){
                System.out.println(" convidados: "+convidados);
            } else{
                boolean jaExiste = false;
                for (String convidado : convidados){
                    if(convidado.equalsIgnoreCase(nome)){
                        jaExiste = true;
                        break;
                    }
                } if (jaExiste){
                    System.out.println("O nome "+nome+" ja esta na lista.");
                }else {
                    convidados.add(nome);
                    System.out.println(nome+" Adicionado com sucesso");
                }
            }
        }
        sc.close();
    }
}
