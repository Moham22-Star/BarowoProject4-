abstract class Person {
  private String name;
  private String phone_number;
  private int age;

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
  
  public Employee(String new_name, String new_phone, int new_age, String new_id) {
    super(new_name, new_phone, new_age);
    setID(new_id);
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

  public static void main(String[] args) {
    Employee johnSmith = new Employee("John Smith","920-227-3248",18,"id-abc-123");
    SalesLead judySmith = new SalesLead("Judy Smith","920-227-3249",19,"Apple");
    judySmith.print();
    johnSmith.print();
  }
}