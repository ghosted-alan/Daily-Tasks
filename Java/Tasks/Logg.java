package Tasks;

interface Logger {
 default void logInfo() {
     System.out.println("Info: This is an info message.");
 }

 static void logError() {
     System.out.println("Error: This is an error message.");
 }
}

class AppLogger implements Logger {
 
}

public class Logg {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     AppLogger logger = new AppLogger();

     logger.logInfo();

     Logger.logError();
 }
}

