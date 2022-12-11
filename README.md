## 📑 About the Project

<p align="justify">This repo contains the deep-dive into a mobile testing using Appium with a simple app called "simple-app". 
This repo could be a boilerplate too. 
Happy cracking!</p>

<!--
## 📝 Reports

#### Login
![report-api-login](https://user-images.githubusercontent.com/68207916/186056420-bf4e443d-2e33-45e8-a07c-ac6757ceb643.png)

#### Register
![report-api-register](https://user-images.githubusercontent.com/68207916/186057740-8d5ea020-f722-4d6e-a8ba-098efb53426c.png)

#### Chats
![report-api-chats](https://user-images.githubusercontent.com/68207916/186059526-aa1641ed-12c8-47c1-9eae-e8f9aa9daa73.png)
-->
## 🛠 Tools

**Automation :**

![IntellijIDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

**Framework for automation:**

![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Cucumber](https://img.shields.io/badge/-cucumber-4bc47b?style=for-the-badge&logo=cucumber&logoColor=black)

**Test Case Management:**  

![Google Sheets](https://img.shields.io/badge/-Google%20sheets-4bc47b?style=for-the-badge&logoColor=black)

## 📱 Lets connect!

  [![LinkedIn](https://img.shields.io/badge/-Rahdian%20Abdi-white?style=for-the-badge&logo=linkedin&logoColor=blue)](https://www.linkedin.com/in/rahdianabdi/)
  [![GitHub](https://img.shields.io/badge/-rahdianabdi-white?style=for-the-badge&logo=github&logoColor=black)](https://github.com/rahdian-abdi)

## How to run the test
To run the this project, you can either just run the `CucumberTestSuite` test runner class, or run `mvn verify` from terminal.

This is how you run it :

1. Clone the repository
```json
$ git clone https://github.com/rahdian-abdi/simpleapp-mobile-automation.git
```
2. In case there is a poput asked whether the project based on Maven or Gradle, choose Maven
3. Run this on the IDE terminal
```json
$ mvn clean verify
```

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ mvn clean verify -Ddriver=firefox
```

The test results will be recorded in the `target/site/serenity` directory.

Happy Testing!
