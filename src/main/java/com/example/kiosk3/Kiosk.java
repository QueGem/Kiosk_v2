package com.example.kiosk3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems){
    this.menuItems = menuItems;
}

public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            display();

            System.out.println("메뉴번호를 입력하세요: ");
            int input = scanner.nextInt();

            if (input == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (input > 0 && input <= menuItems.size()){
                MenuItem select = menuItems.get(input -1);
                System.out.println("선택한 메뉴 : " + select.getName());
                System.out.println("가격 :W " + select.getPrice());
                System.out.println("설명 : " + select.getIntroduce());
            }else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
        scanner.close();
}
private void display(){
    System.out.println("[SHAKESHACK MENU]");
    for (int i = 0 ; i < menuItems.size(); i++){
        System.out.println((i+1) + "." + menuItems.get(i).toString());
    }
    System.out.println("0. 종료     | 종료");
    }
}
