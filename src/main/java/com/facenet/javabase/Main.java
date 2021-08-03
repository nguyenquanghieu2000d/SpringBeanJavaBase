/*
Class được tạo bởi @author Nguyễn Quang Hiếu vào 27/07/2021 3:45 PM 
*/
package com.facenet.javabase;


import com.facenet.javabase.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Soldier soldier = context.getBean("Soldier", Soldier.class);
        Weapon gun = context.getBean("Gun", Weapon.class);
        Weapon knife = context.getBean("Knife", Weapon.class);
        Weapon grenade = context.getBean("Grenade", Weapon.class);

        soldier.showWeapon();
        gun.type();
        knife.type();
        grenade.type();
    }
}
