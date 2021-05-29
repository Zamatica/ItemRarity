package com.ItemRarity;

// External
import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;

// Inventory/Items
import net.runelite.api.ItemComposition;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

// UI
import net.runelite.client.game.ItemManager;

// ItemRarityPlugin
import com.ItemRarity.ItemRarityConfig;

import java.awt.*;
import java.awt.image.BufferedImage;


@Slf4j
public class ItemRarityOverlay extends WidgetItemOverlay
{
    private static final int INVENTORY_SIZE = 28;

    private final ItemRarityPlugin plugin;
    private final ItemManager itemManager;

    @Inject
    private ItemRarityOverlay(ItemRarityPlugin plugin, ItemManager itemManager)
    {
        this.plugin = plugin;
        this.itemManager = itemManager;

        showOnEquipment();
        showOnInventory();
        showOnBank();
    }

    private int itemPrice(int itemId)
    {
        // Used to get High Alch Price
        ItemComposition itemDef = itemManager.getItemComposition(itemId);

        int maxPrice = 0;

        // Get GE price and High Alch Price
        int gePrice = itemManager.getItemPrice(itemId);

        // High Alch Price
        int haPrice = itemDef.getHaPrice();

        // Store Price of the item
        int storePrice = itemDef.getPrice();

        if (plugin.getUseStoreValue())
        {
            maxPrice = Integer.max(storePrice, maxPrice);
        }

        if (plugin.getUseGEValue())
        {
            maxPrice = Integer.max(gePrice, maxPrice);
        }

        if (plugin.getUseHAValue())
        {
            maxPrice = Integer.max(haPrice, maxPrice);
        }

        return maxPrice;
    }

    @Override
    public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem itemWidget)
    {
        int price = itemPrice(itemId);

        // Get Rarity Color
        final Color color = plugin.getRarityColor(price);

        // Null check and alpha optimization
        if (color == null || color.getAlpha() == 0)
        {
            return;
        }

        Rectangle bounds = itemWidget.getCanvasBounds();

        final BufferedImage outline = itemManager.getItemOutline(itemId, itemWidget.getQuantity(), color);
        graphics.drawImage(outline, (int)bounds.getX(), (int)bounds.getY(), null);
    }
}
