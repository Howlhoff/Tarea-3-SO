JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

MAIN = Main

CLASSES = \
	buscador.java \
	sumador.java \
	decodificador.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class