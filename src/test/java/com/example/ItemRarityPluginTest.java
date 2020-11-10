package com.example;

import com.ItemRarity.ItemRarityPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ItemRarityPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ItemRarityPlugin.class);
		RuneLite.main(args);
	}
}