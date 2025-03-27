# cucumberFirstGroup2025

## Project Overview

This project is a test automation framework using Java, Selenium, and Cucumber. It includes features for logging in,
purchasing items, and canceling purchases on a sample e-commerce website.

## Setup

### Prerequisites

- Java 11
- Maven
- An IDE (e.g., IntelliJ IDEA)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Atesh-prog/cucumberFirstGroup2025.git
    ```
2. Navigate to the project directory:
    ```sh
    cd cucumberFirstGroup2025
    ```
3. Install the dependencies:
    ```sh
    mvn clean install
    ```
4. Dependencies

The project uses the following dependencies:

    * io.cucumber:cucumber-java:7.0.0
    * io.cucumber:cucumber-testng:7.0.0
    * org.seleniumhq.selenium:selenium-java:4.29.0
    * com.aventstack:extentreports:5.0.9
    * tech.grasshopper:extentreports-cucumber7-adapter:1.1.0

## Folder Structure

- `src/main/java`: Contains the main Java code.
- `src/test/java`: Contains the test code and step definitions.
- `src/test/resources`: Contains the feature files.
- `pom.xml`: Maven configuration file.

## Running Tests

To run the tests, use the following command:

```sh
mvn test
