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

}
