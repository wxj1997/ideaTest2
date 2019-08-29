package com.wxj001;

import java.util.Scanner;

public class Hotel {
    Room[][] rooms;

    public Hotel() {
        rooms = new Room[5][10];
        for (int i = 0; i < rooms.length; i++) {
            Room[] room = rooms[i];
            for (int j = 0; j < room.length; j++) {
                if (i == 0 || i == 1) {
                    Room r = new Room((i + 1) * 100 + (j + 1), "标准间", false);
                    room[j] = r;
                } else if (i == 2 || i == 3) {
                    Room r = new Room((i + 1) * 100 + (j + 1), "双人间", false);
                    room[j] = r;
                } else {
                    Room r = new Room((i + 1) * 100 + (j + 1), "豪华间", false);
                    room[j] = r;
                }
            }
        }
    }

    /**
     * 打印酒店房间信息
     */
    public void printRoom() {
        for (int i = 0; i < rooms.length; i++) {
            Room[] room = rooms[i];
            for (int j = 0; j < room.length; j++) {
                Room r = room[j];
                System.out.print("[" + r.getId() + "," + r.getType() + "," + (r.getStatus() ? "已入住" : "未入住") +
                        "]" +
                        "\t");
            }
            System.out.println();
        }
    }

    /**
     * 预定房间
     */
    public void checkIn(int num) {
        int x = num / 100 - 1;
        int y = num % 10 - 1;
        if (rooms[x][y].getStatus()) {
            System.out.println("房间已被预定,请重新选择:");
        } else {
            rooms[x][y].setStatus(true);
            System.out.println("房间" + num + "预定成功.");
            printRoom();
        }
    }

    /**
     * 退定房间
     */
    public void checkOut(int num) {
        int x = num / 100 - 1;
        int y = num % 10 - 1;
        if (!rooms[x][y].getStatus()) {
            System.out.println("房间未被被预定,您按错了吧!");
        } else {
            rooms[x][y].setStatus(false);
            System.out.println("房间" + num + "退订成功.");
            printRoom();
        }
    }

    /**
     * 欢迎界面
     */
    public void welcome() {
        System.out.println("欢迎入住五洲宾馆!请选择:1 查看酒店房间信息 2 办理入住 3 办理退房 4 退出系统:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                printRoom();
                break;
            case 2:
                System.out.println("请输入您预定的房间号:");
                int i1 = scanner.nextInt();
                checkIn(i1);
                printRoom();
                break;
            case 3:
                System.out.println("请输入您退定的房间号.");
                int i2 = scanner.nextInt();
                checkOut(i2);
                printRoom();
                break;
            case 4:
                System.out.println("欢迎下次光临!");
                System.exit(0);
                break;
            default:
                System.out.println("瞎按什么呢!!!SB!!!");
                break;
        }
    }

}
