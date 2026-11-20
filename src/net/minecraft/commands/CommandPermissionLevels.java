package net.minecraft.commands;

import net.minecraft.server.permissions.PermissionCheck;
import net.minecraft.server.permissions.Permissions;

public class CommandPermissionLevels {
   public static final PermissionCheck LEVEL_ALL = PermissionCheck.AlwaysPass.INSTANCE;
   public static final PermissionCheck LEVEL_MODERATORS = new PermissionCheck.Require(Permissions.COMMANDS_MODERATOR);
   public static final PermissionCheck LEVEL_GAMEMASTERS = new PermissionCheck.Require(Permissions.COMMANDS_GAMEMASTER);
   public static final PermissionCheck LEVEL_ADMINS = new PermissionCheck.Require(Permissions.COMMANDS_ADMIN);
   public static final PermissionCheck LEVEL_OWNERS = new PermissionCheck.Require(Permissions.COMMANDS_OWNER);
}
