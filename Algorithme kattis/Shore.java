import java.util.*;

public class Shore {

    public static void main(String[]args){
        //ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] tab = new int[a];
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        for(int i =0; i<a; i++){
            tab[i]=scanner.nextInt();
        }
        int init = b*c;
        int y = a-b;
        int sum = 0;
        if(c < tab[a-b]){
            for(int j=0;j<a-b;j++){
                    sum += tab[j] ;
                    
            }
            System.out.println(sum + init);
        }
        else{
            for(int j=0; j<a; j++){
                sum += tab[j];
            }
            System.out.println(sum);
        }
    }
}