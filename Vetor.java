public class Vetor{
    public static void main(String[] args) {
        double vetor[] = new double[]{12.55,34.75,45.85,21.25,33.15,4.45,52.65,42.35,85.15,75.45};
        double sum = 0;
        for (int i = 0; i < vetor.length; i++) {
            sum+=vetor[i];
        }
        System.out.printf("A média é: "+sum/10);
        
    }
}
