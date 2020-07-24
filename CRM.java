import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;


abstract class Person {
  private String name;
  private String phone_number;
  private int age;

  protected Person() {}

  protected Person(String new_name) {
    setName(new_name);
  }
  
  protected Person(String new_name, String new_phone_number) {
    setName(new_name);
    setPhoneNumber(new_phone_number);
  }

  protected Person(String new_name, String new_phone_number, int new_age) {
    setName(new_name);
    setPhoneNumber(new_phone_number);
    setAge(new_age);
  }

  protected void setPhoneNumber(String new_phone_number) {
    phone_number = new_phone_number;
  }

  public String getPhoneNumber() {
    return phone_number;
  }
  
  protected void setName(String characterName) {
    name = characterName;
  }

  public String getName() {
    return name;
  }

  protected void setAge(int new_age) {
    age = new_age;
  }

  public int getAge() {
    return age;
  }

  public void print() {
    System.out.println("Name: " + getName());
    System.out.println("Phone: " + getPhoneNumber());
    System.out.println("Age: " + getAge());
  }

}

class Employee extends Person {

  private String id;
  
  public void setAll(String new_name, String new_phone, int new_age, String new_id) {
    setName(new_name);
    setPhoneNumber(new_phone);
    setAge(new_age);
    setID(new_id);
  }

  public Employee() {}

  public Employee(String new_name, String new_phone, int new_age, String new_id) {
    setAll(new_name, new_phone, new_age, new_id);
  }

  public void setID(String new_id) {
    id = new_id;
  }

  public String getID() {
    return id;
  }

  public void print() {
    super.print();
    System.out.println("ID: " + getID());
  }

}

class SalesLead extends Person {

  private String company;
  
  public SalesLead(String new_name, String new_phone, int new_age, String new_company) {
    super(new_name, new_phone, new_age);
    setCompany(new_company);
  }

  public void setCompany(String new_company) {
    company = new_company;
  }

  public String getCompany() {
    return company;
  }

  public void print() {
    super.print();
    System.out.println("Company: " + getCompany());
  }
}

public class CRM {

  static void parseCRMFileLine(Employee emp,String line) {
    String fields[] = line.split(",");
    String new_name = fields[0];
    String new_phone = fields[1];
    String new_id = fields[3];
    int new_age = 0;
    try {
      new_age = Integer.parseInt(fields[2]);
    } catch (NumberFormatException e) {
    new_age  = 0;
    }
    emp.setAll(new_name, new_phone, new_age, new_id);
  }

  static void readFromCRMDataFile() {
    String text_line;
    Employee employee = new Employee();
    ArrayList<Employee> employees = new ArrayList<Employee>();
    try {
      File crm_file = new File("crm.txt");
      Scanner file_scanner = new Scanner(crm_file);
      text_line = file_scanner.nextLine ();
      parseCRMFileLine(employee,text_line);
    } catch (FileNotFoundException e) {
      e.printStackTrace();    
    }
    employees.add(employee);
    employees.get(0).print();
  }

  public static void main(String[] args) {
    readFromCRMDataFile();
  }
}

