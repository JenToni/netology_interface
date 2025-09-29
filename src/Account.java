public class Account {
    public long sum;


    public boolean pay(long amount){
        if (this.sum >= amount){
            this.sum -= amount;
            return true;
        }else {
            return false;
        }
    }
    public boolean add(long amount) {
        if (amount >=0){
            this.sum += amount;
            return true;
        }else {
            return false;
        }
    }

    public long getBalance(){
        return sum;
    }

    public boolean transfer(Account account, long amount){
        if (sum >= amount){
            this.pay(amount);
            account.add(amount);
            return true;
        }else {
            return false;
        }
    }
}
