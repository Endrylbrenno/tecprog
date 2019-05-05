package Trabalho1;

import javax.swing.JOptionPane;


public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    
    public String getNome(){
        return nome;
    }
    public  void setNome(String nome){
        this.nome = nome;
    }
    public int getNumero(){
        return numero;
    }
    public  void setNumero(int numero){
        this.numero = numero;
    }
    public  double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public  void depositar(double valor){
        saldo += valor;
    }
    public  void sacar(double valor){
        saldo -= valor;
    }
    public  void transferir(int conta1, int conta2, double valor){
        
    } 
    public  void tipoConta(){
        JOptionPane.showMessageDialog(null,"conta-comum");
    }    
    
}
