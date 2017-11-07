
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        Money sum = new Money(added.euros + this.euros, added.cents + this.cents);
        return sum;
    }

    public boolean less(Money compared){
        if (this.euros < compared.euros){
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }

    public Money minus(Money decremented){
        int resEuros = this.euros;
        int resCents = this.cents;
        resEuros -= decremented.euros;
        resCents -= decremented.cents;
        if (resCents < 0){
            resCents += 100;
            resEuros -= 1;
        }
        if (resEuros < 0){
            resEuros = 0;
            resCents = 0;
        }
        Money decrease = new Money(resEuros, resCents);
        return decrease;
    }

}
