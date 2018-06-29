package opensource.themeparks;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Themeparks extends JavaPlugin {

    private static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static Plugin getInstance() {
        return instance;
    }
}
