package com.example.kiosk2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShakeBurger", 6.9, "토마토,양상추,쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨,체리페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.8, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("[SHAKESHACK MENU]");
            for (int i = 0; i < menuItems.size(); i++){
                System.out.println((i+1) + "." + menuItems.get(i).toString());
            }
            System.out.println("0. 종료     | 종료");

            System.out.println("메뉴번호를 입력하세요");
            int input = scanner.nextInt();

            if(input==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (input > 0 && input <= menuItems.size()) {
                MenuItem select = menuItems.get(input - 1);
                System.out.println("선택한 메뉴 : " + select.getName());
                System.out.println("가격 : " + select.getPrice());
                System.out.println("설명 : " + select.getIntroduce());
            }else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
        scanner.close();
    }
}
