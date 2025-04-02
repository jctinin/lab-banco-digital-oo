package com.example.lab_banco_digital_oo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabBancoDigitalOoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabBancoDigitalOoApplication.class, args);

		System.out.println("=== Banco Digital ===");
		System.out.println("=== Digite (1) para continuar ===");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		while (opcao!= 8) {
			System.out.println("=== Menu ===");

			System.out.println("0 - Criar Banco");
			System.out.println("1 - Criar Conta Corrente");
			System.out.println("2 - Criar Conta Poupança");
			System.out.println("3 - Listar Contas");
			System.out.println("4 - Depositar");
			System.out.println("5 - Sacar");
			System.out.println("6 - Transferir");
			System.out.println("7 - Imprimir Extrato");
			System.out.println("8 - Sair");
			System.out.println("=== Fim do Programa ===");

			switch (scanner.nextInt()) {
				case 0:
					System.out.println("=== Criar Banco ===");
					System.out.println("Digite o nome do banco:");
					String nomeBanco = scanner.next();
					Banco banco = new Banco();
					banco.setNome(nomeBanco);
					System.out.println("Banco " + banco.getNome() + " criado com sucesso!");
					break;

				case 1:
					System.out.println("=== Criar Conta Corrente ===");
					System.out.println("Digite o nome do cliente:");
					String nomeCliente = scanner.next();
					Cliente cliente = new Cliente();
					cliente.setNome(nomeCliente);
					Conta contaCorrente = new ContaCorrente(cliente);
					banco.getContas().add(contaCorrente);
					System.out.println("Conta Corrente criada com sucesso para " + cliente.getNome() + "!");
					
					break;
				default:
					break;
			}
		}



	}

}
