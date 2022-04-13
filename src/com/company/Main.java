package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.jar.JarEntry;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon();


        Boss boss = new Boss();
        boss.setHealth(2000);
        boss.setDamage(50);

        boss.setWeapon(weapon);

        System.out.println(boss.getDamage());
        System.out.println(boss.getHealth());
        System.out.println(boss.getWeapon());
    }
}
