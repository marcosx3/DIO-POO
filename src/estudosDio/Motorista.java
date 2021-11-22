package estudosDio;

public class Motorista extends Carro{
    String nome;
    int idade;

    @Override
    public String toString() {
        return "Motorista: " +
                "nome='" + nome + '\'' +
                ", idade= " + idade +
                ", dirige= " + dirige +
                "\n";
    }

    boolean dirige = true;


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDirige() {
        return dirige;
    }

    public void setDirige(boolean dirige) {
        this.dirige = dirige;
    }
}
