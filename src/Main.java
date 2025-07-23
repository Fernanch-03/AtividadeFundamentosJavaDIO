import Exercicios.AreaQuadrado;
import Exercicios.AreaRetangulo;
import Exercicios.AtividadeIdade;
import Exercicios.DiferencaIdade;
import ExerciciosAbstracao.ContaBancaria;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Scanner s = new Scanner(System.in);
        AtomicInteger count = new AtomicInteger(0);
        AtividadeIdade ai = new AtividadeIdade();
        AreaQuadrado aq = new AreaQuadrado();
        AreaRetangulo ar = new AreaRetangulo();
        DiferencaIdade di = new DiferencaIdade();
        ContaBancaria cb = new ContaBancaria();

        //exercicio idade
        //System.out.println("Digite, em sequencia, o seu dia, mes e ano de nascimento, um em cada linha a seguir");
        //ai.calcularIdade(s.nextInt(), s.nextInt(), s.nextInt(), c);

        //exercicio area quadrado
        //System.out.println("Digite o tamanho dos lados do quadrado");
        //aq.areaQuadrado(s.nextDouble());

        //Exercicio area retangulo
        //System.out.println("Digite, em ordem o comprimento da altura e o comprimento do retangulo (um valor em cada linha");
        //ar.calculoAreaRetangulo(s.nextDouble(),s.nextDouble());

        //Exercicio diferença idade
        /*
        System.out.println("Digite o nome e a data de nascimento de duas pessoas. \nDigite nesta ordem: Nome, dia, mes, ano (o ano deve ser por extenso (exemplo:2005))");
        di.compararIdade
                (s.nextLine(),
                di.verificarIdade(Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()),c),
                s.nextLine(),
                di.verificarIdade(Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()),c));
        */


        //Chamando conta bancaria
        System.out.println("Bem vindo ao Banco Tramontina, por favor entre com as seguintes informações:");
        System.out.println("Nome:");
        String nomeConta = s.nextLine();
        System.out.println("Saldo da conta:");
        double saldoConta = s.nextDouble();
        cb.criarConta(nomeConta,saldoConta);
        int verificarAcaoConta=0;
        while(verificarAcaoConta!=5) {
            System.out.println("O que deseja fazer?:\n1- Checar Saldo\n2- Checar saldo cheque especial\n3- Criar Boleto\n4- Lista boletos\n5- Pagar Boleto\n5- Sair ");
            verificarAcaoConta = s.nextInt();
            switch(verificarAcaoConta) {
                case 1:
                    cb.checarSaldo(s);
                    break;
                case 2:
                    cb.checarChequeEspecial(s);
                    break;
                case 3:
                    System.out.println("Digite o valor do boleto");
                    cb.cadastrarBoletos(s.nextDouble(),cb.getBoleto(),s,count);
                    break;
                case 4:
                    cb.pagarBoletos(cb.getBoleto(),cb.getSaldo(),cb.getLimiteChequeEspecial(),s);
                    break;
                case 5:
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }

    }
}