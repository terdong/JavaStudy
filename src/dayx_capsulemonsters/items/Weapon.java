package dayx_capsulemonsters.items;

import dayx_capsulemonsters.player.Player;

/**
 * Created by DongHee Kim on 2018-01-25 025.
 */
public interface Weapon {
    void EquipWeapon(Player targetPlayer);
    void ReleaseWeapon(Player targetPlayer);
}
