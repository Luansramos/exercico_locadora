package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VeiculoTest {
    public static void main(String[] args) {
//erro no Test nn sei arrumar, mas acho q é so comletar a funçao
        @Test
        public static void testCalcularCusto(){
            Veiculo uno = new Veiculo("uno",30);
            System.out.println(uno.calcularCusto(10));

        }
    }
}


//package org.example;import static org.junit.jupiter.api.Assertions.*;import org.junit.jupiter.api.Test;public class VeiculoTest {    @Test    public void testCalculoSemDesconto() {        Veiculo v = new Veiculo("Fiat Uno", 100.0);        double custo = v.calcularCusto(5); // menos de 7 dias        assertEquals(500.0, custo);    }    @Test    public void testCalculoComDesconto() {        Veiculo v = new Veiculo("Fiat Uno", 100.0);        double custo = v.calcularCusto(7); // com 10% de desconto        assertEquals(630.0, custo);    }    @Test    public void testDesconto() {        Veiculo v = new Veiculo("Palio", 80.0);        assertEquals(56.0, v.desconto(7)); // 10% de 560    }    @Test    public void testMultaPorAtraso() {        Veiculo v = new Veiculo("Gol", 90.0);        assertEquals(54.0, v.calcularMulta(3)); // 3 dias de atraso * 90 * 0.2    }    @Test    public void testMultaSemAtraso() {        Veiculo v = new Veiculo("HB20", 120.0);        assertEquals(0.0, v.calcularMulta(0));    }    @Test    public void testCalculoComZeroDias() {        Veiculo v = new Veiculo("Civic", 150.0);        assertEquals(0.0, v.calcularCusto(0));    }}
//