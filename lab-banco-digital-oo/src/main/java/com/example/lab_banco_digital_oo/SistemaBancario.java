package com.example.lab_banco_digital_oo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SistemaBancario {
  private List<Banco> bancos = new ArrayList<>();

  public SistemaBancario(List<Banco> bancos) {
    this.bancos = bancos;
  }

  public void addBanco(Banco banco) {
    this.bancos.add(banco);
  }

  public Banco getBancoPorNome(String nome) {
    for (Banco banco : bancos) {
      if (banco.getNome().equalsIgnoreCase(nome)) {
        return banco;
      }
    }
    return null;
  }

}
