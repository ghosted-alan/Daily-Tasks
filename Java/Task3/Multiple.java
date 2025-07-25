package Task3;

interface Printable {
 void printing();
}

interface Scannable {
 void scanning();
}

class MultiPrinter implements Printable, Scannable {
 public void printing() {
     System.out.println("Documents Printed");
 }

 public void scanning() {
     System.out.println("Documents Scanned");
 }
}

//Main class to test the implementation
public class Multiple {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     MultiPrinter mfp = new MultiPrinter();
     mfp.printing();
     mfp.scanning();
 }
}

