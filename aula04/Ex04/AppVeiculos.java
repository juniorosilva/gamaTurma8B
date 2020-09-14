package Ex04;

public class AppVeiculos {
    public static void main(String[] args) {
        Veiculos veiculo1 = new Veiculos("Fit", "Honda", 14);
        Veiculos veiculo2 = new Veiculos("HRV", "Honda", 12);
        Veiculos veiculo3 = new Veiculos("Opala", "Chevrolet",4 );

        System.out.println(veiculo1.exibirDadosVeiculo());
        System.out.println(veiculo2.exibirDadosVeiculo());
        System.out.println(veiculo3.exibirDadosVeiculo());

        //for(int i = 0; i < 3 ; i ++){


        }
        

    }
}
