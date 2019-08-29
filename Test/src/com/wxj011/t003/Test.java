package com.wxj011.t003;

public class Test {
    public static void main(String[] args) {
        Player player1 = new Player("叶修",5,1000);
        Player player2 = new Player("唐柔",3,300);
        player1.DaGuai();
        Player newPlayer1 = LevelUp(player1);
        System.out.println(newPlayer1.toString());
        System.out.println(player2.toString());
    }
    public static Player LevelUp(Player p){
        p.setLevel(p.getLevel()+2);
        p.setPower(p.getPower()+1000);
        System.out.println("恭喜玩家"+ p.getName()+"升级啦！");
        return p;
    }
}
