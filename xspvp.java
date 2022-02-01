package main.java.me.xs1av.xspvp;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
@SuppressWarnings("All")
@Mod(modid = "xs-pvp", name = "xs-pvp++", version = "1.5.3")
public class xs_pvp {
    public static final String MODID = "xs-pvp";
    public static final String MODNAME = "xs-pvp++";
    public static final String MODVER = "1.5.3";
    public static final Logger LOGGER = LogManager.getLogger("xs-pvp");

   LOGGER.info("X$ PVP LOADED  successfully loaded!\n");


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Oh  YEAH XS PVP LOADED !");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Display.setTitle("XS-PVP++ by xs1_av#0001 ");
        xs_pvp.load();
    }
}
/**
 @author = xs1_av#0001
 */
