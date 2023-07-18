

public class Confirmation {

      void sms(int type,int a, String s){
            if(a==1 && type==1){
                    System.out.println("Mr."+s+", your parcel will be dispatched by a careful distributor.");
            }
            else if(a==2 && type ==1){
                   System.out.println("Mr."+s+", your parcel will be delivered by courier service.");
            }
            else if(a==1 && type ==2){
                   System.out.println("Mr."+s+", your parcel will be dispatched by a careful distributor.");
            }
            else if(a==2 && type ==2){
                   System.out.println("Mr."+s+", your parcel will be delivered in regular way.");
            }

            
      }

     
}
