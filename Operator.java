public class Operator {
  private int ID;
  private double talkingCharge;
  private double messageCost;
  private double networkCharge;
  private int discountRate;

  public Operator(int ID, double talkingCharge, double messageCost, double networkCharge, int discountRate) {
    this.ID = ID;
    this.talkingCharge = talkingCharge;
    this.messageCost = messageCost;
    this.networkCharge = networkCharge;
    this.discountRate = discountRate;
  }

  public double getTalkingCharge() {
    return this.talkingCharge;
  }

  public void setTalkingCharge(double talkingCharge) {
    this.talkingCharge = talkingCharge;
  }

  public double getMessageCost() {
    return this.messageCost;
  }

  public void setMessageCost(double messageCost) {
    this.messageCost = messageCost;
  }

  public double getNetworkCharge() {
    return this.networkCharge;
  }

  public void setNetworkCharge(double networkCharge) {
    this.networkCharge = networkCharge;
  }

  public int getDiscountRate() {
    return this.discountRate;
  }

  public void setDiscountRate(int discountRate) {
    this.discountRate = discountRate;
  }

  public double calculateTalkingCost(int minute, Customer customer) {
    // Calculating amountn to pay for talking
    return 0;
  }

  public double calculateMessageCost(int quantity, Customer cusomter) {
    return 0;
  }

  public double calculateNetworkCost(double amount) {
    return 0;
  }

}
