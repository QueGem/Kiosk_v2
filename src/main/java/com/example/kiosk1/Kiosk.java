package com.example.kiosk1;

import java.util.Scanner;

public class Kiosk {
    private Menu menu;

    public Kiosk(){
        menu=new Menu();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            menu.display();
            System.out.println("메뉴 번호를 입력하세요");
            int input = scanner.nextInt();

            if (input==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            MenuItem select = menu.getItem(input);
            if (select !=null){
                System.out.println("선택한 메뉴 :" + select.getName());
            }else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
        scanner.close();
    }
}
