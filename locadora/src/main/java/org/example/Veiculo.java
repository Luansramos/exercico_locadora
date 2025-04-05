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

    public double calcularValorDesconto(int dias) {
        if (dias<0){
            System.out.println("valor invalido");
            return 0.0;
        }else {
            if (dias >=7){
            return (this.valorDiaria * dias) * 0.90;
            }else{
                return this.valorDiaria * dias;
            }
        }
    }

    public double multa(int dias,int atraso){
        //fazer um if multiplicando valor por 0.1 para retirar o desconto
        double valor = calcularValorDesconto(dias);
        return valor + (atraso*valorDiaria)+(valor*0.1);
    }//          50    +          10       +    5

    public double descontoProgressivo(int dias) {
        //++
        //++
        if (dias >= 20) {
            return (valorDiaria * dias) * 0.8;
        } else if (dias >= 30) {
            return (valorDiaria * dias) *0.7;
        } else if (dias >= 40) {
            return (valorDiaria * dias) *0.6;
        }else {
            return (valorDiaria * dias) *0.5;
        }
    }
}
