import Carro.Carro;
import Carro.CarroMonstro;
import Carro.Bugatti;
public class App {
    public static void main(String[] args)  {
        Carro carro = new Carro();
        carro.ligar();
        carro.desligar();
        carro.acelerar();
        carro.marca="volkwagen";
        System.out.println(carro.marca);

        CarroMonstro carroMonstro = new CarroMonstro();
        carroMonstro.ligar();
        carroMonstro.desligar();
        carroMonstro.acelerar();
        carroMonstro.marca= "Monster";

        Bugatti bugatti = new Bugatti();
        bugatti.ligar();
        bugatti.desligar();
        bugatti.acelerar();
        

    }
}
