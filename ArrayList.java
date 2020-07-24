import java.util.ArrayList;

public class CRM {
  public static void main(String[] args) {
    ArrayList<String> Employee = new ArrayList<String>();
    Employee.add("johnSmith");
    Employee.add("judySmith");
    Employee.set(0, "OpelSmith");
    System.out.println(Employee);
  }
}