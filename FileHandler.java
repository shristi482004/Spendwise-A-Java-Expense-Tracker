import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class FileHandler {

    private static final String EXPENSE_FILE = "expenses.txt";
    private static final String INCOME_FILE = "income.txt";

    public static void saveExpenses(List<Expense> expenses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(EXPENSE_FILE))) {
            for (Expense e : expenses) {
                writer.println(e.getDate() + "," + e.getCategory() + "," + e.getAmount() + "," + e.getNote());
            }
        } catch (Exception ex) {
            System.out.println("Error saving expenses.");
        }
    }

    public static void saveIncome(List<Income> incomes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(INCOME_FILE))) {
            for (Income i : incomes) {
                writer.println(i.getDate() + "," + i.getSource() + "," + i.getAmount() + "," + i.getNote());
            }
        } catch (Exception ex) {
            System.out.println("Error saving incomes.");
        }
    }

    public static List<Expense> loadExpenses() {
        List<Expense> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(EXPENSE_FILE))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] p = line.split(",");
                list.add(new Expense(p[1], Double.parseDouble(p[2]), LocalDate.parse(p[0]), p[3]));
            }

        } catch (Exception ex) {
            System.out.println("No previous expenses found.");
        }
        return list;
    }

    public static List<Income> loadIncome() {
        List<Income> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(INCOME_FILE))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] p = line.split(",");
                list.add(new Income(p[1], Double.parseDouble(p[2]), LocalDate.parse(p[0]), p[3]));
            }

        } catch (Exception ex) {
            System.out.println("No previous income found.");
        }
        return list;
    }
}