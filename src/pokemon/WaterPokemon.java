package pokemon;

import pokemon.attack.GrassAttack;
import pokemon.attack.IAttack;
import pokemon.attack.WaterAttack;

import java.util.ArrayList;

public class WaterPokemon extends AbstractPokemon {
    public WaterPokemon(String name, int hp, ArrayList<IAttack> damage) {
        super(name, hp, damage);
    }

    @Override
    public void attack(IPokemon pokemon) {
            pokemon.receiveWaterAttack((WaterAttack) this.getSelectedAttack());
    }

    public void receiveGrassAttack(GrassAttack grassAttack) {
        hp -= grassAttack.getDamage() * 1.5;
    }

    @Override
    public void receiveWaterAttack(WaterAttack waterAttack) {
        hp -= waterAttack.getDamage() - 20;
    }

}
