public class Ativo extends Conta
{
    private String[] aplicacoes;
    private String[]bens;
    
    public Ativo(String nome, double saldo, String[] aplicacoes, String[] bens)
    {
        super(nome, saldo);
        this.aplicacoes = aplicacoes;
        this.bens = bens;
    }
    
    public void debitar(double saldo)
    {
        if(saldo > 0)
            this.saldo += saldo;
    }
    
    public void creditar(double saldo)
    {
        if(saldo > 0 && this.saldo > 0)
            this.saldo -= saldo;
    }
    
}
