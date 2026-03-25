public class Gerente extends Funcionario
{
    private double bonus;
    
    Gerente(String nome, double salario, double bonus)
    {
        super(salario, nome);
        this.bonus=bonus;
    }
    
    public double getBonus()
    {
        return (bonus);
    }
    
    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }
    
    @Override
    void exibirDados()
    {
        super.exibirDados();
        System.out.println("Bônus: "+bonus);
    }
}
