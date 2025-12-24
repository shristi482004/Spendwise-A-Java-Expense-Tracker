import java.time.LocalDate;

public abstract class Transaction {
    protected double amount;
    protected LocalDate date;
    protected String note;

    public Transaction(double amount, LocalDate date, String note) {
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    public abstract String getType(); 
}
