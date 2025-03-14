# Selenium Automation Test Suite

Welcome to the **Selenium Automation Test Suite**! This repository contains a collection of automation tests designed to perform actions like handling alerts, interacting with iframes, and navigating browser windows using Selenium WebDriver in Java.

The tests are written using **TestNG** framework and the code is structured to handle common web interaction scenarios, such as alerts, iframes, checkboxes, radio buttons, and browser navigation.

---

## Table of Contents
1. [Project Overview](#project-overview)
2. [Prerequisites](#prerequisites)
3. [Test Suite Description](#test-suite-description)
    - [Handle Alerts Test](#handle-alerts-test)
    - [Iframe, Checkbox, and Radio Button Test](#iframe-checkbox-and-radio-button-test)
    - [Browser Navigation Test](#browser-navigation-test)
4. [Setup Instructions](#setup-instructions)
5. [Running the Tests](#running-the-tests)
6. [Contributing](#contributing)
7. [License](#license)

---

## Project Overview

This project demonstrates a range of browser interaction tests using Selenium WebDriver. It includes tests for:

- Handling JavaScript alerts (accepting, dismissing, and sending input to prompts).
- Interacting with iframes, checkboxes, and radio buttons.
- Navigating between web pages, refreshing, and handling multiple browser windows and tabs.

---

## Prerequisites

Before running the tests, make sure you have the following installed:

- **Java** (version 8 or higher)
- **Maven** (for managing dependencies)
- **Selenium WebDriver**
- **TestNG**
- **WebDriverManager** for managing WebDriver binaries
- **ChromeDriver** (automatically managed by WebDriverManager)

---

## Test Suite Description

### 1. Handle Alerts Test
This test is designed to interact with JavaScript alerts on a webpage. It demonstrates:
- Clicking a button that triggers an alert.
- Accepting the alert.
- Handling confirm dialogs (accepting and dismissing).
- Interacting with prompt dialogs (sending text input and accepting).

**Key actions:**
- Clicking a button to trigger a JS alert.
- Handling alert popups (accept, dismiss, and input handling).

### 2. Iframe, Checkbox, and Radio Button Test
This test interacts with elements inside an iframe, and demonstrates the following:
- Switching into and out of an iframe.
- Clicking radio buttons.
- Clicking checkboxes.

**Key actions:**
- Switching to an iframe.
- Interacting with radio buttons and checkboxes inside the iframe.
- Returning to the main content after finishing iframe interactions.

### 3. Browser Navigation Test
This test focuses on browser navigation commands and tab/window handling. It includes:
- Navigating to different URLs using `navigate()`.
- Going back and forward in the browser history.
- Refreshing the page.
- Opening new browser tabs and windows.

**Key actions:**
- Navigating to multiple URLs using `navigate().to()`.
- Moving forward and backward in browser history.
- Opening new browser windows and tabs.

---

## Setup Instructions

To set up this project on your local machine, follow the steps below:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/fablihaafia/Locator_For_Iframe_Alert_NavigateWebpage
   cd Locator_For_Iframe_Alert_NavigateWebpage
   ```

2. **Install Dependencies:**
   This project uses **Maven** for dependency management. To install the necessary dependencies, run:
   ```bash
   mvn install
   ```

   Maven will automatically download the required Selenium WebDriver, TestNG, and WebDriverManager dependencies.

3. **Download and Configure ChromeDriver:**
   The `WebDriverManager` will automatically download the correct version of ChromeDriver, so you don't need to worry about manually setting it up.

---

## Running the Tests

Once you've set up the project, you can run the tests using Maven or your IDE.

### Using Maven:

To run all tests from the command line:
```bash
mvn test
```

### Using IDE (e.g., IntelliJ IDEA or Eclipse):

1. Open the project in your IDE.
2. Right-click on the `Test` class (e.g., `Handle_Alert`, `Iframe_Checkbox_Radiobutton`, `NavigateBrowser`) and select **Run**.

---

## Contributing

If you want to contribute to this project, feel free to fork the repository, make improvements or fix bugs, and submit a pull request. Please ensure that your changes do not break existing tests and that all tests pass before submitting the pull request.

---

## Conclusion

This Selenium Automation Test Suite is designed to help you understand and practice common web interactions, including alerts, iframes, checkboxes, radio buttons, and browser navigation. Whether you're a beginner or an experienced tester, this project serves as a solid foundation for automating browser interactions using Selenium WebDriver. Happy testing! 🚀

