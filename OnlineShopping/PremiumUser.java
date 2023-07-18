import java.util.Scanner;

public class PremiumUser {

 Scanner in = new Scanner(System.in);
      Confirmation confirmation = new Confirmation();

      void complete(String a){
            int glass, s;
            System.out.println("Need notification?\n1.Yes.\n2.No");
            s = in.nextInt();
           
            System.out.println("Is it made of glass?\n1.Yes.\n2.No.");
            glass = in.nextInt();

            if(glass==1 && s==1){
                  confirmation.sms(1,1,a);
            }
            if(glass==2 && s==1){
                  confirmation.sms(1,2,a);
            }
           

            in.close();
      }
}
