package Strategy;

import java.util.Scanner;

public class Reportar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DadosBancarios.titular = "Nayton";
		DadosBancarios.endereco = "Rua Eufrates, 1";
		DadosBancarios.email = "naytonwilkerson@.com";
		DadosBancarios.banco = "Itau";
		DadosBancarios.agencia = "321";
		DadosBancarios.conta = "133456-7";
		DadosBancarios.saldo = 5500.38;
		DadosBancarios.fone = "34-99233-5567";
		DadosBancarios.data = "09/05/2019";

		System.out.println();
		System.out.printf("Qual relatório você deseja?             \n");
		System.out.println();
		System.out.printf("1 - Relatório Simples                   \n");
		System.out.printf("2 - Relatório Completo                  \n");
		System.out.println();
		int escolha = sc.nextInt();

		if (escolha == 1) {
			System.out.println();
			System.out.printf("Banco: %33s\n", DadosBancarios.banco);
			System.out.println();
			System.out.printf("Titular: %31s\n", DadosBancarios.titular);
			System.out.printf("Saldo: %33s\n", DadosBancarios.saldo);
			System.out.println();
			System.out.printf("Telefone: %30s\n", DadosBancarios.fone);
			System.out.println();

		} else if (escolha == 2) {
			System.out.println();
			System.out.printf("Banco: %33s\n", DadosBancarios.banco);
			System.out.printf("Endereço: %30s\n", DadosBancarios.endereco);
			System.out.printf("Telefone: %30s\n", DadosBancarios.fone);
			System.out.println();
			System.out.printf("Titular: %31s\n", DadosBancarios.titular);
			System.out.printf("Agencia: %31s\n", DadosBancarios.agencia);
			System.out.printf("Conta: %33s\n", DadosBancarios.conta);
			System.out.printf("Saldo: %33s\n", DadosBancarios.saldo);
			System.out.println();
			System.out.printf("E-mail: %32s\n", DadosBancarios.email);
			System.out.printf("Data: %34s\n", DadosBancarios.data);
			System.out.println();
		}

		sc.close();
	}
}
