public class Passivo extends Conta
{
    private String[] dividas;
    private String[] obrigacoes;
    
    public Passivo(String nome, double saldo, String[] dividas, String[] obrigacoes)
    {
        super(nome, saldo);
        this.dividas = dividas;
        this.obrigacoes = obrigacoes;
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
