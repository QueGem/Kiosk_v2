package com.example.kiosk4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토,양상추,쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addMenuItem(new MenuItem("Coke", 2.5, "콜라"));
        drinkMenu.addMenuItem(new MenuItem("Sprite", 2.5, "스프라이트"));
        drinkMenu.addMenuItem(new MenuItem("Shake", 4.5, "초콜릿 쉐이크"));

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addMenuItem(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));
        dessertMenu.addMenuItem(new MenuItem("Brownine", 4.0, "브라우니"));

        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
        }
    }
