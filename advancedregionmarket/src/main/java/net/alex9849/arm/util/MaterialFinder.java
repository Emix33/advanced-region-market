package net.alex9849.arm.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialFinder {

    private static List<Material> signMaterials;
    private static Material defaultSign;
    private static Material wallSign;
    private static Material GUI_REGION_OWNER_ITEM;
    private static Material GUI_REGION_MEMBER_ITEM;
    private static Material GUI_REGION_FINDER_ITEM;
    private static Material GUI_GO_BACK_ITEM;
    private static Material GUI_WARNING_YES_ITEM;
    private static Material GUI_WARNING_NO_ITEM;
    private static Material GUI_TP_ITEM;
    private static Material GUI_SELL_REGION_ITEM;
    private static Material GUI_RESET_ITEM;
    private static Material GUI_EXTEND_ITEM;
    private static Material GUI_INFO_ITEM;
    private static Material GUI_PROMOTE_MEMBER_TO_OWNER_ITEM;
    private static Material GUI_REMOVE_MEMBER_ITEM;
    private static Material GUI_CONTRACT_ITEM;
    private static Material GUI_FILL_ITEM;
    private static Material GUI_SUBREGION_ITEM;
    private static Material GUI_DELETE_ITEM;
    private static Material GUI_TELEPORT_TO_SIGN_ITEM;
    private static Material GUI_TELEPORT_TO_REGION_ITEM;
    private static Material GUI_NEXT_PAGE_ITEM;
    private static Material GUI_PREV_PAGE_ITEM;
    private static Material GUI_HOTEL_SETTING_ITEM;
    private static Material GUI_UNSELL_ITEM;
    private static Material PLAYER_HEAD;

    static {
        MaterialFinder.signMaterials = new ArrayList<>();
        for(Material mat : Material.values()) {
            if(mat.toString().contains("SIGN")) {
                MaterialFinder.signMaterials.add(mat);
            }
        }

        String serverVersion = Bukkit.getServer().getVersion();

        if(serverVersion.equalsIgnoreCase("1.12") || serverVersion.contains("1.12")) {
            MaterialFinder.defaultSign = MaterialFinder.getMaterial("SIGN");
            MaterialFinder.wallSign = MaterialFinder.getMaterial("WALL_SIGN");
            MaterialFinder.GUI_REGION_OWNER_ITEM = MaterialFinder.getMaterial("ENDER_CHEST");
            MaterialFinder.GUI_REGION_MEMBER_ITEM = MaterialFinder.getMaterial("CHEST");
            MaterialFinder.GUI_REGION_FINDER_ITEM = MaterialFinder.getMaterial("COMPASS");
            MaterialFinder.GUI_GO_BACK_ITEM = MaterialFinder.getMaterial("WOOD_DOOR");
            MaterialFinder.GUI_WARNING_YES_ITEM = MaterialFinder.getMaterial("MELON");
            MaterialFinder.GUI_WARNING_NO_ITEM = MaterialFinder.getMaterial("REDSTONE_BLOCK");
            MaterialFinder.GUI_TP_ITEM = MaterialFinder.getMaterial("ENDER_PEARL");
            MaterialFinder.GUI_SELL_REGION_ITEM = MaterialFinder.getMaterial("DIAMOND");
            MaterialFinder.GUI_RESET_ITEM = MaterialFinder.getMaterial("TNT");
            MaterialFinder.GUI_EXTEND_ITEM = MaterialFinder.getMaterial("WATCH");
            MaterialFinder.GUI_INFO_ITEM = MaterialFinder.getMaterial("BOOK");
            MaterialFinder.GUI_PROMOTE_MEMBER_TO_OWNER_ITEM = MaterialFinder.getMaterial("LADDER");
            MaterialFinder.GUI_REMOVE_MEMBER_ITEM = MaterialFinder.getMaterial("LAVA_BUCKET");
            MaterialFinder.GUI_CONTRACT_ITEM = MaterialFinder.getMaterial("BOOK_AND_QUILL");
            MaterialFinder.GUI_FILL_ITEM = MaterialFinder.getMaterial("AIR");
            MaterialFinder.GUI_SUBREGION_ITEM = MaterialFinder.getMaterial("DIRT");
            MaterialFinder.GUI_DELETE_ITEM = MaterialFinder.getMaterial("BARRIER");
            MaterialFinder.GUI_TELEPORT_TO_SIGN_ITEM = MaterialFinder.getMaterial("SIGN");
            MaterialFinder.GUI_TELEPORT_TO_REGION_ITEM = MaterialFinder.getMaterial("GRASS");
            MaterialFinder.GUI_NEXT_PAGE_ITEM = MaterialFinder.getMaterial("ARROW");
            MaterialFinder.GUI_PREV_PAGE_ITEM = MaterialFinder.getMaterial("ARROW");
            MaterialFinder.GUI_HOTEL_SETTING_ITEM = MaterialFinder.getMaterial("BED");
            MaterialFinder.GUI_UNSELL_ITEM = MaterialFinder.getMaterial("NAME_TAG");

        } else if(serverVersion.equalsIgnoreCase("1.13") || serverVersion.contains("1.13")) {
            MaterialFinder.defaultSign = MaterialFinder.getMaterial("SIGN");
            MaterialFinder.wallSign = MaterialFinder.getMaterial("WALL_SIGN");
            MaterialFinder.GUI_REGION_OWNER_ITEM = MaterialFinder.getMaterial("ENDER_CHEST");
            MaterialFinder.GUI_REGION_MEMBER_ITEM = MaterialFinder.getMaterial("CHEST");
            MaterialFinder.GUI_REGION_FINDER_ITEM = MaterialFinder.getMaterial("COMPASS");
            MaterialFinder.GUI_GO_BACK_ITEM = MaterialFinder.getMaterial("OAK_DOOR");
            MaterialFinder.GUI_WARNING_YES_ITEM = MaterialFinder.getMaterial("MELON");
            MaterialFinder.GUI_WARNING_NO_ITEM = MaterialFinder.getMaterial("REDSTONE_BLOCK");
            MaterialFinder.GUI_TP_ITEM = MaterialFinder.getMaterial("ENDER_PEARL");
            MaterialFinder.GUI_SELL_REGION_ITEM = MaterialFinder.getMaterial("DIAMOND");
            MaterialFinder.GUI_RESET_ITEM = MaterialFinder.getMaterial("TNT");
            MaterialFinder.GUI_EXTEND_ITEM = MaterialFinder.getMaterial("CLOCK");
            MaterialFinder.GUI_INFO_ITEM = MaterialFinder.getMaterial("BOOK");
            MaterialFinder.GUI_PROMOTE_MEMBER_TO_OWNER_ITEM = MaterialFinder.getMaterial("LADDER");
            MaterialFinder.GUI_REMOVE_MEMBER_ITEM = MaterialFinder.getMaterial("LAVA_BUCKET");
            MaterialFinder.GUI_CONTRACT_ITEM = MaterialFinder.getMaterial("WRITABLE_BOOK");
            MaterialFinder.GUI_FILL_ITEM = MaterialFinder.getMaterial("GRAY_STAINED_GLASS_PANE");
            MaterialFinder.GUI_SUBREGION_ITEM = MaterialFinder.getMaterial("GRASS_BLOCK");
            MaterialFinder.GUI_DELETE_ITEM = MaterialFinder.getMaterial("BARRIER");
            MaterialFinder.GUI_TELEPORT_TO_SIGN_ITEM = MaterialFinder.getMaterial("SIGN");
            MaterialFinder.GUI_TELEPORT_TO_REGION_ITEM = MaterialFinder.getMaterial("GRASS_BLOCK");
            MaterialFinder.GUI_NEXT_PAGE_ITEM = MaterialFinder.getMaterial("ARROW");
            MaterialFinder.GUI_PREV_PAGE_ITEM = MaterialFinder.getMaterial("ARROW");
            MaterialFinder.GUI_HOTEL_SETTING_ITEM = MaterialFinder.getMaterial("RED_BED");
            MaterialFinder.GUI_UNSELL_ITEM = MaterialFinder.getMaterial("NAME_TAG");
            MaterialFinder.PLAYER_HEAD = MaterialFinder.getMaterial("PLAYER_HEAD");
        } else {
            MaterialFinder.defaultSign =  MaterialFinder.getMaterial("OAK_SIGN");
            MaterialFinder.wallSign = MaterialFinder.getMaterial("OAK_WALL_SIGN");
            MaterialFinder.GUI_REGION_OWNER_ITEM = MaterialFinder.getMaterial("ENDER_CHEST");
            MaterialFinder.GUI_REGION_MEMBER_ITEM = MaterialFinder.getMaterial("CHEST");
            MaterialFinder.GUI_REGION_FINDER_ITEM = MaterialFinder.getMaterial("COMPASS");
            MaterialFinder.GUI_GO_BACK_ITEM = MaterialFinder.getMaterial("OAK_DOOR");
            MaterialFinder.GUI_WARNING_YES_ITEM = MaterialFinder.getMaterial("MELON");
            MaterialFinder.GUI_WARNING_NO_ITEM = MaterialFinder.getMaterial("REDSTONE_BLOCK");
            MaterialFinder.GUI_TP_ITEM = MaterialFinder.getMaterial("ENDER_PEARL");
            MaterialFinder.GUI_SELL_REGION_ITEM = MaterialFinder.getMaterial("DIAMOND");
            MaterialFinder.GUI_RESET_ITEM = MaterialFinder.getMaterial("TNT");
            MaterialFinder.GUI_EXTEND_ITEM = MaterialFinder.getMaterial("CLOCK");
            MaterialFinder.GUI_INFO_ITEM = MaterialFinder.getMaterial("BOOK");
            MaterialFinder.GUI_PROMOTE_MEMBER_TO_OWNER_ITEM = MaterialFinder.getMaterial("LADDER");
            MaterialFinder.GUI_REMOVE_MEMBER_ITEM = MaterialFinder.getMaterial("LAVA_BUCKET");
            MaterialFinder.GUI_CONTRACT_ITEM = MaterialFinder.getMaterial("WRITABLE_BOOK");
            MaterialFinder.GUI_FILL_ITEM = MaterialFinder.getMaterial("GRAY_STAINED_GLASS_PANE");
            MaterialFinder.GUI_SUBREGION_ITEM = MaterialFinder.getMaterial("GRASS_BLOCK");
            MaterialFinder.GUI_DELETE_ITEM = MaterialFinder.getMaterial("BARRIER");
            MaterialFinder.GUI_TELEPORT_TO_SIGN_ITEM = MaterialFinder.getMaterial("OAK_SIGN");
            MaterialFinder.GUI_TELEPORT_TO_REGION_ITEM = MaterialFinder.getMaterial("GRASS_BLOCK");
            MaterialFinder.GUI_NEXT_PAGE_ITEM = MaterialFinder.getMaterial("ARROW");
            MaterialFinder.GUI_PREV_PAGE_ITEM = MaterialFinder.getMaterial("ARROW");
            MaterialFinder.GUI_HOTEL_SETTING_ITEM = MaterialFinder.getMaterial("RED_BED");
            MaterialFinder.GUI_UNSELL_ITEM = MaterialFinder.getMaterial("NAME_TAG");
        }
    }

    public static List<Material> getSignMaterials() {
        return signMaterials;
    }

    public static Material getMaterial(String materialName) {
        Material material = MaterialFinder.getMaterial(materialName, false);
        if(material == null) {
            material = MaterialFinder.getMaterial(materialName, true);
        }
        return material;
    }

    public static Material getWallSign() {
        return MaterialFinder.wallSign;
    }

    public static Material getSign() {
        return MaterialFinder.defaultSign;
    }


    private static Material getMaterial(String name, boolean legacyName) {
        if (legacyName) {
            if (!name.startsWith("LEGACY_")) {
                name = "LEGACY_" + name;
            }
            return Material.matchMaterial(name);
        } else {
            return Material.matchMaterial(name);
        }
    }

}