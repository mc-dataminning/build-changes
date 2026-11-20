package net.minecraft.commands.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;
import net.minecraft.advancements.predicates.MinMaxBounds;

public interface RangeArgument<T extends MinMaxBounds<?>> extends SerializableArgument.ContextFree<T> {
   static ArgumentType<MinMaxBounds.Ints> intRange() {
      return RangeArgument.Ints.INSTANCE.toBrigadier();
   }

   static ArgumentType<MinMaxBounds.Doubles> floatRange() {
      return RangeArgument.Floats.INSTANCE.toBrigadier();
   }

   @Override
   SerializableArgument.Type<? extends RangeArgument<T>> type();

   class Floats implements RangeArgument<MinMaxBounds.Doubles> {
      private static final RangeArgument.Floats INSTANCE = new RangeArgument.Floats();
      public static final SerializableArgument.Type<RangeArgument.Floats> TYPE = SerializableArgument.singletonType(INSTANCE);
      private static final Collection<String> EXAMPLES = List.of("0..5.2", "0", "-5.4", "-100.76..", "..100");

      private Floats() {
      }

      @Override
      public SerializableArgument.Type<RangeArgument.Floats> type() {
         return TYPE;
      }

      public static MinMaxBounds.Doubles getRange(final CommandContext<?> context, final String name) {
         return (MinMaxBounds.Doubles)context.getArgument(name, MinMaxBounds.Doubles.class);
      }

      public MinMaxBounds.Doubles parse(final StringReader reader) throws CommandSyntaxException {
         return MinMaxBounds.Doubles.fromReader(reader);
      }

      @Override
      public Collection<String> getExamples() {
         return EXAMPLES;
      }
   }

   class Ints implements RangeArgument<MinMaxBounds.Ints> {
      private static final RangeArgument.Ints INSTANCE = new RangeArgument.Ints();
      public static final SerializableArgument.Type<RangeArgument.Ints> TYPE = SerializableArgument.singletonType(INSTANCE);
      private static final Collection<String> EXAMPLES = List.of("0..5", "0", "-5", "-100..", "..100");

      private Ints() {
      }

      @Override
      public SerializableArgument.Type<RangeArgument.Ints> type() {
         return TYPE;
      }

      public static MinMaxBounds.Ints getRange(final CommandContext<?> context, final String name) {
         return (MinMaxBounds.Ints)context.getArgument(name, MinMaxBounds.Ints.class);
      }

      public MinMaxBounds.Ints parse(final StringReader reader) throws CommandSyntaxException {
         return MinMaxBounds.Ints.fromReader(reader);
      }

      @Override
      public Collection<String> getExamples() {
         return EXAMPLES;
      }
   }
}
