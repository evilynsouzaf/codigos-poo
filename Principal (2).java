package com.mycompany.principal;

public class Principal {
      
    public static void main(String[] args) {
        Conta c1 = new Conta(1, 1, 1000.00); // Criando a conta 1 com 1000 reais
        Conta c2 = new Conta(1, 2, 800.00); // Criando a conta 2 com 890 reais
       
        // Operações
        c1.creditar(800.00); 
        //c1.debitar(900.00);  
        
        // Transferência : A conta c1 está transferindo 200 reais para a c2
        //c1.transferir(1500.00, c2); 
        
        System.out.println("Saldo conta C1: " + c1.getSaldo());
        System.out.println("Saldo conta C2: " + c2.getSaldo());
        
        System.out.println(c1.toString());
    }
}