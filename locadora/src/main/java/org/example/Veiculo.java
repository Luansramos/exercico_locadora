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
    
// teste para tentar fazer o metodo sem declarar variavel dentro da funçao
    public double calcularValorDesconto(int dias) {
        if (dia>=7){
        return (this.valorDiaria * dias) * 0.10
        }else{
            return this.valorDiaria * dias
        }
    }


    
    public double multa(int dias,int atraso){
        //fazer um if multiplicando valor por 0.1 para retirar o desconto
        double valor = calcularCusto(dias);
        return valor + (atraso*valorDiaria)+(valor*0.1);
    }//          50    +          10       +    5

}
