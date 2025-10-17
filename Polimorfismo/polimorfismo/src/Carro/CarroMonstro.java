package Carro;

public class CarroMonstro  extends Carro{
    public double rodasMontro;
    
    
    
    public void acelerar(){
        System.out.println("Lento");
        
    }
    public String limiteRodas(double rodas){
        if (rodas >1.68){
            this.rodasMontro = rodas;
            return "Rodas Atribuidas Com Suesso!!!";

        }else{
            return "não é um carro montro:";
        }

    }


}
