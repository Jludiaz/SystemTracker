# System Tracker Project

## Project Introduction

A Java application that monitors your system's hardware metrics and sends detailed reports via email. Get insights into CPU performance, memory usage, temperature readings, and other critical system metrics delivered straight to your inbox.

## Features 

- Real-time hardware monitoring including:

  - CPU metrics (load, cores, frequency, temperature)
  - Memory usage and availability
  - Graphics card information
  - Power source status
  - System temperatures and fan speeds
  - Sound card details


- Automated email reporting using secure SMTP
- Detailed hardware component identification
- System sensor readings


## Dependencies/Methods

- OSHI (Operating System and Hardware Information): Hardware metrics collection
- Apache Commons Email: Email functionality
- JNA (Java Native Access)

## Configuration

1. Update the email credentials in MessageSender.java

```java
mail.setAuthentication("your-email@gmail.com", "your-app-password");
```

2. Set your recipient email address in Main.java:
```java
String recipient = "recipient@email.com";
```

## Author
Jeremy Lu Diaz
jludiaz@gwu.edu
George Washington University







