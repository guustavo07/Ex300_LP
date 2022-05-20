public class fatorialQualquer {
    public static void main(String args[]) {
    int fat = 1,cont=0, num=6;

    for( int i = 1; i <=num; i++ ){
        fat *= i;
        cont++;
    }
        System.out.println( "O fatorial de " + cont + " é igual a " + fat );
 }
}