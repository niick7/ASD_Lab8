package miu.asd.lab8;

public class Drive extends FileDirIterator {
  public Drive(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println("- Drive " + name);
    super.print();
  }
}
