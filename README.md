# Template for Spring Boot project.

## Technical specifications:

- Maven multi module project
- Developed with JDK 11
- Spring Boot 2.7.11
- Jacoco 0.8.10
- JUnit 5
- Github actions
- [Coveralls](https://docs.coveralls.io/) code coverage
- [Hexagonal architecture](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software))

## Status
[![Coverage Status](https://coveralls.io/repos/github/depazjose/localstack/badge.svg?branch=main)](https://coveralls.io/github/depazjose/localstack?branch=main)

## Project structure
```bash
├── application
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│           └── test
├── domain
│   └── pom.xml
│       └── main
│           └── java
│           └── test
├── infrastructure
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│           └── test
├── pom.xml
├── README.md
└── report-coverage
    └── pom.xml

```