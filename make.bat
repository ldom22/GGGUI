cd src
javac *.java
move *.class .\gfsh
cd gfsh
javac *.java
move *.class ..\..\class
cd ..\..\class
jar cfe GGGUI.jar Connections *.class com/
move GGGUI.jar ..\jar
cd ..
