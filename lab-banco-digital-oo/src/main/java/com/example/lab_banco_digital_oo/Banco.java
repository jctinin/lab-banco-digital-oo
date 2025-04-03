package com.example.lab_banco_digital_oo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public void addContas(Conta conta) {
		this.contas.add(conta);
	}

	public void listarContas() {
		System.out.println("=== Contas do banco " + this.nome + " ===");
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println();
	}

	public void addClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
	

}
