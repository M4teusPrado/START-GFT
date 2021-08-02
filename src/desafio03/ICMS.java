package desafio03;

public class ICMS implements Imposto{

    @Override
    public Double calculaImposto(double valor) {
        // 30% sobre qualquer valor
        return 0.3*valor;
    }

    @Override
    public String toString() {
        
        return "ICMS";
    }
}