public class Veiculo
{
    private int massa;
    private String cor;
    Veiculo(){}
    Veiculo(int massa,String cor)
    {
        this.massa=massa;
        this.cor=cor;
    }
    
    void setCor(String cor)
    {
        this.cor=cor;
    }
    
    void setMassa(int massa)
    {
        this.massa=massa;
    }
    
    int getMassa()
    {
        return(massa);
    }
    
    String getCor()
    {
        return(cor);
    }
}
