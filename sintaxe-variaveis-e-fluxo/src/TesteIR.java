
public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
        	System.out.println("A al�quota de IR � 7.5%");
        	System.out.println("Pode deduzir o valor de R$142,00");
        } else if (salario >= 2800.01 && salario <= 3751.0) {
        	System.out.println("A al�quota de IR � 15%");
        	System.out.println("Pode deduzir o valor de R$350,00");        	
        } else if (salario >= 3751.01 && salario <= 4664.00) {
        	System.out.println("A al�quota de IR � 22.5%");
        	System.out.println("Pode deduzir o valor de R$636,00");
        }
    }
}