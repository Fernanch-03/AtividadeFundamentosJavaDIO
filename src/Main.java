import Exercicios.AreaQuadrado;
import Exercicios.AreaRetangulo;
import Exercicios.AtividadeIdade;
import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Scanner s = new Scanner(System.in);
        AtividadeIdade ai = new AtividadeIdade();
        AreaQuadrado aq = new AreaQuadrado();
        AreaRetangulo ar = new AreaRetangulo();

        //exercicio idade
        //System.out.println("Digite, em sequencia, o seu dia, mes e ano de nascimento, um em cada linha a seguir");
        //ai.calcularIdade(s.nextInt(), s.nextInt(), s.nextInt(), c);

        //exercicio area quadrado
        //System.out.println("Digite o tamanho dos lados do quadrado");
        //aq.areaQuadrado(s.nextDouble());

        //Exercicio area retangulo
        System.out.println("Digite, em ordem o comprimento da altura e o comprimento do retangulo (um valor em cada linha");
        ar.calculoAreaRetangulo(s.nextDouble(),s.nextDouble());
    }
}