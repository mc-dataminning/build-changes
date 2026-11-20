package net.minecraft.commands;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.commands.suggestions.CustomSuggestion;
import net.minecraft.commands.suggestions.SerializableCustomSuggestion;
import net.minecraft.commands.suggestions.SerializableSuggestionTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.permissions.PermissionCheck;
import net.minecraft.server.permissions.PermissionProviderCheck;
import org.slf4j.Logger;

public class ArgumentUtils {
   private static final Logger LOGGER = LogUtils.getLogger();
   private static final Codec<SerializableArgument<?>> REPORT_CODEC = BuiltInRegistries.COMMAND_ARGUMENT_TYPE
      .byNameCodec()
      .dispatch(SerializableArgument::type, SerializableArgument.Type::codec);

   private static <T extends SerializableArgument<?>> void serializeArgumentToJson(final JsonObject result, final T argument) {
      result.addProperty("type", "argument");
      result.add("argument", (JsonElement)REPORT_CODEC.encodeStart(JsonOps.INSTANCE, argument).getOrThrow());
   }

   private static <T extends SerializableCustomSuggestion> void serializeSuggestionToJson(final JsonObject result, final T suggestion) {
      result.add("custom_suggestion", (JsonElement)SerializableSuggestionTypes.CODEC.encodeStart(JsonOps.INSTANCE, suggestion).getOrThrow());
   }

   public static <S> JsonObject serializeNodeToJson(final CommandDispatcher<S> dispatcher, final CommandNode<S> node) {
      JsonObject result = new JsonObject();
      switch (node) {
         case RootCommandNode var18:
            result.addProperty("type", "root");
            break;
         case LiteralCommandNode var19:
            result.addProperty("type", "literal");
            break;
         case ArgumentCommandNode<S, ?> argumentNode:
            serializeArgumentToJson(result, SerializableArgument.unwrapOrThrow(argumentNode.getType()));
            SuggestionProvider<S> customSuggestions = argumentNode.getCustomSuggestions();
            if (customSuggestions != null) {
               serializeSuggestionToJson(result, CustomSuggestion.unwrapOrThrow(customSuggestions).serializable());
            }
            break;
         default:
            LOGGER.error("Could not serialize node {} ({})!", node, node.getClass());
            result.addProperty("type", "unknown");
      }

      Collection<CommandNode<S>> children = node.getChildren();
      if (!children.isEmpty()) {
         JsonObject childrenObject = new JsonObject();

         for (CommandNode<S> child : children) {
            childrenObject.add(child.getName(), serializeNodeToJson(dispatcher, child));
         }

         result.add("children", childrenObject);
      }

      if (node.getCommand() != null) {
         result.addProperty("executable", true);
      }

      if (node.getRequirement() instanceof PermissionProviderCheck<?> permissionCheck) {
         JsonElement permissions = (JsonElement)PermissionCheck.CODEC
            .encodeStart(JsonOps.INSTANCE, permissionCheck.test())
            .getOrThrow(error -> new IllegalStateException("Failed to serialize requirement: " + error));
         result.add("permissions", permissions);
      }

      if (node.getRedirect() != null) {
         Collection<String> path = dispatcher.getPath(node.getRedirect());
         if (!path.isEmpty()) {
            JsonArray target = new JsonArray();

            for (String piece : path) {
               target.add(piece);
            }

            result.add("redirect", target);
         }
      }

      return result;
   }
}
