package pokemon.attack;

public interface IAttack {
    int getDamage();
    
    boolean equals(Object object);

    String getName();
}
