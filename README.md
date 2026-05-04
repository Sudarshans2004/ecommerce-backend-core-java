# 🛒 Ecommerce Backend — Core Java

A console-based e-commerce backend application built with **Core Java**, demonstrating layered architecture, object-oriented programming, and fundamental backend concepts like product management, cart handling, and order processing — all without any framework or database.

---

## 📌 Features

- View all available products with price details
- Add products to cart with real-time stock validation
- Place orders with automatic total bill calculation
- In-memory data store simulating a backend database
- Clean 3-layer architecture: Model → Service → Util

---

## 🏗️ Project Structure

```
src/
└── main/
    └── java/
        └── com/ecomerce/
            ├── Main.java               # Entry point — CLI menu loop
            ├── model/
            │   ├── User.java           # User entity
            │   ├── Product.java        # Product entity with stock management
            │   ├── Cart.java           # Cart (Map of Product → Quantity)
            │   └── Order.java          # Order entity with total amount
            ├── service/
            │   ├── ProductService.java # Add, show, find products
            │   ├── CartService.java    # Add to cart with stock validation
            │   └── OrderService.java   # Place order, calculate total
            └── util/
                └── DataStore.java      # In-memory static data store
```

---

## 🧰 Tech Stack

| Technology | Details |
|---|---|
| Language | Java 17 |
| Build Tool | Maven |
| Architecture | Layered (Model / Service / Util) |
| Storage | In-memory (ArrayList, HashMap) |
| IDE | IntelliJ IDEA |

---

## ▶️ How to Run

### Prerequisites
- Java 17 or above installed
- Maven installed (or use IntelliJ IDEA)

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/Sudarshans2004/ecommerce-backend-core-java.git
cd ecommerce-backend-core-java
```

**2. Build the project**
```bash
mvn compile
```

**3. Run the application**
```bash
mvn exec:java -Dexec.mainClass="com.ecomerce.Main"
```

Or simply open in IntelliJ IDEA and run `Main.java` directly.

---

## 💻 Sample Output

```
1. View Products
2. Add to Cart
3. Place Order
4. Exit

Enter choice: 1
1 Laptop ₹50000.0
2 Phone ₹20000.0

Enter choice: 2
Enter product id: 1
Enter quantity: 1

Enter choice: 3
Order placed! Total: ₹50000.0
```

---

## 🧠 Concepts Demonstrated

- **Object-Oriented Programming (OOP)** — Encapsulation, abstraction via model classes
- **Service Layer Pattern** — Business logic separated from data and entry point
- **Java Collections** — `HashMap<Product, Integer>` for cart, `ArrayList` for store
- **Stock Validation** — Prevents adding items beyond available inventory
- **Static Data Store** — Shared in-memory state across services (simulates a DB)
- **Maven Build Tool** — Dependency and build management

---

## 🚀 Future Improvements

- Add database integration using JDBC + MySQL for persistent storage
- Implement user authentication and login
- Expose REST APIs using Java Servlets or Spring Boot
- Add exception handling and input validation
- Write unit tests using JUnit

---

## 👨‍💻 Author

**Sudarshan Madhusudan Shinde**  
B.E. Electronics & Telecommunication — Shrimati Kashibai Navale College of Engineering, Pune  
📧 sudarshanshinde.skn.entc1@gmail.com  
🔗 [LinkedIn](https://linkedin.com/in/sudarshan-shinde) | [GitHub](https://github.com/Sudarshans2004)
