public class Category {
    public static final String[] categories = {
        "Food", "Travel", "Shopping", "Bills", "Medical", "Entertainment", "Others"
    };

    public static boolean isValidCategory(String cat) {
        for (String c : categories) {
            if (c.equalsIgnoreCase(cat)) return true;
        }
        return false;
    }
}