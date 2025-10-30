[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/lTzV_pOa)
# 🧮 Smart Utility Calculator

## 🎯 Objective
Practice using branching statements (`if`, `if-else`, `else-if`, `switch`) to solve real-world problems through multiple decisions.

---

## 📝 Problem Statement
Write a Java program that performs different utility calculations based on a user's choice.  
The program should display the following menu:

==== Smart Utility Calculator ====
1. Check if a number is Even or Odd
2. Find the largest of three numbers
3. Grade Calculator
4. Simple Calculator (+, -, *, /)
5. Exit
   Enter your choice:

### Program Requirements

1. **Use a `switch` statement** to handle the user’s menu selection.  
2. Inside each case, **use `if-else` statements** to make decisions as needed.  
3. **Handle invalid menu choices** gracefully.

---

## 💡 Case Details

### **Case 1: Even or Odd**
- Declare and initialize an integer `n`.
- Print `"Even"` if divisible by 2, otherwise print `"Odd"`.

### **Case 2: Largest of Three Numbers**
- Declare and initialize three integers `a`, `b`, and `c`.
- Use **nested if-else** statements to find and print the largest number.

### **Case 3: Grade Calculator**
- Declare and initialize a score (`0–100`).
- Use an **else-if ladder**:


### **Case 4: Simple Calculator**
- Declare and initialize two numbers and an operator (`+`, `-`, `*`, `/`).
- Use a **nested switch** inside this case to perform the operation.
- Print the result.
- Handle **division by zero** properly.

### **Case 5: Exit**
- Print `"Goodbye!"` and stop the program.

### **Invalid Choice**
- Display `"Invalid menu option."`

90–100 → A
80–89 → B
70–79 → C
60–69 → D
Below 60 → F

---

## 💻 Sample Output

==== Smart Utility Calculator ====
1. Check if a number is Even or Odd
2. Find the largest of three numbers
3. Grade Calculator
4. Simple Calculator
5. Exit
   Enter your choice: 3
   Enter your score: 85
   Grade: B

---

## 🧾 Grading Criteria (Total: 100 points)

| Category | Description | Points |
|-----------|--------------|--------|
| **1. Program Structure** | Correct `class` and `main()` definition, proper syntax, indentation, and comments describing purpose. | 10 pts |
| **2. Menu Logic (switch-case)** | Correctly implements main switch with all 5 cases and default. Each case executes properly. | 15 pts |
| **3. Case 1 – Even/Odd Check** | Correct use of `if-else` to determine parity; accurate output formatting. | 10 pts |
| **4. Case 2 – Largest of Three Numbers** | Proper use of nested `if-else` or chained conditions to find and print the largest value. | 15 pts |
| **5. Case 3 – Grade Calculator** | Correct `else-if` ladder, valid range checking (0–100), accurate letter grade output. | 15 pts |
| **6. Case 4 – Simple Calculator** | Correct internal switch for operators (+, -, *, /). Includes division-by-zero check and valid results. | 15 pts |
| **7. Case 5 – Exit / Default Handling** | Prints `"Goodbye!"` for 5 and `"Invalid option"` for any other number. | 5 pts |
| **8. Output Clarity & Testing** | Sample test values provided; outputs clearly labeled and easy to interpret. | 10 pts |
| **9. Code Readability & Comments** | Consistent indentation, spacing, and at least one explanatory comment per case. | 5 pts |

---

👩‍🏫 **Instructor:** Dr. Loubna Dali

