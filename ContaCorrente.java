/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author alunolab11
 */
public class ContaCorrente extends Conta
    private double limite; // Limite é um atributo específico Conta Corrente, pois esse atributo sótem em contas correntes, não é um atributo herdado da classe Conta
	
public ContaCorrente() { //método construtor

}

public ContaCorrente(int agencia, int agencia, double saldo, double limite){
    super(agencia, numero, saldo);
    this.limite = limite;

}
