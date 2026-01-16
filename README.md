# Spring Core Learning 

This repository contains my day-wise learning and implementation of Spring Core.

---

## Day 1 – Spring Core IOC (XML Based Configuration)

### Topics Covered
- What is IOC (Inversion of Control)
- Dependency Injection using XML
- Spring IOC Container
 - ClassPathXmlApplicationContext
- Constructor Injection
- Setter Injection

### Example Modules
- Payment Module (UPI Payment , Card Payment)
- Notification Module (Email Notification , SMS Notificatin)

### Output
- Payment of ₹ 999.0 done using UPI
- Order placed succesfully
- Email sent: Your order is confirmed.


---

# Day 2 – Spring Core (Java + XML Configuration)

## Objective
Understand Dependency Injection (IOC) using Java classes + XML configuration.

---

### Topics Covered
- Constructor Injection
- Setter Injection
- Loose Coupling using Interfaces
- XML based bean configuration

---

## Project Structure
- payment
 - PaymentGateway (interface)
 - UpiPayment (implementation)
 - CardPayment (implementation)

- notification
 - MessageService (interface)
 - EmailService (implementation)
 - SmsService (implementation)

- service
 - OrderService

- resources
 - spring.xml

---

## IOC Implementation

### Constructor Injection (Payment)
- OrderService depends on PaymentGateway
- Injected using constructor via XML

### Setter Injection (Notification)
- OrderService depends on MessageService
- Injected using setter via XML

---

## XML Configuration (spring.xml)
- Beans are defined for implementation classes
- Dependencies are wired using:
  - <constructor-arg>
  - <property>

---

## Output
- Payment of ₹2000.0 done using CARD
- SMS sentYour order is confirmed
- Order placed successfully

## Tech Stack
- Java
- Spring Core
- Maven
- Eclipse IDE

---

## Upcoming
- Day 3: java + Annotations
- Day 4: Full Annotation based Spring Core