all: Demo.class OpenIEServer.class


openie = ./openie-4.1.jar

Demo.class: Demo.java
	javac -cp $(openie) Demo.java

OpenIEServer.class: OpenIEServer.java
	javac OpenIEServer.java

clean:
	rm -f *.class
