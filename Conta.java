/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

public class Conta { //criando a classe
    private int agencia, numero;
    private double saldo;
    
    // Construtor vazio
    Conta() {
    }
  
    // Construtor completo
    Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    void creditar (double valor){
	if(valor > 0){
            saldo = saldo + valor;

        }
        else {
            System.out.println("Valor inválido.");
        }
}

    boolean debitar (double valor) {
	if(valor > 0 && valor <= saldo){
            saldo = saldo - valor;

            return true;
		}
	
	else {
		System.out.println("Saldo Insuficiente");
            return false;
	}
    }

// A transferência fazemos 2 operções: debito da minha conta pra creditar em outra, porém para isso ocorrer, é preciso verificar primeiro se há saldo na conta, e se nÃO TIVER SALDO, a operação de crédito NÃO DEVE OCORRER.
// Agora a transferência, usamos o método de débito já pronto.

    void transferir (double valor, Conta destino){//criei uma variável do tipo Conta com o nome destino
	if (debitar(valor)) {
            destino.creditar(valor);

	}
	else {
            System.out.println("Transferência negada");
	}
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}