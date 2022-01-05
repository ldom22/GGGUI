#Make for MAC OS

cd src
javac *.java
mv *.class ./gfsh
cd gfsh
javac *.java
mv *.class ../../class
cd ../../class
jar cfe GGGUI.jar Connections *.class com/
mv GGGUI.jar ../jar