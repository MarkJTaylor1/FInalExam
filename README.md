Technology used:

Tool: Selenium

Language: Java

IDE: Intellij IDEA

Build tool: Maven
Framework: TestNG

Prerequisite:
Need to install jdk 17 and configure it into Environment variable
Download maven and configure it into Environment variable also

Run the automation script:
Open the project with Intellij IDEA by clicking on pom.xml
Let the Intellij IDEA to download the dependencies for the first run
After dependencies are downloaded and project loaded successfully, click on Terminal from the bottom bar

To run "regression" or "smoke" test, just go to "testng.xml" file and replace the word from "regression" to "smoke" or vice versa
<groups>
  <run>
     <include name = "regression"></include>
  </run>
</groups>

Right click on "testng.xml" file and click on "Run" or Type in the terminal:

mvn clean test

Selenium will open the browser and start automation.

To view report of the automation execution, expand the target->surefire-reports folder and open "index.html" in a browser
