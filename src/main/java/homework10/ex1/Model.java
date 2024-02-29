package homework10.ex1;

public class Model extends AbstractMobilePhone implements InterfaceMobile {
  /**
   * wide-angle lens
   */
  public Model(int modelNumber) {
    this.modelNumber = modelNumber;
  }

  @Override
  protected void airDrop() {
    System.out.println("AirDrop Is Available");
  }


  protected boolean wideAngleLens(int mp) {
    if (mp > 12) return true;
        return false;
  }


  public void call() {
    System.out.println(calling);
  }

  @Override
  public void sendMessage() {
    InterfaceMobile.super.sendMessage();
  }
}
