package com.design.patterns.o2_structural.composite;

public class Client {

  public void createComponent() {
    File_Leaf file1 = new File_Leaf("file1");
    File_Leaf file2 = new File_Leaf("file2");
    File_Leaf file3 = new File_Leaf("file3");

    Directory_Composite directory1 = new Directory_Composite("directory1");
    Directory_Composite directory2 = new Directory_Composite("directory2");

    directory1.add(file1);
    directory1.add(file2);
    directory2.add(directory1);
    directory2.add(file3);

    directory2.showDetails();
  }

}
