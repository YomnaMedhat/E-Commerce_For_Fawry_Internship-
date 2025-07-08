# Quantum Shopping System - Java OOP Project

This project is a simulation of an e-commerce shopping system developed using object-oriented programming in Java. It demonstrates inventory management, cart functionality, and checkout processing with support for different product types.

## Features

- Add products to inventory with:
  - Name
  - Price
  - Quantity
  - Additional properties depending on product type (weight, expiry date, etc.)

- Product types supported:
  - **Regular Product**: Basic purchasable items
  - **ShippableProduct**: Physical products that require shipping (with weight)
  - **PreShipping**: Perishable products that require shipping (with weight and expiry date)
  - **ExpirationDate**: Products with expiry dates (non-shippable)

- Shopping functionality:
  - Add items to cart with quantity validation
  - Check product expiry status
  - Calculate subtotals and shipping costs
  - Process payments from customer balance

- Shipping system:
  - Automatic shipping cost calculation ($30 flat rate)
  - Package weight tracking
  - Detailed shipment notices

## Design Note

The system is designed using abstraction and polymorphism, making it easily extensible. New product types can be added by:
1. Extending the base `Product` class
2. Implementing relevant interfaces like `RequiresShipping`
3. No modifications needed to existing cart or checkout logic

## How to Run

NOTE: ACCESS THE CLASSES DIRECTLY OR DOWNLOAD THE ZIP FILE.

1. Open a terminal in the folder containing the file.
2. Compile the Java file:

   javac QuantumBookstoreFullTest.java

3. Run the program:

   java QuantumBookstoreFullTest

## OUTPT OF THE CODE

![image](https://github.com/user-attachments/assets/9ad4bed5-4b71-4b3d-9eb5-abf9b758a78a)

## Author

This project was written manually in plain Java as part of an internship application. It follows the requirements provided in the task.

Yomna Medhat Saad Hashem
