import Exercicios.AtividadeIdade;
import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        AtividadeIdade ai = new AtividadeIdade();
        Scanner s = new Scanner(System.in);

        //exercicio idade
        System.out.println("Digite, em sequencia, o seu dia, mes e ano de nascimento, um em cada linha a seguir");
        ai.calcularIdade(s.nextInt(), s.nextInt(), s.nextInt(), c);
    }
}