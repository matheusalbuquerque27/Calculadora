package Classes;

public class calculaEmprestimo {

    /**
     * @param valor
     * @param parcelas
     * @return
     */
    public static double calcularFinal(double valor, double parcelas){

        double acrescimo = Math.pow(1.05, parcelas);
        double valorFinal =  valor * acrescimo;
                
        return valorFinal;

    }
    
}
