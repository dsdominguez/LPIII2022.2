public class Funcionario extends Pessoa{
    private Data admissao;
    private double salario;

    Funcionario(String nome, int id, Data nascm, Data adm, double sal) {
        //super(nome, id, nascm);
        super(nome, id, nascm);
        admissao = adm;
        salario = sal;
    }

    //private, protected, package
    @Override
    public String toString(){
        String resultado;
        resultado = super.toString()+"\n"; // chama o método toString da classe Pessoa.Pessoa
        resultado = resultado + "Data de admissao: "+admissao.toStringLong()+"\n";
        resultado = resultado + "Salário: R$ "+salario;

        return resultado;
    }

    final public double qualSalario(){
        return salario;
    }
}
