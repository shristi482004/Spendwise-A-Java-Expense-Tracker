import java.time.LocalDate;

public class Income extends Transaction {

    private String source;

    public Income(String source, double amount, LocalDate date, String note) {
        super(amount, date, note);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String getType() {
        return "Income";
    }

    @Override
    public String toString() {
        return "[Income] " + date + " | " + source + " | Rs." + amount + " | " + note;
    }
}

