package Ex04;

public class Veiculos {
    String modelo,marca;
    int consumo;

    public Veiculos(String modeloVeiculo, String marcaVeiculo, int consumoVeiculo){
        modelo = modeloVeiculo;
        marca = marcaVeiculo;
        consumo = consumoVeiculo;
    }

    String exibirDadosVeiculo(){
        return "\nModelo: " + modelo +
        "\nMarca: " + marca +
        "\nConsumo: " + consumo + " km/l";
    }

    //int ConsumoMensal(int percursoDiario){
    //    return (percursoDiario * 20) / consumo;

    //}

}
