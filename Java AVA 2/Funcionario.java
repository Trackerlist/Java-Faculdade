public class Funcionario
{
    private double salario;
    private String nome;
    Funcionario(){}
    Funcionario(double salario,String nome)
    {
        this.salario=salario;
        this.nome=nome;
    }
    
    void setNome(String nome)
    {
        this.nome=nome;
    }
    
    void setSalario(double salario)
    {
        this.salario=salario;
    }
    
    double getSalario()
    {
        return(salario);
    }
    
    String getNome()
    {
        return(nome);
    }
    
    void exibirDados()
    {
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+salario);
    }
}