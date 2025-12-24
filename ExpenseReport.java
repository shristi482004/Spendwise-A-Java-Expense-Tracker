import java.util.*;

public class ExpenseReport implements ReportGenerator {

    private List<Expense> expenses;
    private List<Income> incomes;

    public ExpenseReport(List<Expense> expenses, List<Income> incomes) {
        this.expenses = expenses;
        this.incomes = incomes;
    }

    @Override
    public void monthlySummary() {
        double totalExpense = 0, totalIncome = 0;

        for (Expense e : expenses) totalExpense += e.getAmount();
        for (Income i : incomes) totalIncome += i.getAmount();

        System.out.println("\n----- Monthly Summary -----");
        System.out.println("Total Income : Rs. " + totalIncome);
        System.out.println("Total Expense: Rs. " + totalExpense);
        System.out.println("Net Savings  : Rs. " + (totalIncome - totalExpense));
        System.out.println("----------------------------\n");
    }

    @Override
    public void categoryWiseSummary() {
        Map<String, Double> categoryMap = new HashMap<>();

        for (Expense e : expenses) {
            categoryMap.put(e.getCategory(),
                categoryMap.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
        }

        System.out.println("\n--- Category-wise Expense ---");
        for (String c : categoryMap.keySet()) {
            System.out.println(c + " : Rs. " + categoryMap.get(c));
        }
        System.out.println("------------------------------\n");
    }
}
