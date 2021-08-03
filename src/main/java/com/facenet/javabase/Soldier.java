/*
Class được tạo bởi @author Nguyễn Quang Hiếu vào 27/07/2021 3:28 PM 
*/
package com.facenet.javabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Soldier")
public class Soldier {
    private Weapon weapon;

    public Soldier() {

    }

    @Autowired
    public Soldier(Weapon weapon) {
        this.weapon = weapon;
    }

    public void showWeapon() {
        weapon.type();
    }
}

