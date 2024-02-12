package entitites;

public class BusinessAcount extends Account {
    private Double loanLimit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amoumt) {
        if (amoumt <= loanLimit) {
            // protected pode ser acessado pela subclasse mas sem ser publico :)
            balance += amoumt - 10.0;
        }

    }

}
