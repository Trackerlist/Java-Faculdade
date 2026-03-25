public class MyClass {
    public static void main(String args[]) {
        Funcionario funcionario = new Funcionario(1621,"Rodrigo Silva");
        Gerente gerente=new Gerente("André",8001,2040);
        Desenvolvedor dev=new Desenvolvedor("Carlos",3300,"Rust");
        
        System.out.println("***FUNCIONÁRIO***");
        funcionario.exibirDados();
        
        System.out.println("***GERENTE***");
        gerente.exibirDados();
        
        System.out.println("***DESENVOLVEDOR***");
        dev.exibirDados();
    }
}
