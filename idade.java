public class idade {
    public static void main(String args[]) {
        int idade= 16;
        
        if(idade<16){
            System.out.println("Não pode votar");
        }else if(idade >15 && idade < 18 || idade > 65){
            System.out.println("Voto facultativo");
        }else
            System.out.println("Voto Obrigatório");

    }
}