public class Conta
{
  protected String nome;
  protected double saldo;
  
  public Conta(String nome, double saldo)
  {
      this.nome = nome;
      this.saldo = saldo;
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
