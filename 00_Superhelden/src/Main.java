void main() {
    Superhero batman = new Superhero("Batman", 30, 10, 100, 33, 66);
    Superhero superman = new Superhero("Superman", 20, 15, 150, 40, 50);

    batman.moveSuperhero(10, 10);
    superman.moveSuperhero(30, 30);

    batman.changeWeapon("Uzi");

    batman.attackSuperhero(superman);

    superman.heal(10);
    superman.attackSuperhero(batman);

}

class Superhero {

    // Automatic Properties
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int attackPower;

    public int getAttackPower() {
        return attackPower;
    }

    public int setAttackPower(int attackPower) {
        this.attackPower = attackPower;
        return attackPower;
    }

    public int defensePower;

    public int getDefensePower() {
        return defensePower;
    }

    public int setDefensePower(int defensePower) {
        this.defensePower = defensePower;
        return defensePower;
    }

    public int healthPoints;

    public int getHealthPoints() {
        return healthPoints;
    }

    public int setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
        return healthPoints;
    }

    public String weapon;

    public String getWeapon() {
        return weapon;
    }

    public String getWeapon(String weapon){
        this.weapon= weapon;
        return weapon;
    }

    public int positionX;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int positionY;

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }


    // Constructor

    public Superhero(String name, int attackPower, int  defensePower, int healthPoints, int positionX, int positionY) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.healthPoints = healthPoints;
        this.weapon = "AK47";
        this.positionX = positionX;
        this.positionY = positionY;
        System.out.println("Superhero " + this.name + " created");
    }

    // Methods

    public void moveSuperhero(int additionPositionX, int additionPositionY) {
        this.positionX += additionPositionX;
        this.positionY += additionPositionY;
        System.out.println("Superhero " + this.name + " moved " + this.positionX + " / " + this.positionY);
    }

    public void changeWeapon(String newWeapon) {
        this.weapon = newWeapon;
        System.out.println("Superhero: " + this.name + "change Weapon to: " + this.weapon);
    }

    public void attackSuperhero(Superhero target) {
        if (this.attackPower > target.defensePower) {
            int damage = this.attackPower -  target.defensePower;
            target.healthPoints -= damage;
            System.out.println("Superhero: " + this.name + " attacked " + target.name + "with " + this.weapon + " and damaged him by " + damage);
        } else {
            System.out.println("Your attack has no affect on me!");
        }
    }

    public void heal(int healthPoints) {
        this.healthPoints += healthPoints;
    }

}