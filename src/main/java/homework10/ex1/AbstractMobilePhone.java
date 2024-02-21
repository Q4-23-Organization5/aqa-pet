package homework10.ex1;

public abstract class AbstractMobilePhone {
/**
 *  - FACE TIME
 *  - AIR DROP
 */
protected int modelNumber;



  protected boolean faceTime() {

    if (modelNumber > 0) {
      return true;
    } else {
        return false;
    }

  }

  protected abstract void airDrop();

  public String toString() {
    return "modelNumber = " + modelNumber;
  }

}
