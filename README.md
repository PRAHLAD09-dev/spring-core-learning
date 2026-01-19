# Spring Core Learning (IOC → Annotations)

This repository documents my step-by-step learning of Spring Core concepts, moving from
traditional XML-based configuration to modern annotation-driven configuration.

The goal was to clearly understand IOC, Dependency Injection, and Bean lifecycle
before moving to Spring Boot.

---

## Learning Breakdown

### Day 1 – IOC using XML
Project: spring-core-ioc

- Pure XML configuration
- Bean creation using <bean>
- Constructor Injection
- Setter Injection
- Interface-based design (PaymentGateway, MessageService)
- Manual wiring using spring.xml

Key concepts learned:
- IOC Container
- BeanFactory vs ApplicationContext
- Tight vs Loose coupling

---

### Day 2 – Java + XML Configuration
Project: day2-spring-core-java-XML

- Java classes + XML bean configuration
- Cleaner package structure
- Real-world style service layer
- Constructor-based DI preferred
- XML still controls bean wiring

Key concepts learned:
- Why constructor injection is preferred
- Separation of service, payment, notification layers
- XML drawbacks in large projects

---

### Day 3 – Java + Annotations
Project: day3-spring-core-java-annotation

- XML completely removed
- Beans created using annotations
- Java-based configuration class

Annotations used:
- @Component
- @Service
- @Autowired
- @ComponentScan
- @Configuration

Key concepts learned:
- Annotation-based IOC
- Component scanning
- Reduced boilerplate
- Cleaner and maintainable configuration

---

### Day 4 – Annotation Only (Modern Spring Style)
Project: day4-spring-core-annotation-only

- No XML
- No external Java config layer
- Fully annotation-driven
- Single implementation per interface (no qualifier needed)

Key concepts learned:
- How Spring Boot style configuration works internally
- Auto-detection of beans
- Why explicit config layers are rarely written today
- Foundation for Spring Boot auto-configuration

---

## Core Concepts Covered
- Inversion of Control (IOC)
- Dependency Injection (DI)
- Constructor vs Setter Injection
- Loose Coupling using Interfaces
- Bean creation and wiring
- Component Scanning
- Annotation-based configuration

---

## Key Takeaway

Spring configuration has evolved over time:
- XML-based configuration (legacy)
- Java-based configuration
- Annotation-driven configuration (modern)
- Auto-configuration in Spring Boot

This repository completes Spring Core fundamentals and serves as a base
for advanced backend development using Spring Boot.

---

## Status
Spring Core fundamentals completed.  
Next phase: Spring Boot (MVC + REST, JPA, Security).