package com.bang.api.decorator;

public class BananaDecorator extends ToppingDecorator {

  public BananaDecorator(Icecream icecream) {
    super(icecream);
  }

  @Override
  public void make() {
    super.make();
    addBanana();
  }

  private void addBanana() {
    System.out.println("+ 바나");
  }
}
