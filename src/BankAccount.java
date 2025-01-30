public class BankAccount{
    public static void main(String[] args){
        //Create a double variable to store Bob's Account balance of $2175.37
        float BobBalance = 2175.37f;

        // Bob withdrew $302.50
        BobBalance = BobBalance - 302.50f;
        
        //Bob deposited $50.03
        BobBalance = BobBalance + 50.03f;

        //Bob withdrew half of his current balance, then deposited $20.00
        BobBalance = BobBalance / 2.00f;

        BobBalance += 20.00f;

        //Bob withdrew $1.
        BobBalance -= 1.00f;

        //Bob deposited his paycheck that doubled his current balance.
        BobBalance *= 2.00f;

        //Bob deposited $1.
        BobBalance += 1.00f;

        //Printing final balance on Bob's Account using the format method to round the balance to the hundreth place.
        System.out.format("Bob's account balance is $%.2f \n", BobBalance);
    }
}
