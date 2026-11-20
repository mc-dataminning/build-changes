package net.minecraft.commands.arguments.item;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.commands.suggestions.SuggestionContext;

public class ItemArgument implements SerializableArgument<ItemInput> {
   private static final ItemArgument INSTANCE = new ItemArgument();
   public static final SerializableArgument.Type<ItemArgument> TYPE = SerializableArgument.singletonType(INSTANCE);
   private static final Collection<String> EXAMPLES = List.of("stick", "minecraft:stick", "stick{foo=bar}");

   private ItemArgument() {
   }

   @Override
   public SerializableArgument.Type<ItemArgument> type() {
      return TYPE;
   }

   public static ArgumentType<ItemInput> item() {
      return INSTANCE.toBrigadier();
   }

   public static ItemInput getItem(final CommandContext<?> context, final String name) {
      return (ItemInput)context.getArgument(name, ItemInput.class);
   }

   private static ItemParser getParser(final ParseContext context) {
      return new ItemParser(context.holderGetters());
   }

   public ItemInput parse(final StringReader reader, final ParseContext context) throws CommandSyntaxException {
      return getParser(context).parse(reader);
   }

   @Override
   public CompletableFuture<Suggestions> listSuggestions(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) throws CommandSyntaxException {
      return getParser((ParseContext)context.getSource()).fillSuggestions(context, builder);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
