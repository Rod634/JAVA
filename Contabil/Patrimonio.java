public class Patrimonio extends Conta
{
   private String[] proprios;
   
   public Patrimonio(String nome, double saldo, String[] proprios)
   {
       super(nome, saldo);
       this.proprios = proprios;
   }
   
}
