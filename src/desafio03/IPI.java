package desafio03;

public class IPI implements Imposto{

    @Override
    public Double calculaImposto(double valor) {

        if(valor < 25000) { // menor que 25.000
            return 0.05*valor;
        }else { // igual ou maior que 25.000
            return 0.1*valor;
        }
    }

    @Override
    public String toString() {
        
        return "IPI";
    }
}