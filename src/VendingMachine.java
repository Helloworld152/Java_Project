public class VendingMachine {
    int price = 80;
    int balance;
    int total;

    VendingMachine(){ total = 0; }

    VendingMachine(int price, int balance, int total){
        this.price = price;
        this.balance = balance;
        this.total = total;
    }

    void showPrompt(){ System.out.println("Welcome"); }
    void showBalance(){ System.out.println(balance); }

    void insertMoney(int amount){ balance = balance + amount; }

    void getFood() {
        if (balance >= price){
            System.out.println("Here you are.");
            balance = balance - price;
            total = total + price;
        }
    }
}

