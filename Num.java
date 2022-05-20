public class Num {
    public static void main(String args[]) {
        int numOne= 29, numTwo= 4, numTotal;
        
        if(numOne%2!=0 && numTwo%2!=0){
            numTotal=numOne+numTwo;
            System.out.println(numTotal);
        }else if(numOne%2==0 && numTwo%2==0){
            numTotal=numOne*numTwo;
            System.out.println(numTotal);
        }else if(numOne%2!=0 || numTwo%2!=0){
            if(numOne%2!=0){
                System.out.println(numOne);
            }else if(numTwo%2!=0){
                System.out.println(numTwo);
            }
        }
    }
}