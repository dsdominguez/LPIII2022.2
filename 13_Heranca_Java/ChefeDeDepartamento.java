public class ChefeDeDepartamento extends Funcionario{
    private String departamento;
    private Data promocaoChefe;


    ChefeDeDepartamento(String nome, int id, Data nascm,
                        Data adm, double sal,
                        String dep, Data prom) {
        super(nome, id, nascm, adm, sal);
        departamento = dep;
        promocaoChefe = prom;
    }

    public String toString(){
        String resultado;

        resultado = super.toString();
        resultado += "\nDepartamento: "+departamento+"\n";
        resultado += "Data de promoçao ao cargo: "+promocaoChefe.toStringLong();

        return resultado;
    }

    public String getDepartamento(){
        return departamento;
    }

}
