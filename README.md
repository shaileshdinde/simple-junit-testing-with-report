# 🧪 Simple JUnit Testing with Report

This project demonstrates **basic JUnit testing** with **automated report generation** using **Maven**.  
It’s a simple example for beginners to understand how to write, run, and generate test reports using **JUnit**.

---

## 📂 Project Structure

```
simple-junit-testing-with-report/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── in/shdinde/          # Application source files
│   │           └── App.java
│   └── test/
│       └── java/
│           └── in/shdinde/          # JUnit test files
│               └── AppTest.java
│               └── ArrayFunctionTests.java
│               └── FactorialTests.java
│
├── pom.xml                           # Maven configuration (JUnit + Surefire plugin)
└── README.md
```

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/shaileshdinde/simple-junit-testing-with-report.git
cd simple-junit-testing-with-report
```

---

## 🧰 Prerequisites

Make sure you have the following installed:

- **Java JDK 8+**
- **Apache Maven 3.6+**
- **Git** (for cloning the repository)

You can verify installations:

```bash
java -version
mvn -version
git --version
```

---

## 🧑‍💻 Run the JUnit Tests

Run all JUnit test cases using Maven:

```bash
mvn test
```

Maven will:
- Compile the project.
- Execute all test cases in `src/test/java`.
- Generate a test report automatically.

---

## 📊 View Test Report

After tests complete, Maven Surefire Plugin generates reports at:

```
target/surefire-reports/
```

You’ll find:
- `TEST-*.xml` — XML report (machine-readable)
- `*.txt` — Plain text log of test results

For an **HTML report** (if configured with Surefire or Surefire Report Plugin):

```bash
mvn surefire-report:report
```

The generated HTML report will be available at:

```
target/site/surefire-report.html
```

Open it in your browser:

```bash
start target/site/surefire-report.html      # Windows
xdg-open target/site/surefire-report.html   # Linux
open target/site/surefire-report.html       # macOS
```

---

## 🧩 Example Output

```bash
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.CalculatorTest
Tests run: 16, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec
Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
```

---

## 🛠️ Technologies Used

- **Java**
- **JUnit 5**
- **Maven**
- **Surefire Plugin**

---

## 📚 References

- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)
- [Maven Reporting Plugin](https://maven.apache.org/plugins/maven-surefire-report-plugin/)

---

## 🧑‍🏫 Author

**[Shailesh Dinde](https://github.com/shaileshdinde)**  
Feel free to fork, explore, and learn JUnit testing from this simple example!

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).
