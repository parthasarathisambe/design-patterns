package com.design.patterns.o3_behavioral.template_method;

public abstract class Beverage {

  public final void prepare() {
    boilWater();
    brew();
    pourInAcup();
    addCondiments();
  }

  private void boilWater() {
    System.out.println("Boiling Water.");
  }

  private void pourInAcup() {
    System.out.println("Pouring into cup.");
  }

  protected abstract void brew();

  protected abstract void addCondiments();

}
