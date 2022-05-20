public class fatorial15 {
    public static void main(String args[]) {
    int fat = 1,cont=0;

    for( int i = 1; i <16; i++ ){
        fat *= i;
        cont++;
        System.out.println( "O fatorial de " + cont + " é igual a " + fat );
    }
 }
}