package base;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    final static String[] months = {"Janeiro", "Fevereiro", "Março", "Abril",
                                    "Maio", "Junho", "Julho", "Agosto",
                                    "Setembro", "Outubro", "Novembro", "Dezembro"};
    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    public Data(int dia, int mes, int ano){
        if (verificaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 1900;
        }
    }

    private boolean verificaData(int dia, int mes, int ano){
        if (dia < 1 || dia > 31){
            return false;
        }else if (mes < 1 || mes > 12){
            return false;
        }else if (ano<1900)
            return false;
        return true;
    }

    public String toStringShort(){
       return dia+"/"+mes+"/"+ano;
    }

    public String toStringLong(){
        return dia+" de "+ months[mes-1] +" de "+ano;
    }

}
