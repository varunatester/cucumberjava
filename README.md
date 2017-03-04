SampleCucumberJVMApplication
====================================

**Introduction:**

This project is to demonstrate creating a test framework for CucumberJVMApplication
  * IDE Used: **Intellij** Community Edition
  * Style of Writing Tests: **Cucumber-JVM**
  * Programming language: **JAVA**
  * Browser Driver Tool: **Selenium**
  * Build/Dependency Management Tool: **Maven**

**Prerequisties:**

 * Java 1.8 or above
 * Chrome Driver : brew install chromedriver
 * Maven : brew install maven


**Testing Notes:**

* Tested on platform Mac 10.11.6 and browser Chrome 56.0.
  
**How to run test:**

* Run tests through IDE :
       1. Right click the RunFeatures file and run. This will run all the tests under feature folder.
       2. Run specific scenario : Go to Feature file and point to scenario annotation tag, right click and run the specifice test.

* Run tests through command line :
     1.Go to folder location where code is checkout, Run the test using command :mvn test.
* Check Reports :
     1.Reports can be seen under SampleCucumberJVMApplication/target/cucumber/index.html
