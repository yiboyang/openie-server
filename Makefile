all: Demo.class JsonServer.class

# path to openie jar
openie = ./openie-4.1.jar

Demo.class: Demo.java
	javac -cp $(openie) Demo.java

JsonServer.class: JsonServer.java
	javac JsonServer.java

clean:
	rm -f *.class
