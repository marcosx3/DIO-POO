package estudosDio;

public class Carro {
   private String marca;
    private String nome;
    private int ano;
    private String fabricante;
    private String tipoDeCombustivel;

    public Carro(String marca, String nome, int ano, String fabricante, String tipoDeCombustivel) {
        this.marca = marca;
        this.nome = nome;
        this.ano = ano;
        this.fabricante = fabricante;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public Carro(){}


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String carroString(){
        return "Marca: " + marca + "\n" + "Fabricante: " + fabricante + "\n" + "Ano: " + ano +"\n"+ "Tipo de combustivel: " + tipoDeCombustivel;
    }
}
