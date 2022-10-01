package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("veritabanina loglandi.");
		}
		else if (logType == 2) {
			System.out.println("dosyaya loglandi.");
		}
		else {
			System.out.println("email gonderildi.");
		}
	}
	
}
//1 - DB
//2 - File
//3 - Email