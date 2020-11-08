package miu.asd.lab8;

public class Directory extends FileDirIterator {
  public Directory(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println("- Directory " + name);
    super.print();
  }
}
