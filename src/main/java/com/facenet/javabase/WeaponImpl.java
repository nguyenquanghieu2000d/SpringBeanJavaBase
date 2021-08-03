/*
Class được tạo bởi @author Nguyễn Quang Hiếu vào 03/08/2021 8:25 PM 
*/
package com.facenet.javabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Weapon")
public class WeaponImpl implements Weapon{

    public WeaponImpl()     {
    }

    @Autowired
    public WeaponImpl(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void type() {
        System.out.println("Đây là " + type);
    }

    private String type;
}
