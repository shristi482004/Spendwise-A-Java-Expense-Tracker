import java.util.*;
import java.time.LocalDate;

public class SpendWiseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your monthly budget: ");
        double budget = sc.nextDouble();
        sc.nextLine();

        User user = new User(name, budget);

        List<Expense> expenseList = FileHandler.loadExpenses();
        List<Income> incomeList = FileHandler.loadIncome();

        int choice;

        do {
            System.out.println("\n===== SPENDWISE MENU =====");
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. View All Transactions");
            System.out.println("4. Search Transaction by Note");
            System.out.println("5. Delete Expense");
            System.out.println("6. Generate Reports");
            System.out.println("7. Save Data");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();

                    if (!Category.isValidCategory(category)) {
                        System.out.println("Invalid category!");
                        break;
                    }

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Note: ");
                    String note = sc.nextLine();

                    expenseList.add(new Expense(category, amount, LocalDate.now(), note));
                    System.out.println("Expense Added!");
                    break;

                case 2:
                    System.out.print("Enter source: ");
                    String src = sc.nextLine();

                    System.out.print("Amount: ");
                    double incAmount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Note: ");
                    String incNote = sc.nextLine();

                    incomeList.add(new Income(src, incAmount, LocalDate.now(), incNote));
                    System.out.println("Income Added!");
                    break;

                case 3:
                    System.out.println("\n--- Expenses ---");
                    for (Expense e : expenseList) System.out.println(e);
                    System.out.println("\n--- Income ---");
                    for (Income i : incomeList) System.out.println(i);
                    break;

                case 4:
                    System.out.print("Enter keyword: ");
                    String key = sc.nextLine();

                    System.out.println("\nSearch Results:");
                    for (Expense e : expenseList)
                        if (e.getNote().contains(key)) System.out.println(e);

                    for (Income i : incomeList)
                        if (i.getNote().contains(key)) System.out.println(i);
                    break;

                case 5:
                    System.out.print("Enter category to delete: ");
                    String del = sc.nextLine();

                    expenseList.removeIf(e -> e.getCategory().equalsIgnoreCase(del));
                    System.out.println("Deleted expenses under: " + del);
                    break;

                case 6:
                    ExpenseReport report = new ExpenseReport(expenseList, incomeList);
                    report.monthlySummary();
                    report.categoryWiseSummary();
                    break;

                case 7:
                    FileHandler.saveExpenses(expenseList);
                    FileHandler.saveIncome(incomeList);
                    System.out.println("Data Saved!");
                    break;

                case 8:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}

