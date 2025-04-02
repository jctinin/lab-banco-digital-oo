package com.example.lab_banco_digital_oo;

import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;


	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
