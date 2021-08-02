package desafio01;

public class Atleta {
    
    private String nome;
    private String pais;
    private int distancia;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + distancia;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((pais == null) ? 0 : pais.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Atleta other = (Atleta) obj;
        if (distancia != other.distancia)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (pais == null) {
            if (other.pais != null)
                return false;
        } else if (!pais.equals(other.pais))
            return false;
        return true;
    }

    
}
