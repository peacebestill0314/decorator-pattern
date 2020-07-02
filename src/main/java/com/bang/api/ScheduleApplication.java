package com.bang.api;

import com.bang.api.decorator.BananaDecorator;
import com.bang.api.decorator.ChocoDecorator;
import com.bang.api.decorator.Cone;
import com.bang.api.subclass.Icecream;
import com.bang.api.subclass.IcecreamWithBanana;
import com.bang.api.subclass.IcecreamWithChoco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ScheduleApplication {

  public static void main(String[] args) {
    SpringApplication.run(ScheduleApplication.class, args);

    Icecream icecream = new Icecream();
    icecream.make();
    System.out.println("-----");

    // 초코콘
    IcecreamWithChoco icecreamWithChoco = new IcecreamWithChoco();
    icecreamWithChoco.make();
    System.out.println("-----");

    // 바나나콘
    IcecreamWithBanana icecreamWithBanana = new IcecreamWithBanana();
    icecreamWithBanana.make();
    System.out.println("-----");
  }

  // TODO :: 어노테이션이랑 연관지어서?

 /* public static void main(String[] args) {

    // 초코콘
    Icecream chocoCone = new ChocoDecorator(new Cone());
    chocoCone.make();
    System.out.println("-----");

    // 초코+바나나콘
    Icecream chocoBananaCone = new ChocoDecorator(new BananaDecorator(new Cone()));
    chocoBananaCone.make();
  }*/
}
