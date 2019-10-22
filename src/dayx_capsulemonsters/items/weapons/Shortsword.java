package dayx_capsulemonsters.items.weapons;

import dayx_capsulemonsters.items.Item;
import dayx_capsulemonsters.items.Weapon;
import dayx_capsulemonsters.player.Player;

/**
 * Created by DongHee Kim on 2018-01-25 025.
 */
public class Shortsword extends Item implements Weapon{
    public Shortsword(String name, int price, int value) {
        super(name, price, value);
    }

    @Override
    public void use() {

    }

    @Override
    public void EquipWeapon(Player targetPlayer) {

    }

    @Override
    public void ReleaseWeapon(Player targetPlayer) {

    }
}
