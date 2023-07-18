
public class DataBase {

      Account[] accounts = new Account[2];

     DataBase(){
       accounts[0] = new Account(12345,54321,"premium");
      accounts[1] = new Account(98765,56789,"free");

     }

String Login(int a, int b){
  for (int i = 0; i < accounts.length; i++) {
    if(accounts[i].accountNumber== a && accounts[i].password ==b ){
      return accounts[i].accountType;
    }
  }
  return "invalid";
}


}
