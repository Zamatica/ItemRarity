package com.ItemRarity;

// External
import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;

// RuneLite Plugins
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

// RuneLite
import net.runelite.client.config.ConfigManager;

// UI
import net.runelite.client.ui.overlay.OverlayManager;

import java.awt.*;

@Slf4j
@PluginDescriptor(
	name = "ItemRarity"
)
public class ItemRarityPlugin extends Plugin
{
	@Inject
	private ItemRarityConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ItemRarityOverlay overlay;

	@Override
	protected void startUp() throws Exception
	{
		log.info("ItemRarity started!");
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("ItemRarity stopped!");
		overlayManager.remove(overlay);
	}

	@Provides
	ItemRarityConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ItemRarityConfig.class);
	}

	Color getRarityColor(final int itemPrice)
	{
		if (itemPrice < config.getCommonItemValue())
		{
			return config.getCommonItemColor();
		}
		else if (itemPrice < config.getUncommonItemValue())
		{
			return config.getUncommonItemColor();
		}
		else if (itemPrice < config.getRareItemValue())
		{
			return config.getRareItemColor();
		}
		else if (itemPrice < config.getEpicItemValue())
		{
			return config.getEpicItemColor();
		}

		return config.getLegendaryItemColor();
	}
}
