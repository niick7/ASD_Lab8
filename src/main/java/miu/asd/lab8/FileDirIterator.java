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

  public Iterator createIterator(Collection collection) {
    return collection.iterator();
  }

  public int computeSize(){
    int sizeInBytes=0;
    Iterator filesIterator = createIterator(fileList);
    while(filesIterator.hasNext()) {
      File file = (File) filesIterator.next();
      sizeInBytes += file.getSizeInBytes();
    }
    Iterator dirsIterator = createIterator(dirList);
    while(dirsIterator.hasNext()) {
      Directory dir = (Directory) dirsIterator.next();
      sizeInBytes += dir.computeSize();
    }
    return sizeInBytes;
  }

  public void print(){
    for (Directory dir : dirList){
      dir.print();
    }
    for (File file : fileList){
      file.print();
    }
  }
}
