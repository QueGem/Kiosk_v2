package com.example.kiosk1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(){
        items=new ArrayList<>();
        eachMenu();
    }

    private void eachMenu() {
        items.add(new MenuItem("ShakeBurger", 6.9, "토마토,양상추,쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("SmokeShack", 8.9, "베이컨,체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        items.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void display(){
        System.out.println("[SHAKESHACK MENU]");
        for (int i=0; i<items.size(); i++){
            System.out.println((i+1) + "." +items.get(i).toString());
        }
        System.out.println("0. 종료     | 종료");
    }

    public MenuItem getItem(int index){
        if (index < 1 || index>items.size()){
            return null;
        }
        return items.get(index - 1);
    }
}
