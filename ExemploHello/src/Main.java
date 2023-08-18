import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        ContaCorrente c1 = new ContaCorrente(); // Cria o objeto chamado C1 do tipo ContaCorrente
        c1.cadastrar(123, "Ana",789);
        c1.depositar(1000);
        c1.sacar(500);
        System.out.println("Saldo da conta:" + c1.consultar());
    }
}