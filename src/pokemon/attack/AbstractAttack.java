package pokemon.attack;

public abstract class AbstractAttack implements IAttack {
    private String name;
    private int damage;

    protected AbstractAttack(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object object) {
        if (object.getClass() != getClass())
                return false;
        IAttack attack = (IAttack) object;
        return this.name.equals(attack.getName()) && this.damage == attack.getDamage();
    }
}
