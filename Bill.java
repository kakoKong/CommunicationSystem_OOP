public class Bill {
  private double limitingAmount;
  private double currentDebt;

  public Bill(double limitingAmount) {
    this.limitingAmount = limitingAmount;
  }

  public boolean check(double amount) {
    // check if limit exceeded
    return true;
  }

  public void add(double amount) {
    // add debt
  }

  public void pay(double amount) {
    // pay debt
  }

  public void changeTheLimit(double amount) {
    // chaning limiting amount
  }

  public double getLimitingAmount() {
    return this.limitingAmount;
  }
  
  public double getCurrentDebt() {
    return this.currentDebt;
  }
}
