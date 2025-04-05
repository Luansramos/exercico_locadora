# 🚗 Sistema de Aluguel de Veículos

Este projeto simula um sistema de aluguel de veículos em Java. O sistema permite calcular o valor total da locação com desconto, aplicar multas por atraso na devolução e utilizar uma tabela de descontos progressivos com base no tempo de locação.

---

## 📦 Tecnologias Utilizadas

- **Java 8+**
- **JUnit 4** para testes unitários
- **Maven/Gradle** (opcional, para gerenciamento de dependências)
- **IDE recomendada:** IntelliJ IDEA, Eclipse ou VS Code

---


---

## ⚙️ Funcionalidades

### ✅ `calcularValorDesconto(int dias)`
Calcula o valor total da locação com um desconto de 10% caso a quantidade de dias seja **7 ou mais**.

### ✅ `multa(int dias, int atraso)`
Aplica:
- Valor total com ou sem desconto (conforme dias alugados)
- Adicional de multa baseado no número de dias de atraso (`atraso * valorDiaria`)
- Acréscimo de 10% sobre o valor total final

### ✅ `descontoProgressivo(int dias)`
Aplica descontos escalonados de acordo com a quantidade de dias:
- 20 a 29 dias → 20% de desconto
- 30 a 39 dias → 30% de desconto
- 40 ou mais dias → 40% de desconto

---

## 🔍 Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Civic", 100.0);

        System.out.println("Desconto simples: " + carro.calcularValorDesconto(10));       // 900.0
        System.out.println("Com multa: " + carro.multa(10, 2));                            // valor com atraso + 10%
        System.out.println("Desconto progressivo: " + carro.descontoProgressivo(35));      // 2450.0 (30% desconto)
    }
}
