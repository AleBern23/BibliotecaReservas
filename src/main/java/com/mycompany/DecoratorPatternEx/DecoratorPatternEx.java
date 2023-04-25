/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.DecoratorPatternEx;

/**
 *
 * @author SG701-17
 */
public class DecoratorPatternEx {

    public static void main(String[] args) {
        System.out.println("***Biblioteca UPC***");
        ConcreteComponent persona = new ConcreteComponent();
        persona.doJob();
        ConcreteDecorator_1 cd_1 = new ConcreteDecorator_1();
        cd_1.setComponente(persona);
        cd_1.doJob();
        ConcreteDecorator_2 cd_2 = new ConcreteDecorator_2();
        cd_2.setComponente(persona);
        cd_2.doJob();
    }
}
