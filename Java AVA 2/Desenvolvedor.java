public class Desenvolvedor extends Funcionario
{
    private String linguagem;
    
    Desenvolvedor(String nome, double salario, String linguagem)
    {
        super(salario, nome);
        this.linguagem=linguagem;
    }
    
    public String getLinguagem()
    {
        return (linguagem);
    }
    
    public void setLinguagem(String linguagem)
    {
        this.linguagem=linguagem;
    }
    
    @Override
    void exibirDados()
    {
        super.exibirDados();
        System.out.println("Linguagem: "+linguagem);
    }
}
