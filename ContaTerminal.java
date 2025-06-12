import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numero = leia.nextInt();
        System.out.println("Digite o codigo da agência: ");
        String agencia = leia.next();
        System.out.println("Digite o nome do Cliente:");
        String nome = leia.nextLine();
        System.out.println("Digite o saldo da conta: ");
        float saldo = leia.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


    }
}