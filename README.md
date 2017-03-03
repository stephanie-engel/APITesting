# APITesting

1. Install the latest version of Eclipse:

  - https://www.eclipse.org/downloads/ 

1. Install the latest jdk available here:

  - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

1. Set the JAVA_HOME environment varable for the jdk you just installed:

  - (For Mac) https://www.mkyong.com/java/how-to-set-java_home-environment-variable-on-mac-os-x/

1. Add the JAVA_HOME variable to your path:

  - https://cloudlink.soasta.com/t5/CloudTest-Knowledge-Base/Adding-JDK-Path-in-Mac-OS-X-Linux-or-Windows/ta-p/43867

1. Open Eclipse:

  - Click on Eclipse > Preferences > Java > Installed JREs
  - You should see the jdk that you just installed
  - Click the checkbox > Apply

1. Install Gradle:

  - http://macappstore.org/gradle/

1. Create a new Gradle Project

  - File > New > Project > Gradle (and follow the remaining steps)

1. After the new project is created, make sure to update build.gradle to include the plugins, dependencies, and task wrapper listed in the build.gradle file that is associated with this repository.

  - When making edits to the build.gradle file, make sure to:
  - [1] Save the file and 
  - [2] Right-click on the Project folder > click Gradle > Refresh Project (or else Gradle won't recognize changes to the build.gradle file)

1. After the test is created, it can be run an either:

  - [1] a TestNg test or
  - [2] a Gradle test