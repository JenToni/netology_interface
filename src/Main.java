public class Main {
    public static void main(String[] args) {

        Account firstAccount = new SimpleAccount();
        firstAccount.add(2000);
        firstAccount.add(50_000);

        System.out.println(firstAccount.getBalance());

        Account secondAccount = new CreditAccount();
        firstAccount.transfer(secondAccount, 10_000);

        System.out.println(secondAccount.getBalance());

    }
}