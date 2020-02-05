public class Patrimonio extends Conta
{
   private String[] proprios;
   
   public Patrimonio(String nome, double saldo, String[] proprios)
   {
       super(nome, saldo);
       this.proprios = proprios;
   }
   
   public void debitar(double saldo)
   {
       if(saldo > 0 && this.saldo > 0)
            this.saldo -= saldo;
   }
    
   public void creditar(double saldo)
   {
        if(saldo > 0)
            this.saldo += saldo;
   }
}
