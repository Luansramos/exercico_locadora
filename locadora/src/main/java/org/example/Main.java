package org.example;


public class Main {
    public static void main(String[] args) {
//        Veiculo uno = new Veiculo("uno",30);
//        System.out.println(uno.calcularCusto(10));

        Veiculo test = new Veiculo("carro",10);
//        System.out.println(test.multa(5,1));

        System.out.println(test.calcularValorDesconto(20));
        System.out.println();
    }
}
