/*
 Setyo Haryo A
 1301144059 
 IF-38-09
 */
package indexpoint;
import java.util.Scanner;
/**
 *
 * @author Setyo
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        // TODO code application logic here
        float UTS;
        float UAS;
        float KUIS;
        double TOTAL;
        Scanner s = new Scanner(System.in);
        
        System.out.println("masukkan nilai UTS : ");
        UTS=s.nextFloat();
        
        System.out.println("masukkan nilai UAS : ");
        UAS=s.nextFloat();
        
        System.out.println(" masukkan nilai KUIS : ");
        KUIS=s.nextFloat();
        
        TOTAL = (0.35*UTS + 0.4*UAS + 0.25*KUIS);
        
        if (TOTAL>84 && TOTAL<=100)
        {
             System.out.println("Excellent");
        }
        else if(TOTAL>74 && TOTAL<=84)
        {
            System.out.println("Very Good");
        }
        else if(TOTAL>64 && TOTAL<=74)
        {
            System.out.println("Good");
        }
        else if(TOTAL>49 && TOTAL<=64)
        {
            System.out.println("Accepted");
        }
        else
        {
            System.out.println("Failed");
        }
        
        
    }
    
    
}
