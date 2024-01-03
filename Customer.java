public class Customer {
  private int ID;
  private String name;
  private int age;
  private Operator operator;
  private Bill bill;

  public Customer(int ID, String name, int age, Operator operator, double limitingAmount) {
    this.ID = ID;
    this.name = name;
    this.age = age;
    this.operator = operator;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  public Bill getBill() {
    return bill;
  }

  public void setBill(Bill bill) {
    this.bill = bill;
  }
  void talk(int minute, Customer other) {
    // Customer talking to another customer
  }

  void message(int quantity, Customer other) {
    // Customer to send message, 
    // Quantity = Number of Message
  }

  void connection(double amount) {
    // Customer to conect to internet
    // Amount = data in MB
  }

}
