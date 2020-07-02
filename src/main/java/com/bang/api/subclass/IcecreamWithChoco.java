package com.bang.api.subclass;

public class IcecreamWithChoco extends Icecream{

  @Override
  public void make() {
    super.make();
    addChoco();
  }

  private void addChoco() {
    System.out.println("+ 초코");
  }
}
