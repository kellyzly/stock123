

stock123



how to generate  a mvn java project

mvn archetype:generate -DgroupId=kellyzly -DartifactId=stock123 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

|-src
   |---main
   |-----java
   |-------kellyzly
   |-----------App.java
   |---test|-----java
   |---------kellyzly
   |-----------AppTest.java
   |-pom.xml