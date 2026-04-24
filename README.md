# Flipkart Selenium Automation (TestNG + Maven)

## 📌 Project Overview
This project is a test automation framework built using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**.  
It automates a basic user flow on Flipkart:
- Search for a product
- Select product from search results
- Add product to cart
- Verify "Place Order" button

The framework follows the **Page Object Model (POM)** design pattern for better code structure and maintainability.

---

## 🛠️ Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver

---

## 🚀 How to Run the Project

### 1️⃣ Prerequisites
- Java installed
- Maven installed
- Chrome browser installed
- ChromeDriver placed in `/drivers` folder

---

## 🔍 Features
- Page Object Model (POM) design pattern  
- Explicit waits using WebDriverWait  
- TestNG assertions  
- Popup handling  
- Scroll using JavaScriptExecutor  

---

## 3️⃣ Run via TestNG
- Right-click on `testng.xml`
- Select **Run As → TestNG Suite**

---

### 2️⃣ Run via Maven
```bash
mvn clean test




