import CTExercicio1.*;
import CTExercicio2.*;

public class Main {
  public static void main (String[] args) {
    // Questão 1:
    Triatleta triatletaGenteBoa = new Triatleta("Mila Lins", "Rua calda de morango com creme branco");
    
    triatletaGenteBoa.aquecer();
    triatletaGenteBoa.correr();
    triatletaGenteBoa.correrDeBicicleta();
    triatletaGenteBoa.nadar();

    // Questão 2:
    int numero = 0;
    ContaPoupanca contaP = new ContaPoupanca(numero, "Joao Maria", "88888888888");

    contaP.depositar(1000);
    contaP.sacar(500.50);
    
    int tipo = contaP.imprimirTipoConta();
    
    contaP.exibirDados();
    contaP.reajustar(20);
    contaP.exibirDados();
  }
}