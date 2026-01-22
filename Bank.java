class Bank {
    public static void main(String[] args) {
        int balance = 9000;
        int withdraw = 8000;

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance = balance-withdraw;
                System.out.println("Withdrawal Successful");
                System.out.println("Balance : " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
