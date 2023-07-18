

public class Delivery {
      String name, add, phn; int type;

      Delivery(String name, String add, String  phn, int type ){
            this.name = name;
            this.add = add;
            this.phn = phn;
            this.type = type;
      }

      void Do(){
            if(type == 1){
                  PremiumUser premiumUser = new PremiumUser();
                  premiumUser.complete(name);
            }
            else{
                  FreeUser freeUser = new FreeUser();
                  freeUser.complete(name);
            }
      }


}
