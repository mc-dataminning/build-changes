package net.minecraft.commands.arguments.blocks;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.properties.Property;
import org.jspecify.annotations.Nullable;

public class BlockPredicateArgument implements SerializableArgument<BlockPredicateArgument.Result> {
   private static final BlockPredicateArgument INSTANCE = new BlockPredicateArgument();
   public static final SerializableArgument.Type<BlockPredicateArgument> TYPE = SerializableArgument.singletonType(INSTANCE);
   private static final Collection<String> EXAMPLES = List.of("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");

   private BlockPredicateArgument() {
   }

   @Override
   public SerializableArgument.Type<BlockPredicateArgument> type() {
      return TYPE;
   }

   public static ArgumentType<BlockPredicateArgument.Result> blockPredicate() {
      return INSTANCE.toBrigadier();
   }

   public BlockPredicateArgument.Result parse(final StringReader reader, final ParseContext context) throws CommandSyntaxException {
      HolderGetter<Block> blocks = context.holderGetters().lookupOrThrow(Registries.BLOCK);
      return parse(blocks, reader);
   }

   public static BlockPredicateArgument.Result parse(final HolderGetter<Block> blocks, final StringReader reader) throws CommandSyntaxException {
      return (BlockPredicateArgument.Result)BlockStateParser.parseForTesting(blocks, reader, true)
         .map(
            block -> new BlockPredicateArgument.BlockPredicate(block.blockState(), block.properties().keySet(), block.nbt()),
            tag -> new BlockPredicateArgument.TagPredicate(tag.tag(), tag.vagueProperties(), tag.nbt())
         );
   }

   public static Predicate<BlockInWorld> getBlockPredicate(final CommandContext<?> context, final String name) {
      return (Predicate<BlockInWorld>)context.getArgument(name, BlockPredicateArgument.Result.class);
   }

   @Override
   public CompletableFuture<Suggestions> listSuggestions(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) throws CommandSyntaxException {
      return BlockStateParser.fillSuggestions(context, builder, true, true);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }

   private record BlockPredicate(BlockState state, Set<Property<?>> properties, @Nullable CompoundTag nbt) implements BlockPredicateArgument.Result {
      public boolean test(final BlockInWorld blockInWorld) {
         BlockState state = blockInWorld.getState();
         if (!state.is(this.state.getBlock())) {
            return false;
         }

         for (Property<?> property : this.properties) {
            if (state.getValue(property) != this.state.getValue(property)) {
               return false;
            }
         }

         if (this.nbt == null) {
            return true;
         }

         BlockEntity entity = blockInWorld.getEntity();
         return entity != null && NbtUtils.compareNbt(this.nbt, entity.saveWithFullMetadata(blockInWorld.getLevel().registryAccess()), true);
      }
   }

   public interface Result extends Predicate<BlockInWorld> {
   }

   private record TagPredicate(HolderSet<Block> tag, Map<String, String> vagueProperties, @Nullable CompoundTag nbt) implements BlockPredicateArgument.Result {
      public boolean test(final BlockInWorld blockInWorld) {
         BlockState state = blockInWorld.getState();
         if (!state.is(this.tag)) {
            return false;
         }

         for (Entry<String, String> entry : this.vagueProperties.entrySet()) {
            Property<?> property = state.getBlock().getStateDefinition().getProperty(entry.getKey());
            if (property == null) {
               return false;
            }

            Comparable<?> value = (Comparable<?>)property.getValue(entry.getValue()).orElse(null);
            if (value == null) {
               return false;
            }

            if (state.getValue(property) != value) {
               return false;
            }
         }

         if (this.nbt == null) {
            return true;
         }

         BlockEntity entity = blockInWorld.getEntity();
         return entity != null && NbtUtils.compareNbt(this.nbt, entity.saveWithFullMetadata(blockInWorld.getLevel().registryAccess()), true);
      }
   }
}
