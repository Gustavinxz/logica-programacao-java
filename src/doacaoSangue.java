import java.util.Scanner;
public class doacaoSangue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade;
        double peso;

        System.out.println("---------------------------------");
        System.out.println("   Sistema de doação de sangue");
        System.out.println("---------------------------------");

        System.out.println("Digite a idade do doador: ");
        idade = sc.nextInt();
        System.out.println("Digite o peso do doador: ");
        peso = sc.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if(idadeValida && pesoValido ){
            System.out.println("O doador é compatível.");
        }else {
            System.out.println("O doador não é compatível. Motivo: ");
            if(!idadeValida){
                System.out.println("- o doador deve ter entre 18 e 65 anos.");
            }if(!pesoValido){
                System.out.println("- o doador deve pesar mais de 50 kg.");
            }
        }


    sc.close();
    }
}
