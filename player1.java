import java.sql.SQLOutput;

public class player1 {
    private String name;
    private String weapon;
    private int health;
    public player1(String name,String weapon,int health){
    this.name=name;
    this.weapon=weapon;
    if(health<0|| health>100){
        this.health=100;
    }else{
        this.health=health;
    }
}
public void damageByGun1(){
    this.health-=30;
    if(this.health<=0){
        this.health=0;
        System.out.println(getName()+" is dead");
    }
    System.out.println(getName()+"got hit by gun 1,health is reduced by 30.New health is:"+this.health);
     }
     public void damageByGun2() {
         this.health -= 50;
         if (this.health <= 0) {
             this.health = 0;
             System.out.println(getName()+"is dead");
         }
         System.out.println(getName()+"Got hit by gun 2.Health reduced by 50." + "New health is " + this.health);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void heal(){
        if(this.health<=0){
            System.out.println("player is dead");
        }else{
            this.health+=70;
            if(this.health>100){
                this.health=100;
            }
        }
    }
}
