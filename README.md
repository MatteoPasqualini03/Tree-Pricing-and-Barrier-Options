# Object-Oriented Financial Engineering Framework in Java

A modular financial engineering library built in Java designed for option pricing, complex dividend handling, and exotic barrier option evaluation.

## Key Features & Implementations
- **Extended Finmath Framework:** Refactored Java-based quantitative library to extend core lattice pricing algorithms (Cox-Ross-Rubinstein, Boyle Trinomial, Jarrow-Rudd) for equity derivatives.
- **Advanced Dividend Modeling:** Implemented a scalable object-oriented hierarchy supporting proportional, multi-discrete, and continuous yield dividends across lattice structures.
- **Exotic Option Engine:** Built a pricing engine for single-barrier options (Up/Down-and-In/Out) utilizing In-Out parity relationships and backward induction over lattice models.
- **Testing & Benchmarking:** Validated lattice model convergence against closed-form Black-Scholes analytical formulas (Merton / Reiner-Rubinstein) and conducted early-exercise analysis using JUnit.

## Tech Stack
- **Language:** Java
- **Build Tool:** Apache Maven (`pom.xml`)
- **Testing:** JUnit
- **Documentation:** Full project work specification available in `FiMa_Project_Work.pdf`
