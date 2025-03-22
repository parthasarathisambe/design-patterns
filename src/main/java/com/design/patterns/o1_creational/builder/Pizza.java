package com.design.patterns.o1_creational.builder;

import java.util.List;

public class Pizza {

  private String size;
  private String crust;
  private List<String> toppings;

  public Pizza(Builder builder) {
    this.size = builder.size;
    this.crust = builder.crust;
    this.toppings = builder.toppings;
  }

  public static Builder builder() {
    return Builder.getInstance();
  }

  public static class Builder {

    private String size;
    private String crust;
    private List<String> toppings;

    public static Builder getInstance() {
      return new Builder();
    }

    public Builder size(String size) {
      this.size = size;
      return this;
    }

    public Builder crust(String crust) {
      this.crust = crust;
      return this;
    }

    public Builder toppings(List<String> toppings) {
      this.toppings = toppings;
      return this;
    }

    public Pizza build() {
      return new Pizza(this);
    }

  }

}
