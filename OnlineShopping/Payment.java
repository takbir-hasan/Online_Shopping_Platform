

public class Payment {

      
    int confirm(int p, String t){
      
      if(p == 1120 && t.equals("Card")){
            System.out.println("Paid by Card");
            return 1;
      }
     else if(t.equals("Bkash") && p == 1120){
            System.out.println("Paid by Bkash");
            return 1;
      }
      else
      return 0;
    }


}
