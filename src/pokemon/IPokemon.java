package pokemon;

import pokemon.attack.GrassAttack;
import pokemon.attack.IAttack;
import pokemon.attack.WaterAttack;

import java.util.List;

public interface IPokemon {
    public String getName();

    public int getHP();

    void attack(IPokemon pokemon);

    void selectAttack(int index);

    IAttack getSelectedAttack();

    List<IAttack> getAttacks();

    void receiveGrassAttack(GrassAttack grassAttack);

    void receiveWaterAttack(WaterAttack selectedAttack);
}
