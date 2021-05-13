package com.geektech;

public class boss extends GameEntity{
   private String goro;
   private int health;
   private Weapon pistol;

   public boss(String goro, int health, Weapon pistol) {
      this.goro = goro;
      this.health = health;
      this.pistol = pistol;
   }

   public boss(String goro, int health, String pistol) {
      super();
   }

   public String getGoro() {
      return goro;
   }

   public void setGoro(String goro) {
      this.goro = goro;
   }

   public int getHealth() {
      return health;
   }

   public void setHealth(int health) {
      this.health = health;
   }

   public Weapon getPistol() {
      return pistol;
   }

   public void setPistol(Weapon pistol) {
      this.pistol = pistol;
   }
}




