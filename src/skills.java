public class skills {
    int hp;

    public static void main(String[] args) {

        skills Player1 = new skills();
        skills Player2 = new skills();
        skills Player3 = new skills();
        skills Player4 = new skills();
        skills Boss = new skills();
        int PAttack = 3;
        int bossA = 20;
        int bossn = 13;
        int bosskill = 8;
        Player1.hp = 40;
        Player2.hp = 45;
        Player3.hp = 50;
        Player4.hp = 60;
        class mode {
            public void PAttacka() {
                System.out.printf("造成了:" + PAttack + "点伤害.");
                Boss.hp = Boss.hp - PAttack;
            }
            public void bossk() {
                System.out.println("Boss使用了大地震荡，对全部玩家造成" + bosskill + "点伤害.");
                Player1.hp = Player1.hp - 8;
                Player2.hp = Player2.hp - 8;
                Player3.hp = Player3.hp - 8;
                Player4.hp = Player4.hp - 8;
            }
            public void bossAa() {
                System.out.println("Boss使用了普通攻击造成了" + bossA + "点伤害.");
            }
        }
    }
}