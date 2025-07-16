package Exercicios;
import java.util.Calendar;

public class AtividadeIdade {
    Calendar c = Calendar.getInstance();
        public void calcularIdade(int dia, int mes, int ano, Calendar c) {
            int idade;
            mes = (mes-1);
            if(dia>31){
                System.out.println("Erro, digite uma data valida");
                return;
            }
            if (mes>11){
                System.out.println("Erro, digite uma data valida");
                return;
            }
            if(ano>c.get(Calendar.YEAR)){//
                System.out.println("Erro: Você ainda não nasceu");
                return;
            }//codigo acima é o tratamento de erros em caso que o usuario digite valores inválidos

            idade = c.get(Calendar.YEAR)-ano;

            if(mes>c.get(Calendar.MONTH)){
                idade = idade-1;
            }

            else if (mes == c.get(Calendar.MONTH)){
                if(dia>c.get(Calendar.DATE)){
                    idade = idade-1;
                }

                else if (dia == c.get(Calendar.DATE)) {
                    System.out.println("Feliz aniversário. Você faz "+idade+" anos hoje");
                    return;
                }
            }

            System.out.println("Voce tem "+idade+" anos");

        }
}



