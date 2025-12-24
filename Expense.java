import java.time.LocalDate;

public class Expense extends Transaction {
    
    private String category;

    public Expense(String category, double amount, LocalDate date, String note) {
        super(amount, date, note);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String getType() {
        return "Expense";
    }

    @Override
    public String toString() {
        return "[Expense] " + date + " | " + category + " | Rs." + amount + " | " + note;
    }
}
