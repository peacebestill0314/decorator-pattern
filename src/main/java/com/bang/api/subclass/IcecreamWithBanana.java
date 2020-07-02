package com.bang.api.subclass;

public class IcecreamWithBanana extends Icecream{

  @Override
  public void make() {
    super.make();
    addBanana();
  }

  private void addBanana() {
    System.out.println("+ 바나나");
  }
}
