package ExerciciosAbstracao;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ContaBancaria {
    Scanner s = new Scanner(System.in);
    AtomicInteger count = new AtomicInteger(0);

    private String nome;

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    private double saldo;
    private double limiteChequeEspecial;
    private Object[][] boleto = new Object[10][2];

    public void criarConta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        if(saldo>500){
            this.limiteChequeEspecial = (saldo/2);
        }else{
            this.limiteChequeEspecial = 50;
        }
        System.out.println("Bem vindo "+nome+" ao banco central.\n" +
                "O seu saldo é de "+saldo+"\n" +
                "O limite do seu cheque especial é de "+this.limiteChequeEspecial);
    }

    public void checarSaldo(Scanner s){
        System.out.println("Saldo: "+this.saldo);
        s.nextLine();
    }

    public void checarChequeEspecial(Scanner s){
        System.out.println("Saldo: "+this.limiteChequeEspecial);
        s.nextLine();
    }

    public void mostrarBoletos(Object[][] boleto, Scanner s){
        for (int i=0; i<boleto.length;i++) {
            if(boleto[i][0]!=null) {
                System.out.println("Id: " + boleto[i][0]);
                System.out.println("Valor: " + boleto[i][1] + "\n");
            }
        }
        s.nextLine();
    }


    public Object[][] getBoleto(){
        return this.boleto;
    }

    public void cadastrarBoletos(double valor, Object[][] boleto, Scanner s, AtomicInteger count){
        for(int i=0; i<boleto.length;i++){
            if(boleto[i][0] == null){
                this.boleto[i][0] = count.incrementAndGet();;
                this.boleto[i][1] = valor;
                return;
            }
        }
        System.out.println("Erro: Você atingiu o número máximo de boletos cadastrados");
        s.nextLine();
    }


    public void pagarBoletos(Object[][] boleto, double saldo, double chequeEspecial, Scanner s){
        int count = 0;
        System.out.println("Selecione qual boleto deseja pagar");
        for (int i = 0; i<boleto.length;i++){
            if(boleto[i][0]==null){
                count ++;
                continue;
            }
            System.out.println("Código: "+boleto[i][0]+"\nValor: "+boleto[i][1]);
        }
        int pagar = s.nextInt();
        for (int i = 0; i<boleto.length;i++){
            if(boleto[i][0] != null) {
                if (boleto[i][0].equals(pagar)) {
                    if (saldo >= (double) boleto[i][1]) {
                        this.saldo = this.saldo - (double) boleto[i][1];
                        this.boleto[i][0] = null;
                        this.boleto[i][1] = null;
                    } else if ((double) boleto[i][1] <= (saldo + chequeEspecial)) {
                        this.limiteChequeEspecial = saldo + chequeEspecial - (double) boleto[i][1];
                        this.saldo = 0;
                        this.boleto[i][0] = null;
                        this.boleto[i][1] = null;
                    } else {
                        System.out.println("Boleto não pago: saldo Insuficiente");
                    }
                }//comparação do boleto com o valor
            }//comparação se o valor é nulo, para evitar erro
        }//fim do for
        System.out.println("Saldo: "+this.saldo+"\nCheque Especial: "+this.limiteChequeEspecial);
        s.nextLine();

    }

}

