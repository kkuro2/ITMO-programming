javac -cp Pokemon.jar */*.java */*/*.java -d build/
cd build 
jar -cfm Main.jar MANIFEST.txt */*/*.class */*/*/*.class