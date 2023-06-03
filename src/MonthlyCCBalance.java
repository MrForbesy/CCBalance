public class MonthlyCCBalance
{
    public static void main(String[] args)
    {
      int startBalance = 5000;
      double interestRate = .17;
      double oneMonth = startBalance + (startBalance * interestRate);
      double twoMonth = oneMonth + (oneMonth * interestRate);

        System.out.println("After one month, your payment on the starting balance of " + startBalance + " is " + oneMonth + ".");
        System.out.println("After two months, your payment is now " + twoMonth + ".");
    }
}