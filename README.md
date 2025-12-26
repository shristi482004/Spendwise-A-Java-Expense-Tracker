
# SpendWise — A Java-Based Expense & Income Tracker

SpendWise is a **console-based personal finance management system** built in Java using **Object-Oriented Programming principles**.  
It allows users to **track expenses, record income, analyze monthly spending, and understand category-wise financial patterns** — all through a clean, menu-driven interface.

This project focuses on **clarity of design, data handling, and real-world usability**, making it a strong foundation for larger financial or budgeting systems.

---

## Why SpendWise?

Most people spend money daily on food, shopping, subscriptions, travel, and utilities — but rarely track where it actually goes.  
SpendWise solves this by providing a **structured, repeatable, and analyzable way to log financial transactions** and generate meaningful summaries.

This project was designed to:
- encourage disciplined money tracking
- make spending patterns visible
- demonstrate clean Java OOP design in a real-world use case

---

## Key Features

### Expense Management
- Add expenses with:
  - category
  - amount
  - short note
  - date
- Supports multiple expense categories such as:
  - Food
  - Shopping
  - Entertainment
  - Travel
  - Others
- Delete specific expenses when required

### Income Tracking
- Record income sources with:
  - source name
  - amount
  - note
  - date
- Income and expenses are handled separately for clarity

### Transaction History
- View **all expenses and incomes** together in a readable, timestamped format
- Clearly distinguishes between expense and income records

### Search Functionality
- Search transactions by **keywords in notes**
- Useful for quickly locating specific expenses (e.g., subscriptions, events, or purchases)

### Monthly Reports & Analytics
- Generate a monthly financial summary including:
  - Total Income
  - Total Expense
  - Net Savings (profit or loss)
- Category-wise expense breakdown to identify spending habits

### Data Persistence
- Save transaction data to files
- Load previous expense and income data automatically on startup
- Ensures data continuity between sessions

---

## Sample Application Flow (Real Output)

### Adding Expenses
```

Enter category: Food
Amount: 450
Note: Dinner with friends
Expense Added!

```
```

Enter category: Shopping
Amount: 2000
Note: Brought new clothes
Expense Added!

```

### Adding Income
```

Enter source: Hackathon
Amount: 2000
Note: Runner-up at UI/UX Hackathon
Income Added!

```

### Viewing Transactions
```

--- Expenses ---
[Expense] 2025-12-24 | Food | Rs.450.0 | Dinner with friends
[Expense] 2025-12-24 | Shopping | Rs.2000.0 | Brought new clothes
[Expense] 2025-12-24 | Entertainment | Rs.899.0 | Netflix

--- Income ---
[Income] 2025-12-24 | Hackathon | Rs.2000.0 | Runner-up at UI/UX Hackathon

```

### Monthly Report
```

----- Monthly Summary -----
Total Income : Rs. 2000.0
Total Expense: Rs. 3349.0
Net Savings  : Rs. -1349.0

--- Category-wise Expense ---
Entertainment : Rs. 899.0
Shopping      : Rs. 2000.0
Food          : Rs. 450.0

```

---

## Project Architecture

The project follows a **modular, responsibility-driven design**.

### Core Components

#### Expense
Represents a single expense entry.  
Stores amount, category, note, and date.

- Encapsulation through private fields
- Clean `toString()` override for readable output

#### Income
Represents an income transaction with source, amount, note, and date.

#### Transaction Management
Manages collections of expenses and incomes using dynamic data structures.

Responsibilities include:
- adding records
- deleting records
- searching transactions
- calculating totals
- generating reports

#### Category Management
Defines valid expense categories to maintain data consistency and prevent invalid inputs.

#### Main Application (SpendWiseMain)
Acts as the control layer:
- displays menu
- takes user input
- routes actions to appropriate managers
- ensures smooth program flow

---

## Object-Oriented Design Principles Used

- **Encapsulation**  
  All data fields are private and accessed via methods to protect internal state.

- **Abstraction**  
  Users interact with high-level operations (add, view, report) without knowing how data is stored internally.

- **Modular Design**  
  Each class has a single, well-defined responsibility.

- **Extensibility**  
  The structure allows easy addition of:
  - budgets
  - new categories
  - GUI
  - database integration

---

## Tech Stack

- **Language:** Java  
- **Paradigm:** Object-Oriented Programming  
- **Data Structures:** ArrayList  
- **Persistence:** File-based storage  
- **Interface:** Console (menu-driven)  

---

## How to Run

1. Clone the repository
```

git clone [https://github.com/shristi482004/Spendwise-A-Java-Expense-Tracker](https://github.com/shristi482004/Spendwise-A-Java-Expense-Tracker)

```

2. Compile the program
```

javac SpendWiseMain.java

```

3. Run the application
```

java SpendWiseMain

```

---

## Limitations

- Console-based UI (no GUI yet)
- File-based storage instead of a database
- Single-user system

These are intentional design choices to keep the focus on **core logic and clean architecture**.

---

## Future Improvements

- GUI using JavaFX or Swing
- Database integration (MySQL / SQLite)
- User authentication & profiles
- Monthly budgets & alerts
- Graphical analytics and charts
- Export reports to CSV or PDF

---

## Why This Project Matters

SpendWise is not just a CRUD application — it models a **real financial workflow**:
- income vs expense tracking
- data persistence
- report generation
- user-driven analysis

It demonstrates:
- strong Java fundamentals
- OOP design thinking
- ability to build maintainable systems

---

## Author

**Shristi**  
Computer Science Undergraduate  
Interested in software engineering, system design, and real-world problem solving.

---

If you found this project interesting or have suggestions for improvement, feel free to open an issue or contribute.
```


