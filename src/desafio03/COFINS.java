package desafio03;

public class COFINS implements Imposto{

    @Override
    public Double calculaImposto(double valor) {

        if( valor > 12000) {
            return 0.08 * valor;
        } else {
            return 0.0;
        }
    }
    
    @Override
    public String toString() {
        return "COFINS";
    }
}