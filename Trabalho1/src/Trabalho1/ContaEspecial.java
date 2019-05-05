
package Trabalho1;

import javax.swing.JOptionPane;


public class ContaEspecial extends Contas {
    Contas x = new Contas();
    private double limite;
    private double multa;
    
    
     public  void setLimite(double limite){
            this.limite = limite;
        }
      public  double getLimite(){
            return limite;
        }
    public  void setMulta(double multa){
            this.multa = multa;
        }
     public  double getMulta(){
            return multa;
        }
    public  void descontar(double multa){
            x.setSaldo(x.getSaldo()- multa);
        }
     public  void tipoConta(){
        JOptionPane.showMessageDialog(null,"Conta Poupança");
    } 
}
