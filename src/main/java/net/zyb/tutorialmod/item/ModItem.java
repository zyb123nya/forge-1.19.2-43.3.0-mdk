package net.zyb.tutorialmod.item;
import net.zyb.tutorialmod.tutorialmod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItem {
    // 创建一个注册表，类型为Item表示物品，MOD_ID表示我们的mod的名称。
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorialmod.MODID);
    // 创建了一个物品，使用注册表对该物品进行注册，注册的name为zircon,使用lambda返回一个新的Item对象
    // 这个物品的tab可以使用游戏中的tab，也可以自己创建，并注册。
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon" ,
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    // 将注册表加入到Forge总线上，只有这样才能把物品加入到游戏中，被TutorialMod进行调用。
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
