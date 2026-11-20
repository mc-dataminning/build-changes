package net.minecraft.commands.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;
import net.minecraft.resources.Identifier;

public class IdentifierArgument implements SerializableArgument.ContextFree<Identifier> {
   public static final IdentifierArgument INSTANCE = new IdentifierArgument();
   public static final SerializableArgument.Type<IdentifierArgument> TYPE = SerializableArgument.singletonType(INSTANCE);
   private static final Collection<String> EXAMPLES = List.of("foo", "foo:bar", "012");

   private IdentifierArgument() {
   }

   @Override
   public SerializableArgument.Type<IdentifierArgument> type() {
      return TYPE;
   }

   public static ArgumentType<Identifier> id() {
      return INSTANCE.toBrigadier();
   }

   public static Identifier getId(final CommandContext<?> context, final String name) {
      return (Identifier)context.getArgument(name, Identifier.class);
   }

   public Identifier parse(final StringReader reader) throws CommandSyntaxException {
      return Identifier.read(reader);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
