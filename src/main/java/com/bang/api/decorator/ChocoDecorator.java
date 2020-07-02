package com.bang.api.decorator;

public class ChocoDecorator extends ToppingDecorator {

  public ChocoDecorator(Icecream icecream) {
    super(icecream);
  }

  @Override
  public void make() {
    super.make();
    addChoco();
  }

  private void addChoco() {
    System.out.println("+ 초코");
  }
}
