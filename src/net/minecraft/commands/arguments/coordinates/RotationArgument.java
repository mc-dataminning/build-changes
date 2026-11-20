package net.minecraft.commands.arguments.coordinates;

import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.network.chat.Component;

public class RotationArgument implements SerializableArgument.ContextFree<Coordinates> {
   @VisibleForTesting
   public static final RotationArgument INSTANCE = new RotationArgument();
   public static final SerializableArgument.Type<RotationArgument> TYPE = SerializableArgument.singletonType(INSTANCE);
   private static final Collection<String> EXAMPLES = List.of("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType ERROR_NOT_COMPLETE = new SimpleCommandExceptionType(Component.translatable("argument.rotation.incomplete"));

   private RotationArgument() {
   }

   @Override
   public SerializableArgument.Type<RotationArgument> type() {
      return TYPE;
   }

   public static ArgumentType<Coordinates> rotation() {
      return INSTANCE.toBrigadier();
   }

   public static Coordinates getRotation(final CommandContext<?> context, final String name) {
      return (Coordinates)context.getArgument(name, Coordinates.class);
   }

   public Coordinates parse(final StringReader reader) throws CommandSyntaxException {
      int start = reader.getCursor();
      if (!reader.canRead()) {
         throw ERROR_NOT_COMPLETE.createWithContext(reader);
      } else {
         WorldCoordinate y = WorldCoordinate.parseDouble(reader, false);
         if (reader.canRead() && reader.peek() == ' ') {
            reader.skip();
            WorldCoordinate x = WorldCoordinate.parseDouble(reader, false);
            return new WorldCoordinates(x, y, WorldCoordinates.UNUSED);
         } else {
            reader.setCursor(start);
            throw ERROR_NOT_COMPLETE.createWithContext(reader);
         }
      }
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
