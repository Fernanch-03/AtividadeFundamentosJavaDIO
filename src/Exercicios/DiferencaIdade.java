package Exercicios;

import java.lang.reflect.Array;
import java.util.Calendar;

public class DiferencaIdade {
        Calendar c = Calendar.getInstance();
        public int[] verificarIdade(int dia, int mes, int ano, Calendar c) {
            int[] idade;
            mes = (mes - 1);
            if (dia > 31) {
                System.out.println("Erro, digite uma data valida");
                System.exit(1);
            }
            if (mes > 11) {
                System.out.println("Erro, digite uma data valida");
                System.exit(1);
            }
            if (ano > c.get(Calendar.YEAR)) {//
                System.out.println("Erro: Você ainda não nasceu");
                System.exit(1);
            }//codigo acima é o tratamento de erros em caso que o usuario digite valores inválidos

            return new int[]{ano, mes, dia};

        }

        public static void compararIdade(String n1, int[] idade1, String n2, int[] idade2){
            int i = 0;
            int saida = 0;
            int[] count = {0,0,0};//estabelecendo uma variavel de conta
            while(saida == 0 && i<=idade1.length){
                if (idade1[i] > idade2[i]) {
                    count [i] = 1;
                    saida = idade1[i] - idade2[i];
                } else if (idade1[i] < idade2[i]) {
                    count[i] = 2;
                    saida = idade2[i] - idade1[i];
                }//verificando qual dos dois é maior. Código pode ser melhorado de algumas maneiras para permitir expansão
                i++;
            }
            //começar a colocar as saidas
            if (count[0] == 1){
                System.out.println(n2+" é mais velho por "+ saida+" anos");
            }
            else if (count[0] == 2){
                System.out.println(n1+" é mais velho por "+ saida+" anos");
            }
            if (count[1] == 1){
                System.out.println(n2+" é mais velho por "+ saida+" meses");
            }
            else if (count[1] == 2){
                System.out.println(n1+" é mais velho por "+ saida+" meses");
            }
            if (count[2] == 1){
                System.out.println(n2+" é mais velho por "+ saida+" dias");
            }
            else if (count[2] == 2){
                System.out.println(n1+" é mais velho por "+ saida+" dias");
            }else{
                System.out.println("Eles tem a mesma idade");
            }

        }

    }
