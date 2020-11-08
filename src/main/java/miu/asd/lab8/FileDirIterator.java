package miu.asd.lab8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FileDirIterator {
  protected String name;
  protected Collection<File> fileList;
  protected Collection<Directory> dirList;

  public FileDirIterator() {
    this.fileList = new ArrayList<File>();
    this.dirList = new ArrayList<Directory>();
  }

  public void addFile(File file){
    fileList.add(file);
  }

  public void addDir(Directory directory){
    dirList.add(directory);
  }

  public Iterator createFilesIterator() {
    return fileList.iterator();
  }

  public Iterator createDirsIterator() {
    return dirList.iterator();
  }

  public int computeSize(){
    int sizeInBytes=0;
    Iterator filesIterator = createFilesIterator();
    while(filesIterator.hasNext()) {
      File file = (File) filesIterator.next();
      sizeInBytes += file.getSizeInBytes();
    }
    Iterator dirsIterator = createDirsIterator();
    while(dirsIterator.hasNext()) {
      Directory dir = (Directory) dirsIterator.next();
      sizeInBytes += dir.computeSize();
    }
    return sizeInBytes;
  }

  public void print(){
    System.out.println("- drive " + name);
    for (Directory dir : dirList){
      dir.print();
    }
    for (File file : fileList){
      file.print();
    }
  }
}
