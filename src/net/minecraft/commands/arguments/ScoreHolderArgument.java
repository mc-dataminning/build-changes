package net.minecraft.commands.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.arguments.selector.EntitySelector;
import net.minecraft.commands.arguments.selector.EntitySelectorParser;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.commands.suggestions.SuggestionProviders;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.permissions.Permissions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.scores.ScoreHolder;

public class ScoreHolderArgument implements SerializableArgument<ScoreHolderArgument.Result> {
   public static final ScoreHolderArgument.WildcardSupplier EMPTY_WILDCARD = var0 -> List.of();
   public static final ScoreHolderArgument.WildcardSupplier TRACKED_PLAYERS_WILDCARD = server -> server.getScoreboard().getTrackedPlayers();
   private static final MapCodec<ScoreHolderArgument> MAP_CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(Codec.BOOL.fieldOf("multiple").forGetter(o -> o.multiple)).apply(i, ScoreHolderArgument::new)
   );
   private static final StreamCodec<ByteBuf, ScoreHolderArgument> STREAM_CODEC = StreamCodec.composite(
      ByteBufCodecs.BOOL, o -> o.multiple, ScoreHolderArgument::new
   );
   public static final SerializableArgument.Type<ScoreHolderArgument> TYPE = new SerializableArgument.Type<>(MAP_CODEC, STREAM_CODEC);
   public static final SuggestionProvider<CommandSourceStack> SUGGEST_SCORE_HOLDERS = SuggestionProviders.serverOnly(
      (var0, context, builder) -> {
         StringReader reader = new StringReader(builder.getInput());
         reader.setCursor(builder.getStart());
         EntitySelectorParser parser = new EntitySelectorParser(
            reader, ((SuggestionContext)context.getSource()).permissions().hasPermission(Permissions.COMMANDS_ENTITY_SELECTORS)
         );

         try {
            parser.parse();
         } catch (CommandSyntaxException var6) {
         }

         return parser.fillSuggestions(
            builder, suggestions -> SuggestionContext.suggest(((SuggestionContext)context.getSource()).onlinePlayerNames(), suggestions)
         );
      }
   );
   private static final Collection<String> EXAMPLES = List.of("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType ERROR_NO_RESULTS = new SimpleCommandExceptionType(Component.translatable("argument.scoreHolder.empty"));
   private final boolean multiple;

   private ScoreHolderArgument(final boolean multiple) {
      this.multiple = multiple;
   }

   @Override
   public SerializableArgument.Type<ScoreHolderArgument> type() {
      return TYPE;
   }

   public static ScoreHolder getName(final CommandContext<CommandSourceStack> context, final String name, final ScoreHolderArgument.WildcardSupplier wildcard) throws CommandSyntaxException {
      return getName(((CommandSourceStack)context.getSource()).getServer(), context, name, wildcard);
   }

   public static ScoreHolder getName(
      final MinecraftServer server, final CommandContext<CommandSourceStack> context, final String name, final ScoreHolderArgument.WildcardSupplier wildcard
   ) throws CommandSyntaxException {
      return getNames(server, context, name, wildcard).iterator().next();
   }

   public static Collection<? extends ScoreHolder> getNames(
      final CommandContext<CommandSourceStack> context, final String name, final ScoreHolderArgument.WildcardSupplier wildcard
   ) throws CommandSyntaxException {
      return getNames(((CommandSourceStack)context.getSource()).getServer(), context, name, wildcard);
   }

   public static Collection<? extends ScoreHolder> getNames(
      final MinecraftServer server, final CommandContext<CommandSourceStack> context, final String name, final ScoreHolderArgument.WildcardSupplier wildcard
   ) throws CommandSyntaxException {
      Collection<? extends ScoreHolder> result = ((ScoreHolderArgument.Result)context.getArgument(name, ScoreHolderArgument.Result.class))
         .getNames(server, (CommandSourceStack)context.getSource(), wildcard);
      if (result.isEmpty()) {
         throw EntityArgument.NO_ENTITIES_FOUND.create();
      } else {
         return result;
      }
   }

   public static Stream<? extends ScoreHolder> getSuggestedNames(
      final MinecraftServer server,
      final CommandContext<? extends SuggestionContext> context,
      final String name,
      final ScoreHolderArgument.WildcardSupplier wildcard
   ) throws CommandSyntaxException {
      return ((ScoreHolderArgument.Result)context.getArgument(name, ScoreHolderArgument.Result.class))
         .getSuggestedNames(server, (SuggestionContext)context.getSource(), wildcard);
   }

   public static ArgumentType<ScoreHolderArgument.Result> scoreHolder() {
      return new ScoreHolderArgument(false).toBrigadier();
   }

   public static ArgumentType<ScoreHolderArgument.Result> scoreHolders() {
      return new ScoreHolderArgument(true).toBrigadier();
   }

   public ScoreHolderArgument.Result parse(final StringReader reader, final ParseContext context) throws CommandSyntaxException {
      return this.parse(reader, context.allowsSelectors());
   }

   private ScoreHolderArgument.Result parse(final StringReader reader, final boolean allowSelectors) throws CommandSyntaxException {
      if (reader.canRead() && reader.peek() == '@') {
         EntitySelectorParser parser = new EntitySelectorParser(reader, allowSelectors);
         EntitySelector selector = parser.parse();
         if (!this.multiple && selector.getMaxResults() > 1) {
            throw EntityArgument.ERROR_NOT_SINGLE_ENTITY.createWithContext(reader);
         } else {
            return new ScoreHolderArgument.SelectorResult(selector);
         }
      } else {
         int start = reader.getCursor();

         while (reader.canRead() && reader.peek() != ' ') {
            reader.skip();
         }

         String text = reader.getString().substring(start, reader.getCursor());
         if (text.equals("*")) {
            return (ScoreHolderArgument.ContextFreeResult)(server, wildcard) -> {
               Collection<ScoreHolder> results = wildcard.get(server);
               if (results.isEmpty()) {
                  throw ERROR_NO_RESULTS.create();
               } else {
                  return results;
               }
            };
         }

         List<ScoreHolder> nameOnlyHolder = List.of(ScoreHolder.forNameOnly(text));
         if (text.startsWith("#")) {
            return (ScoreHolderArgument.ContextFreeResult)(var1, var2) -> nameOnlyHolder;
         }

         try {
            UUID uuid = UUID.fromString(text);
            return (ScoreHolderArgument.ContextFreeResult)(server, var3x) -> {
               ScoreHolder firstResult = null;
               List<ScoreHolder> moreResults = null;

               for (ServerLevel level : server.getAllLevels()) {
                  Entity entity = level.getEntity(uuid);
                  if (entity != null) {
                     if (firstResult == null) {
                        firstResult = entity;
                     } else {
                        if (moreResults == null) {
                           moreResults = new ArrayList<>();
                           moreResults.add(firstResult);
                        }

                        moreResults.add(entity);
                     }
                  }
               }

               if (moreResults != null) {
                  return moreResults;
               } else {
                  return firstResult != null ? List.of(firstResult) : nameOnlyHolder;
               }
            };
         } catch (IllegalArgumentException var7) {
            return (ScoreHolderArgument.ContextFreeResult)(server, var3x) -> {
               ServerPlayer player = server.getPlayerList().getPlayerByName(text);
               return player != null ? List.of(player) : nameOnlyHolder;
            };
         }
      }
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }

   @FunctionalInterface
   public interface ContextFreeResult extends ScoreHolderArgument.Result {
      Collection<? extends ScoreHolder> getNames(MinecraftServer server, ScoreHolderArgument.WildcardSupplier wildcard) throws CommandSyntaxException;

      @Override
      default Collection<? extends ScoreHolder> getNames(
         final MinecraftServer server, final CommandSourceStack sender, final ScoreHolderArgument.WildcardSupplier wildcard
      ) throws CommandSyntaxException {
         return this.getNames(server, wildcard);
      }

      @Override
      default Stream<? extends ScoreHolder> getSuggestedNames(
         final MinecraftServer server, final SuggestionContext sender, final ScoreHolderArgument.WildcardSupplier wildcard
      ) throws CommandSyntaxException {
         return this.getNames(server, wildcard).stream();
      }
   }

   public interface Result {
      Collection<? extends ScoreHolder> getNames(MinecraftServer server, CommandSourceStack sender, ScoreHolderArgument.WildcardSupplier wildcard) throws CommandSyntaxException;

      Stream<? extends ScoreHolder> getSuggestedNames(MinecraftServer server, SuggestionContext sender, ScoreHolderArgument.WildcardSupplier wildcard) throws CommandSyntaxException;
   }

   public static class SelectorResult implements ScoreHolderArgument.Result {
      private final EntitySelector selector;

      public SelectorResult(final EntitySelector selector) {
         this.selector = selector;
      }

      @Override
      public Collection<? extends ScoreHolder> getNames(
         final MinecraftServer server, final CommandSourceStack sender, final ScoreHolderArgument.WildcardSupplier wildcard
      ) throws CommandSyntaxException {
         List<? extends Entity> entities = this.selector.findEntities(sender);
         if (entities.isEmpty()) {
            throw EntityArgument.NO_ENTITIES_FOUND.create();
         } else {
            return entities;
         }
      }

      @Override
      public Stream<? extends ScoreHolder> getSuggestedNames(
         final MinecraftServer server, final SuggestionContext sender, final ScoreHolderArgument.WildcardSupplier wildcard
      ) throws CommandSyntaxException {
         return this.selector.findSuggestions(server, sender);
      }
   }

   @FunctionalInterface
   public interface WildcardSupplier {
      Collection<ScoreHolder> get(MinecraftServer server);
   }
}
