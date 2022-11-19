public class ExampleHerancaPessoa {
    public static void main(String[] args) {
        //Exemplo 1: Instancia e imprime dados da classe Pessoa (sem herança)
        Data dataNasc = new Data(30, 11, 1975);
        Pessoa pessoaSimple = new Pessoa("Jose Cuervo", 234517, dataNasc);
        System.out.println("PESSOA:\n"+pessoaSimple.toString()+"\n\n");

        //Exemplo 2: Instancia e imprime dados da classe Funcionario 
        //(herança de um nivel)
        /*Data dataAdm = new Data(18, 2, 2005);
        Funcionario pessoaFuncionario = new Funcionario("Jose Cuervo", 234517, dataNasc, dataAdm, 3500.00);
        System.out.println("FUNCIONARIO:\n"+pessoaFuncionario.toString()+"\n\n");*/

        //Exemplo 3: Instancia e imprime dados da classe ChefeDeDepartamento 
        //(herança de dois niveis)
        /*Data dataChefe = new Data(22, 3, 2018);
        ChefeDeDepartamento pessoaChefe = new ChefeDeDepartamento("Jose Cuervo", 
                                                                  234517, 
                                                                  dataNasc, 
                                                                  dataAdm, 
                                                                  3500.00, 
                                                                  "CCAM", 
                                                                  dataChefe
                                                                  );
        System.out.println("CHEFE DE DEPARTAMENTO:\n"+pessoaChefe.toString());*/
    }
}
