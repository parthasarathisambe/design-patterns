package com.design.patterns.o2_structural.composite;

public class File_Leaf implements FileSystem_Component {

  private String name;

  public File_Leaf(String name) {
    this.name = name;
  }

  @Override
  public void showDetails() {
    System.out.println("File: " + name);
  }

}
