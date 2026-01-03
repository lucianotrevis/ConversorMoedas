package com.br.conversor;

import com.br.conversor.ConversorService;

import java.util.Scanner;

public class ConversorApplication {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConversorService service = new ConversorService();
        int opcao = 0;

        String menu = """
                ******************************************
                Seja bem-vindo ao Conversor de Moedas!
                
                1) Dólar [USD]  -> Peso Argentino [ARS]
                2) Peso Argentino [ARS] -> Dólar [USD]
                3) Dólar [USD]  -> Real Brasileiro [BRL]
                4) Real Brasileiro [BRL] -> Dólar [USD]
                5) Dólar [USD]  -> Peso Colombiano [COP]
                6) Peso Colombiano [COP] -> Dólar [USD]
                7) Sair
                
                Escolha uma opção válida:
                ******************************************
                """;

        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                String de = "", para = "";
                switch (opcao) {
                    case 1 -> { de = "USD"; para = "ARS"; }
                    case 2 -> { de = "ARS"; para = "USD"; }
                    case 3 -> { de = "USD"; para = "BRL"; }
                    case 4 -> { de = "BRL"; para = "USD"; }
                    case 5 -> { de = "USD"; para = "COP"; }
                    case 6 -> { de = "COP"; para = "USD"; }
                }

                System.out.print("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();

                double taxa = service.getTaxa(de, para);
                double resultado = valor * taxa;

                System.out.printf("Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n",
                        valor, de, resultado, para);
            } else if (opcao != 7) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        System.out.println("Programa finalizado. Até logo!");
    }
}