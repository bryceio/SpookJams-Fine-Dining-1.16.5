package com.brycieo.spookjamsmod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.brycieo.spookjamsmod.lists.BlockList;
import com.brycieo.spookjamsmod.lists.ItemList;

import java.util.stream.Collectors;

@Mod(SpookJamsMod.MOD_ID)
public class SpookJamsMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "spookjamsmod";
    public SpookJamsMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::enqueueIMC);
        bus.addListener(this::processIMC);
        bus.addListener(this::doClientStuff);
        
        ItemList.ITEMS.register(bus);
        BlockList.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        //LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
        RenderTypeLookup.setRenderLayer(BlockList.CHERRYDOOR.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockList.CHERRYTRAPDOOR.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockList.CHERRYSAPLING.get(), RenderType.cutout());
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            LOGGER.info("HELLO from Register Block");
        }
        
        @SubscribeEvent
        public static void createBlockItems(RegistryEvent.Register<Item> event) {
            final IForgeRegistry<Item> registry = event.getRegistry();
            BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
                if (block == BlockList.CHERRYBUTTON.get() || block == BlockList.CHERRYDOOR.get() || block == BlockList.CHERRYPRESSUREPLATE.get() || block == BlockList.CHERRYTRAPDOOR.get() || block == BlockList.CHERRYFENCEGATE.get()) {
                    final Item.Properties properties = new Item.Properties().tab(ItemGroup.TAB_REDSTONE);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                }
                else if(block == BlockList.CHERRYLEAFBLOCK.get() || block == BlockList.CHERRYSAPLING.get() || block == BlockList.CHERRYFENCE.get()) {
                	final Item.Properties properties = new Item.Properties().tab(ItemGroup.TAB_DECORATIONS);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                }
                //else if (block == BlockList.CHERRYWALLSIGN.get() || block == BlockList.CHERRYSIGN.get()) {}
                else {
                    final Item.Properties properties = new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                }
            });
        }
    }
    

}
