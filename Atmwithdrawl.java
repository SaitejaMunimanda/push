public class Atmwithdrawl {
        int balance;

        Atmwithdrawl(int balance){
            this.balance=balance;
        }
        void withdraw(int amount){
            if(amount < 0){
                throw new ArithmeticException("Enter Only Positive numbers");
            }
            if(amount > balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            balance = balance-amount;
        }
        public static void main(String[] args){
            Atmwithdrawl obj1 =new Atmwithdrawl(5000);
            System.out.println("Bevore withdrawl Amount is : " + obj1.balance);
            obj1.withdraw(4000);
            System.out.println("After withdrawl Amount is : " + obj1.balance);
        
        }
    }

    
