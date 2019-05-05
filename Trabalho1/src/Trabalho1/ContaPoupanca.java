package Trabalho1;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Contas {
  Contas h = new Contas();
  private double taxa;
    
    public  void setTaxa(double taxa){
        this.taxa = taxa;
    } 
    public  double getTaxa(){
        return taxa;
    } 
    public  void reajustar(double taxa){
        h.setSaldo(h.getSaldo() + h.getSaldo()*(taxa/100));
    }
    public  void reajustar(){
        h.setSaldo(h.getSaldo() + h.getSaldo()*0.1);
    } 
     public  void tipoConta(){
        JOptionPane.showMessageDialog(null,"Conta Poupança");
    } 
}
