import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

class main {

static string impor.text = "";
static string Public.text = "";
static string PS.text = "";

public static void main(String[] args) {
try {
File ArrayList_file = new File("ArrayList.java");
Scanner file_scanner = new Scanner(ArrayList_file);
impor.text = file_scanner.nextLine ();
Public.text = file_scanner.nextLine ();
PS.text = file_scanner.nextLine ();

} catch (FileNotFoundException e) {
e.printStackTrace();

System.out.println("impor.text.");
System.out.println("Public.text.");
System.out.println("PS.text.");
}
}
}