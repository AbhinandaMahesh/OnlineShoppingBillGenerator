# Online Shopping Bill Generator

A simple Java console application that simulates an online shopping system where users can select products, specify quantities, and generate a final bill with applicable discounts.

## Features

- Product selection from a predefined list:
  - Laptop: R50,000
  - Mobile: R20,000
  - Headphone: R2,000
- Quantity-based pricing
- Automatic 10% discount on orders over R50,000
- User-friendly console interface
- Final bill amount rounded to the nearest whole number

## How to Use

1. Run the program
2. Select products by entering the corresponding number (1-3)
3. Enter the quantity when prompted
4. Continue selecting products or choose option 4 to checkout
5. View your final bill amount with any applicable discounts

## Code Structure

- Main class: `project` (contains the main method)
- Uses Scanner for user input
- Switch-case for product selection
- While loop for continuous shopping until checkout
- Conditional discount application based on total bill amount

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any Java IDE or command line tool to compile and run Java programs

## Compilation and Execution

1. Compile the code:
   ```
   javac project.java
   ```

2. Run the program:
   ```
   java project
   ```

## Example Usage

```
====== online shop ======
1. Laptop - R50000
2. Mobile - R20000
3. Headphone - R2000
4. checkout
Enter your choice: 
1
Enter quantity: 
2
====== online shop ======
1. Laptop - R50000
2. Mobile - R20000
3. Headphone - R2000
4. checkout
Enter your choice: 
4
checking out....
final bill amount: 90000
```

## Note

This is a simple demonstration project. For a real-world application, you would need to add features like:
- Product inventory management
- Tax calculations
- Payment processing
- Receipt generation
- Database integration
- User authentication
