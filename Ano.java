import java.util.Scanner;

public class Ano {
	public static void main(String[] args) {
		int ano;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um ano para validar se é bissexto ou não: ");
		ano = ler.nextInt();
		
		 if ((ano % 4 == 0 ) && (ano / 100 != 0) || (ano % 400 == 0) ) {
             System.out.println("O Ano é bissexto!");
         }else{
        	 System.out.println("O Ano não é bissexto!");
            
         }
         }
}