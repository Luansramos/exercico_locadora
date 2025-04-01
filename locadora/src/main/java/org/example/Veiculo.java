package org.example;

public class Veiculo {

    //atributos
    String modelo;
    double valorDiaria;


    //contrutores
    public Veiculo(String modelo, double valorDiaria){
    this.modelo = modelo;
    this.valorDiaria = valorDiaria;

    }

    //metodos
    public double calcularCusto(int dias){
        double valor = valorDiaria*dias;

        if (dias>=7){
            System.out.println("10 porcento de desconto aplicado, valor total: ");
            return valor *= 0.9;
        }else{
            return valor;
        }

    }

}
