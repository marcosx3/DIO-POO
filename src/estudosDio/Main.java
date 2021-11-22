package estudosDio;

public class Main {
    public static void main(String[] args) {
        Motorista motorista  = new Motorista();
        motorista.setNome("Pedro de Lara");
        motorista.setIdade(26);
        motorista.setDirige(true);
    // informaçãoes sobre o carro
        motorista.setFabricante("ford");
        motorista.setMarca("focus");
        motorista.setAno(2008);
        motorista.setTipoDeCombustivel("flex");
    System.out.println(motorista.toString());
    System.out.println(motorista.carroString());
    }
}
