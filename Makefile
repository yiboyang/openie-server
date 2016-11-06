all: OpenIEServer.class

openie = ./openie-4.1.jar

OpenIEServer.class: OpenIEServer.java
	javac -cp $(openie) OpenIEServer.java

clean:
	rm -f *.class
