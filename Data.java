public class Data {
    public static void main(String args[]) {
        int dia= 29, mes= 2;
        
        if(mes != 2 && dia>0 && dia<=32){
            System.out.println("Data válida");
        }else if(mes==2 && dia<29){
            System.out.println("Dia válido");
        }else
            System.out.println("Dia inválido");
    }
}