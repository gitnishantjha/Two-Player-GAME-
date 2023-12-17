public class player2 extends player1{
    private int health;
    private boolean armor;
    public player2(String name,String weapon,int health,boolean armor){
        super(name,weapon,health);
        if(health<0|| health>100){
            this.health=100;
        }else{
            this.health=health;
        }
        this.armor=armor;
    }

    @Override
        public void damageByGun1(){
        if(armor){
            this.health-=20;
            if(this.health<=0) this.health=0;
            System.out.println("Armor is on."+getName()+" Got hit by gun1.Heath is reduced by 20."+
                    "New health is"+this.health);
        }
        if(!armor){
            this.health-=30;
            if(this.health<=0) this.health=0;
            System.out.println("Armor is on."+getName()+" Got hit by gun1.Heath is reduced by 20." +
                    " "+"New health is"+this.health);
        }
        if(this.health==0){
            System.out.println(getName()+"is dead");
        }
    }
    @Override
    public void damageByGun2(){

        if(armor){
            this.health-=40;
            if(this.health<=0) this.health=0;
            System.out.println("Armor is on."+getName()+"Got hit by gun1.Heath is reduced by 40."+
                    "New health is"+this.health);
        }
        if(!armor){
            this.health-=50;
            if(this.health<=0) this.health=0;
            System.out.println("Armor is on."+getName()+"Got hit by gun1.Heath is reduced by 50." +
                    " "+"New health is"+this.health);
        }
        if(this.health==0){
            System.out.println(getName()+"is dead");
        }

    }

    public boolean isArmor() {
        return armor;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void heal() {
        super.heal();
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }



}
