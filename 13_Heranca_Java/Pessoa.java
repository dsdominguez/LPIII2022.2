public class Pessoa{
    private String nome;
    private long id;
    private Data nascimento;

    Pessoa(String n, int i, Data d){
        nome = n;
        id = i;
        nascimento = d;
    }

    //Eliminar o public, erro de restrição na sobre-escrita de métodos
    //Modificar o nome do método, para verificar o resultado do método toString da classe object
    @Override
    public String toString(){
        String resultado;
        resultado = "Nome: "+nome+"\nIdentidade: "+id+"\n";
        if (this.nascimento != null)
               resultado += "Data de Nascimento: "+nascimento.toStringLong();
        
        //resultado = super.toString() + "\n" + resultado;
                
        return resultado;
   }

}
