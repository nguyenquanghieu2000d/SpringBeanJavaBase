/*
Class được tạo bởi @author Nguyễn Quang Hiếu vào 03/08/2021 5:49 PM 
*/
package com.facenet.javabase.config;

import com.facenet.javabase.Soldier;
import com.facenet.javabase.Weapon;
import com.facenet.javabase.WeaponImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(name="Gun")
    public Weapon getGun() {

        return new WeaponImpl("Gun");
    }

    @Bean(name="Knife")
    public Weapon getKnife() {

        return new WeaponImpl("Knife");
    }

    @Bean(name="Grenade")
    public Weapon getGrenade() {

        return new WeaponImpl("Grenade");
    }

    @Bean(name="Soldier")
    public Soldier getSoldier() {

        return new Soldier(new WeaponImpl("Knife"));
    }

}
