package com.example.kiosk4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus){
        this.menus=menus;
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            displayMenu();
            System.out.println("메뉴번호를 입력하세요: ");
            int mainInput = scanner.nextInt();

            if (mainInput == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (mainInput > 0 && mainInput <= menus.size()) {
                Menu selectMenu = menus.get(mainInput -1);

                while (true){
                    selectMenu.display();
                    System.out.println("메뉴번호를 입력하세요.");
                    int subInput = scanner.nextInt();

                    if(subInput == 0){
                        break;
                    }else if (subInput > 0 && subInput <= selectMenu.getMenuItems().size()){
                        MenuItem selectedItem = selectMenu.getMenuItems().get(subInput - 1);
                        System.out.println("선택한 메뉴: " + selectedItem.getName());
                        System.out.println("가격: W " + selectedItem.getPrice());
                        System.out.println("설명: " + selectedItem.getIntroduce());
                    }else {
                        System.out.println("올바른 번호를 입력하세요.");
                    }
                }
            }else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
        scanner.close();
        }
        private void displayMenu(){
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++){
                System.out.println((i + 1) + "." + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료     | 종료");
        }
}
