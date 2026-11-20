package net.minecraft.commands.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;

public class ResourceOrTagArgument implements SerializableArgument<ResourceOrTagArgument.Result<?>> {
   private static final MapCodec<ResourceOrTagArgument> MAP_CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(ResourceKey.REGISTRY_CODEC.fieldOf("registry").forGetter(o -> o.registryKey)).apply(i, ResourceOrTagArgument::new)
   );
   private static final StreamCodec<ByteBuf, ResourceOrTagArgument> STREAM_CODEC = StreamCodec.composite(
      ResourceKey.REGISTRY_STREAM_CODEC, o -> o.registryKey, ResourceOrTagArgument::new
   );
   public static final SerializableArgument.Type<ResourceOrTagArgument> TYPE = new SerializableArgument.Type<>(MAP_CODEC, STREAM_CODEC);
   private static final Collection<String> EXAMPLES = List.of("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType ERROR_UNKNOWN_TAG = new Dynamic2CommandExceptionType(
      (id, registry) -> Component.translatableEscape("argument.resource_tag.not_found", id, registry)
   );
   private static final Dynamic3CommandExceptionType ERROR_INVALID_TAG_TYPE = new Dynamic3CommandExceptionType(
      (id, actualRegistry, expectedRegistry) -> Component.translatableEscape("argument.resource_tag.invalid_type", id, actualRegistry, expectedRegistry)
   );
   private final ResourceKey<? extends Registry<?>> registryKey;

   private ResourceOrTagArgument(final ResourceKey<? extends Registry<?>> registryKey) {
      this.registryKey = registryKey;
   }

   @Override
   public SerializableArgument.Type<ResourceOrTagArgument> type() {
      return TYPE;
   }

   public static ArgumentType<ResourceOrTagArgument.Result<?>> resourceOrTag(final ResourceKey<? extends Registry<?>> key) {
      return new ResourceOrTagArgument(key).toBrigadier();
   }

   public static <T> ResourceOrTagArgument.Result<T> getResourceOrTag(
      final CommandContext<?> context, final String name, final ResourceKey<Registry<T>> registryKey
   ) throws CommandSyntaxException {
      ResourceOrTagArgument.Result<?> argument = (ResourceOrTagArgument.Result<?>)context.getArgument(name, ResourceOrTagArgument.Result.class);
      Optional<ResourceOrTagArgument.Result<T>> value = argument.cast(registryKey);
      return value.orElseThrow(() -> (CommandSyntaxException)argument.unwrap().map(element -> {
         ResourceKey<?> elementKey = element.key();
         return ResourceArgument.ERROR_INVALID_RESOURCE_TYPE.create(elementKey.identifier(), elementKey.registry(), registryKey.identifier());
      }, tag -> {
         TagKey<?> tagKey = tag.key();
         return ERROR_INVALID_TAG_TYPE.create(tagKey.location(), tagKey.registry(), registryKey.identifier());
      }));
   }

   public ResourceOrTagArgument.Result<?> parse(final StringReader reader, final ParseContext context) throws CommandSyntaxException {
      if (reader.canRead() && reader.peek() == '#') {
         int cursor = reader.getCursor();

         try {
            reader.skip();
            Identifier tagId = Identifier.read(reader);
            HolderSet.Named<?> holderSet = context.holderGetters()
               .get(TagKey.create(this.registryKey, tagId))
               .orElseThrow(() -> ERROR_UNKNOWN_TAG.createWithContext(reader, tagId, this.registryKey.identifier()));
            return new ResourceOrTagArgument.TagResult<>(holderSet);
         } catch (CommandSyntaxException e) {
            reader.setCursor(cursor);
            throw e;
         }
      } else {
         Identifier resourceId = Identifier.read(reader);
         Holder.Reference<?> holder = context.holderGetters()
            .get(ResourceKey.create(this.registryKey, resourceId))
            .orElseThrow(() -> ResourceArgument.ERROR_UNKNOWN_RESOURCE.createWithContext(reader, resourceId, this.registryKey.identifier()));
         return new ResourceOrTagArgument.ResourceResult<>(holder);
      }
   }

   @Override
   public CompletableFuture<Suggestions> listSuggestions(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) {
      return ((SuggestionContext)context.getSource()).suggestRegistryElements(context, this.registryKey, SuggestionContext.ElementSuggestionType.ALL, builder);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }

   private record ResourceResult<T>(Holder.Reference<T> value) implements ResourceOrTagArgument.Result<T> {
      @Override
      public Either<Holder.Reference<T>, HolderSet.Named<T>> unwrap() {
         return Either.left(this.value);
      }

      @Override
      public <E> Optional<ResourceOrTagArgument.Result<E>> cast(final ResourceKey<? extends Registry<E>> registryKey) {
         return this.value.key().isFor(registryKey) ? Optional.of((ResourceOrTagArgument.Result<E>)this) : Optional.empty();
      }

      public boolean test(final Holder<T> holder) {
         return holder.equals(this.value);
      }

      @Override
      public String asPrintable() {
         return this.value.key().identifier().toString();
      }
   }

   public interface Result<T> extends Predicate<Holder<T>> {
      Either<Holder.Reference<T>, HolderSet.Named<T>> unwrap();

      <E> Optional<ResourceOrTagArgument.Result<E>> cast(final ResourceKey<? extends Registry<E>> registryKey);

      String asPrintable();
   }

   private record TagResult<T>(HolderSet.Named<T> tag) implements ResourceOrTagArgument.Result<T> {
      @Override
      public Either<Holder.Reference<T>, HolderSet.Named<T>> unwrap() {
         return Either.right(this.tag);
      }

      @Override
      public <E> Optional<ResourceOrTagArgument.Result<E>> cast(final ResourceKey<? extends Registry<E>> registryKey) {
         return this.tag.key().isFor(registryKey) ? Optional.of((ResourceOrTagArgument.Result<E>)this) : Optional.empty();
      }

      public boolean test(final Holder<T> holder) {
         return this.tag.contains(holder);
      }

      @Override
      public String asPrintable() {
         return "#" + this.tag.key().location();
      }
   }
}
