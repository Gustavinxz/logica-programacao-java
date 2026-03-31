import java.util.Scanner;
public class consumoXautonomia {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int continuar;
        do {
            double consumoMedio, distanciaViagem, combustivelAtual, capacidadeTanque;
            double autmax, autatual;
            String aviso;

            System.out.println("------------------------");
            System.out.println("  Consumo X Autonomia");
            System.out.println("------------------------");

            System.out.println("Informe a media de consumo do seu carro: ");
            consumoMedio = sc.nextDouble();
            System.out.println("Qual a capacidade do tanque do seu carro?: ");
            capacidadeTanque = sc.nextDouble();
            System.out.println("Quanto de combustível seu carro esta no momento?: ");
            combustivelAtual = sc.nextDouble();
            System.out.println("Quantos km você quer percorrer com seu carro?: ");
            distanciaViagem = sc.nextDouble();

            autmax = consumoMedio * capacidadeTanque;
            autatual = consumoMedio * combustivelAtual;

            if (autatual >= distanciaViagem) {
                aviso = "Você conseguirá completar a distância de " + distanciaViagem + "KM Sem precisar abastecer!";
            } else {
                aviso = "Você NÂO conseguirá completar a distância de " + distanciaViagem + "KM, vai ter que abastecer!";
            }

            System.out.println("------------------------");
            System.out.println("       Resultado");
            System.out.println("------------------------");

            System.out.println("A autonomia máxima do seu carro: " + autmax);
            System.out.println("A autonomia atual: " + autatual);
            System.out.println(aviso);

        System.out.println("Deseja fazer outro consumo? 1 - Sim / 2 - Não");
        continuar = sc.nextInt();
        }while(continuar==1);
        sc.close();
    }
}
