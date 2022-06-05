package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		Jaeger jaeger2 = new Jaeger("Romeo Blue", "U.S.A.", "Mark 1", 77.72, 7.775, 7);
		jaeger1.setName("Cherno Alpha");
		jaeger1.setOrigin("Russia");
		jaeger1.setMark("Mark 1");
		jaeger1.setHeight(85.34);
		jaeger1.setWeight(6.912);
		jaeger1.setStrength(10);
		System.out.println(jaeger1);
		System.out.println(jaeger2);
		System.out.println(jaeger1.drift());
		System.out.println(jaeger2.drift());
		jaeger1.move();
		jaeger2.move();
		System.out.println(jaeger1.scanKaiju());
		System.out.println(jaeger2.scanKaiju());
		jaeger2.isReadytoBattle();
		jaeger1.isReadytoBattle();
		jaeger2.getDamaged(6);
		jaeger2.setWeight(5.870);
		jaeger2.isReadytoBattle();
		jaeger1.punch();
		jaeger2.punch();
		jaeger2.adKillKaiju(1);
		System.out.println(jaeger2);
		System.out.println(jaeger1.scanKaiju());
		jaeger1.isReadytoBattle();
		jaeger1.move();
		jaeger1.getDamaged(1);
		jaeger1.isReadytoBattle();
		jaeger1.punch();
		jaeger1.adKillKaiju(1);
		System.out.println(jaeger1);
		jaeger2.getDamaged(3);
		System.out.println(jaeger2.burstUp());;
		jaeger2.adKillKaiju(1);
		jaeger2.setWeight(3.431);
		jaeger2.setHeight(17.11);
		jaeger2.isReadytoBattle();
		System.out.println(jaeger2);
		jaeger1.adKillKaiju(5);
		jaeger1.getDamaged(9);
		jaeger1.isReadytoBattle();
		System.out.println(jaeger1);
	}
}