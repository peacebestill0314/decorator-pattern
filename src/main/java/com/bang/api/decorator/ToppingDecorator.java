package com.bang.api.decorator;

public class ToppingDecorator extends Icecream {

  private Icecream icecream;

  public ToppingDecorator(Icecream icecream) {
    this.icecream = icecream;
  }

  @Override
  public void make() {
    icecream.make();
  }
}
