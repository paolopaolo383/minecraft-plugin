package hypixel.hypixel;
import com.destroystokyo.paper.HeightmapType;
import com.destroystokyo.paper.event.server.ServerTickStartEvent;
import io.papermc.paper.world.MoonPhase;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.util.Ticks;
import org.bukkit.*;
import com.google.common.util.concurrent.FutureCallback;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.logging.Logger;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.boss.DragonBattle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.*;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.WorldCreator.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.*;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Consumer;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import org.checkerframework.checker.units.qual.C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
public final class Hypixel extends JavaPlugin implements Listener{
    ConsoleCommandSender consol = Bukkit.getConsoleSender();
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
        consol.sendMessage( ChatColor.AQUA + "[하이픽셀 플러그인 활성화.]");
        getLogger().info("흠...");
    }
    @EventHandler
    public void move(PlayerInteractEvent e)
    {
        Player player = e.getPlayer();
        if(player.hasResourcePack())
        {
            player.sendMessage(Component.text("리소스팩 있음"));

        }
    }
    @EventHandler
    public void join(PlayerJoinEvent e)
    {
        consol.sendMessage( ChatColor.YELLOW + "[사람이 들어옴]");
        Player player = e.getPlayer();
        e.setJoinMessage("누군가 들어왔다!!!");
        if(player.hasResourcePack())
        {
            player.sendMessage(Component.text("리소스팩 있음"));

        }
        else if(!player.hasResourcePack())
        {
            player.sendMessage(Component.text("리소스팩 없음"));
        }
        player.setResourcePack("https://blogattach.naver.com/ff6ae356407475c0ef0b645a6281fe8c2c768fe1/20210721_258_blogfile/481926paolo_1626870902838_87x7aT_zip/VanillaTweaks_r260907.zip");

    }
    @EventHandler
    public void playerchat(PlayerChatEvent e)
    {
        e.setCancelled(true);
    }
    @EventHandler
    public void player(BlockBreakEvent e)
    {
        e.getPlayer()
        e.getBlock().getType()
    }
    @Override
    public void onDisable()
    {

    }
}
