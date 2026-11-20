package net.minecraft.commands.arguments.coordinates;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;

public class SwizzleArgument implements SerializableArgument.ContextFree<EnumSet<Direction.Axis>> {
   public static final SwizzleArgument INSTANCE = new SwizzleArgument();
   public static final SerializableArgument.Type<SwizzleArgument> TYPE = SerializableArgument.singletonType(INSTANCE);
   private static final Collection<String> EXAMPLES = List.of("xyz", "x");
   private static final SimpleCommandExceptionType ERROR_INVALID = new SimpleCommandExceptionType(Component.translatable("arguments.swizzle.invalid"));

   private SwizzleArgument() {
   }

   @Override
   public SerializableArgument.Type<SwizzleArgument> type() {
      return TYPE;
   }

   public static ArgumentType<EnumSet<Direction.Axis>> swizzle() {
      return INSTANCE.toBrigadier();
   }

   public static EnumSet<Direction.Axis> getSwizzle(final CommandContext<?> context, final String name) {
      return (EnumSet<Direction.Axis>)context.getArgument(name, EnumSet.class);
   }

   public EnumSet<Direction.Axis> parse(final StringReader reader) throws CommandSyntaxException {
      EnumSet<Direction.Axis> result = EnumSet.noneOf(Direction.Axis.class);

      while (reader.canRead() && reader.peek() != ' ') {
         char c = reader.read();

         Direction.Axis axis = switch (c) {
            case 'x' -> Direction.Axis.X;
            case 'y' -> Direction.Axis.Y;
            case 'z' -> Direction.Axis.Z;
            default -> throw ERROR_INVALID.createWithContext(reader);
         };
         if (result.contains(axis)) {
            throw ERROR_INVALID.createWithContext(reader);
         }

         result.add(axis);
      }

      return result;
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
