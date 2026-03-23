# E-Commerce Backend Application

## ADP372S - Applications Development Practice 3
**Assignment 1: Domain Driven Design Implementation**

**Group Lead:** [Student Name] ([Student Number])  
**Due Date:** Friday, 27th March 2026 at 23:59  

---

## Project Overview
This is an enterprise-level e-commerce backend application developed using Domain Driven Design (DDD) principles in Java. The project demonstrates best practices in software architecture, including Domain entities, Factories, and Repositories with Test-Driven Development (TDD).

---

## Project Structure

```
src/
├── main/java/com/ecommerce/
│   ├── domain/          # Domain entities (Aggregates and Value Objects)
│   ├── factory/         # Factory classes for creating domain objects
│   └── repository/      # Repository interfaces and implementations
│       └── impl/        # Repository implementation classes
└── test/java/com/ecommerce/
    ├── domain/          # Domain entity tests
    ├── factory/         # Factory test classes (TDD)
    └── repository/      # Repository test classes (TDD)
```

---

## Package Responsibilities

| Package | Purpose | Responsibility |
|---------|---------|-----------------|
| `com.ecommerce.domain` | Domain entities using Builder Pattern | Each team member implements their assigned entity |
| `com.ecommerce.factory` | Factory classes for object creation | Each team member implements their entity's factory |
| `com.ecommerce.repository` | Repository interface (IRepository) | Generic CRUD operations |
| `com.ecommerce.repository.impl` | Repository implementations | Each team member implements their entity's repository |

---

## UML Class Diagram

[Insert your domain model UML class diagram here - use StarUML or similar tool]

### Domain Entities (To be added during implementation):
- [Entity Name] - [Brief Description]
- [Entity Name] - [Brief Description]
- [Entity Name] - [Brief Description]

---

## Tech Stack

- **Language:** Java 11
- **Build Tool:** Maven 3.6+
- **Testing Framework:** JUnit 4
- **Code Generation:** Lombok (Builder Pattern)
- **Logging:** SLF4J + Logback
- **IDE:** IntelliJ IDEA

---

## Dependencies

See `pom.xml` for complete dependency list:
- JUnit 4.13.2 (Testing/TDD)
- Lombok 1.18.30 (Builder Pattern support)
- SLF4J 2.0.7 (Logging API)
- Logback 1.4.11 (Logging implementation)

---

## Build Instructions

```bash
# Clean and build the project
mvn clean install

# Run tests
mvn test

# Package the application
mvn package
```

---

## Team Members

| Name | Student Number | GitHub Username | Entity/Component |
|------|-----------------|-----------------|------------------|
| [Lead Name] | [XXXXXXXX] | [username] | Team Lead |
| [Member Name] | [XXXXXXXX] | [username] | [Component] |
| [Member Name] | [XXXXXXXX] | [username] | [Component] |
| [Member Name] | [XXXXXXXX] | [username] | [Component] |
| [Member Name] | [XXXXXXXX] | [username] | [Component] |

---

## GitHub Repository Links

- **Team Lead Repository:** [GitHub URL]
- **Member Repositories:** 
  - [Member Name]: [GitHub URL]
  - [Member Name]: [GitHub URL]
  - [Member Name]: [GitHub URL]
  - [Member Name]: [GitHub URL]
  - [Member Name]: [GitHub URL]

---

## Milestones

- **Milestone 1 - Entity:** Friday, 13th March 2026
  - Create domain entities using Builder Pattern
  
- **Milestone 2 - Factory:** Monday, 16th March 2026
  - Create factory classes with TDD
  
- **Milestone 3 - Repository:** Sunday, 22nd March 2026
  - Create repositories and implementations with TDD

- **Final Submission:** Friday, 27th March 2026 at 23:59
  - All code merged, tested, and synchronized

---

## Design Principles

- **Code to Abstraction, Not Concretion:** Use interfaces for repositories
- **Builder Pattern:** All domain entities use the Builder Pattern for construction
- **Test-Driven Development:** All factory and repository classes include comprehensive tests
- **Domain-Driven Design:** Clear separation of domain, factory, and repository layers

---

## Contribution Guidelines

1. Accept the collaboration invitation from your Team Lead
2. Fork the repository to your GitHub account
3. Clone your fork to your local machine
4. Create a branch using your **student number** as the branch name
5. Implement your assigned entity, factory, and repository
6. Write comprehensive test cases (TDD approach)
7. Push to your remote branch
8. Create a Pull Request to the main repository
9. Wait for Team Lead approval and merge

---

## Contact & Support

**Lecturers:** Sabre Didi, Temuso Makhurane, Kruben Naidoo & Israel Tchouya'A Ngoko  
**Course:** Applications Development Practice 3 (ADP372S)

---

© Copyright reserved 2026. Prepared by Kruben Naidoo.