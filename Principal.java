
import java.io.IOException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcao;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("*CONVERSOR DE MOEDA*\n");
            System.out.println("1) Dólar =>> Real brasileiro");
            System.out.println("2) Dólar =>> Peso argentino");
            System.out.println("3) Dólar =>> Peso colombiano");
            System.out.println("4) Dólar =>> Euro");
            System.out.println("5) Dólar =>> Rublo Russo");
            System.out.println("6) Dólar =>> Iene");
            System.out.println("7) Real brasileiro =>> Dólar");
            System.out.println("8) Peso argentino =>> Dólar");
            System.out.println("9) Peso colombiano =>> Dólar");
            System.out.println("10) Euro =>> Dólar");
            System.out.println("11) Rublo Russo =>> Dólar");
            System.out.println("12) Iene =>> Dólar");
            System.out.println("0) SAIR");
            System.out.println("\nEscolha uma opção válida: ");
            System.out.println("--------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();
            if (opcao == 0) {
                System.out.println("Saindo do programa...");
                break;
            }
            OpcoesDeMoedas opcoes = new OpcoesDeMoedas();
            String moeda = opcoes.escolha(opcao);
            System.out.println("Informe o valor que deseja converter: ");
            double valorEscolhido = sc.nextDouble();
            System.out.println(moeda);

            Conversao conversao = new Conversao();
            System.out.println(conversao.conversao(opcao, moeda, valorEscolhido));

        } while (opcao != 0);


    }
}
