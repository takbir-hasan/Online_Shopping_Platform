import java.util.Scanner;

public class OnlineShop{
      DataBase db = new DataBase();
      Scanner in = new Scanner(System.in);
       
      int price;
      String name, address, phoneNumber, type;

      int ok =1;

    void start(){
       while(ok==1){
              System.out.println("Enter Account Number: ");
      int number = in.nextInt();
        System.out.println("Enter Password: ");
      int pass = in.nextInt();
  
     String a =  db.Login(number,pass);

     if(a== "invalid"){
       System.out.println("Invalid Account number or Password.");
         continue;
     }

     else if(a== "premium"){
            ok=0;
            System.out.println("Pay for the choosen product.");
            System.out.println("Price: ");
            price = in.nextInt();
             System.out.println("Enter 'Card' or 'Bkash': ");
             type = in.nextLine();
             type = in.nextLine();
            
            Payment payment = new Payment();
            int check = payment.confirm(price,type);

          if(check ==1){
            System.out.println("Enter your name:");
              name = in.nextLine();
                System.out.println("Address: ");
            address = in.nextLine();
              System.out.println("Phone Number: ");
            phoneNumber = in.nextLine();

            Delivery delivery = new Delivery(name,address,phoneNumber,1);
             delivery.Do();
          }
     }
     else{
            ok=0;
             System.out.println("Pay for the choosen product.");
              System.out.println("Price: ");
            price = in.nextInt();
            System.out.println("Enter Card or Bkash");
            type = in.nextLine();
            type = in.nextLine();
            
            Payment payment = new Payment();
            int check = payment.confirm(price,type);
           
          if(check ==1){
              System.out.println("Enter your name: ");
              name = in.nextLine();
                System.out.println("Address: ");
            address = in.nextLine();
              System.out.println("Phone Number: ");
            phoneNumber = in.nextLine();

            Delivery delivery = new Delivery(name,address,phoneNumber,0);
              delivery.Do();

          }

     }

     }

    }
}
