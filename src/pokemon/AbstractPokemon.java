package pokemon;

import pokemon.attack.IAttack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractPokemon implements IPokemon {
    private String name;
    protected int hp;
    private ArrayList<IAttack> attacks;
    private IAttack selectedAttack;

    public AbstractPokemon(String name, int hp, ArrayList<IAttack> attacks) {
        this.name = name;
        this.hp = hp;
        this.attacks = attacks;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public List<IAttack> getAttacks() {
        return attacks;
    }

    public void selectAttack(int index) {
        selectedAttack = attacks.get(index);
    }

    public IAttack getSelectedAttack(){
        return selectedAttack;
    }

}
