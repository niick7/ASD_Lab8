package miu.asd.lab8;

public class Application {
  public static void main(String[] args) {
    Drive cDrive = new Drive("C");
    Directory appDir = new Directory("applications");
    Directory dataDir = new Directory("my data");
    Directory courseDir = new Directory("cs525");
    File excelFile = new File("msExcel.exe", 2353256);
    File wordFile = new File("msWord.exe", 3363858);
    File studentsFile = new File("students.doc", 34252);
    cDrive.addDir(appDir);
    cDrive.addDir(dataDir);
    dataDir.addDir(courseDir);
    appDir.addFile(excelFile);
    appDir.addFile(wordFile);
    courseDir.addFile(studentsFile);
    cDrive.print();
  }
}
