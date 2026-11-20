package net.minecraft.commands.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.StringRepresentable;
import net.minecraft.util.Util;
import net.minecraft.util.context.ContextKeySet;
import net.minecraft.world.inventory.SlotRange;
import net.minecraft.world.inventory.SlotRanges;
import net.minecraft.world.item.slot.RangeSlotSource;
import net.minecraft.world.item.slot.SlotSource;
import net.minecraft.world.item.slot.SlotSources;

public class SlotSourceArgument implements SerializableArgument<SlotSourceArgument.SlotResult>, ValidatableArgument {
   public static final SerializableArgument.Type<SlotSourceArgument> TYPE = ValidatableArgument.codecWithValidation(SlotSourceArgument::new);
   private static final Collection<String> EXAMPLES = Util.join(ResourceOrIdArgument.EXAMPLES, SlotsArgument.EXAMPLES);
   private final SlotSourceArgument.RawArgument holderArgument;

   public SlotSourceArgument(final ContextKeySet contextKeySet) {
      this.holderArgument = new SlotSourceArgument.RawArgument(contextKeySet);
   }

   @Override
   public SerializableArgument.Type<SlotSourceArgument> type() {
      return TYPE;
   }

   @Override
   public ContextKeySet contextKeySet() {
      return this.holderArgument.contextKeySet();
   }

   public static ArgumentType<SlotSourceArgument.SlotResult> slotSource(final ContextKeySet contextKeySet) {
      return new SlotSourceArgument(contextKeySet).toBrigadier();
   }

   public static SlotSourceArgument.SlotResult getSlotSource(final CommandContext<?> context, final String name) {
      return (SlotSourceArgument.SlotResult)context.getArgument(name, SlotSourceArgument.SlotResult.class);
   }

   public SlotSourceArgument.SlotResult parse(final StringReader reader, final ParseContext context) throws CommandSyntaxException {
      int start = reader.getCursor();
      SlotRange slotRange = SlotRanges.tryRead(reader);
      if (slotRange != null) {
         return this.wrapRawSlotRange(context, slotRange);
      }

      reader.setCursor(start);
      ValidationWrapper<SlotSource> result = (ValidationWrapper<SlotSource>)this.holderArgument.parse(reader, context);
      return new SlotSourceArgument.SlotResult(result, Optional.empty());
   }

   private SlotSourceArgument.SlotResult wrapRawSlotRange(final ParseContext parseContext, final SlotRange slotRange) throws CommandSyntaxException {
      return new SlotSourceArgument.SlotResult(
         parseContext.getOrCreateValidationWrapper(Holder.direct(RangeSlotSource.slotRange(slotRange)), this.contextKeySet()), Optional.of(slotRange)
      );
   }

   @Override
   public CompletableFuture<Suggestions> listSuggestions(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) {
      SuggestionsBuilder sub = builder.restart();
      SuggestionContext.suggest(SlotRanges.allNames(), sub);
      builder.add(sub);
      return this.holderArgument.listSuggestions(context, builder);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }

   private static class RawArgument extends ValidatableResourceOrIdArgument<SlotSource> {
      public static final SerializableArgument.Type<SlotSourceArgument.RawArgument> TYPE = ValidatableArgument.codecWithValidation(
         SlotSourceArgument.RawArgument::new
      );

      private RawArgument(final ContextKeySet contextKeySet) {
         super(Registries.SLOT_SOURCE, SlotSources.DIRECT_CODEC, contextKeySet);
      }

      @Override
      public SerializableArgument.Type<SlotSourceArgument.RawArgument> type() {
         return TYPE;
      }
   }

   public record SlotResult(ValidationWrapper<SlotSource> value, Optional<SlotRange> originalSlotRange) {
      public Optional<String> name() {
         return this.originalSlotRange.isPresent()
            ? this.originalSlotRange.map(StringRepresentable::getSerializedName)
            : this.value.getRegisteredNameIfPresent();
      }
   }
}
