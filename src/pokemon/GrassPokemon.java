package pokemon;

import pokemon.attack.GrassAttack;
import pokemon.attack.IAttack;
import pokemon.attack.WaterAttack;

import java.util.ArrayList;
public class GrassPokemon extends AbstractPokemon {
    public GrassPokemon(String name, int hp, ArrayList<IAttack> attacks) {
        super(name, hp, attacks);
    }

    @Override
    public void attack(IPokemon pokemon) {
        pokemon.receiveGrassAttack((GrassAttack) this.getSelectedAttack());
    }

    @Override
    public void receiveGrassAttack(GrassAttack grassAttack) {
        hp -= grassAttack.getDamage() - 20;
    }

    @Override
    public void receiveWaterAttack(WaterAttack waterAttack) {
        hp -= waterAttack.getDamage() * 1.5;
    }

}
