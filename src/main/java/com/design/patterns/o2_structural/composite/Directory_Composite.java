package com.design.patterns.o2_structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory_Composite implements FileSystem_Component {

  private String directoryName;
  private List<FileSystem_Component> components = new ArrayList<>();

  public Directory_Composite(String directoryName) {
    this.directoryName = directoryName;
  }

  public void add(FileSystem_Component component) {
    components.add(component);
  }

  public void remove(FileSystem_Component component) {
    components.remove(component);
  }

  @Override
  public void showDetails() {
    System.out.println("Directory name: " + directoryName);
    components.forEach(FileSystem_Component::showDetails);
  }

}
