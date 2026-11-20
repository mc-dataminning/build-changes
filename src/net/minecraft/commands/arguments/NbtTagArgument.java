package net.minecraft.commands.arguments;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.List;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.SnbtGrammar;
import net.minecraft.nbt.Tag;
import net.minecraft.util.parsing.packrat.commands.CommandParserState;
import net.minecraft.util.parsing.packrat.commands.ParserBasedArgument;

public class NbtTagArgument extends ParserBasedArgument<CommandParserState, Tag> {
   public static final NbtTagArgument INSTANCE = new NbtTagArgument();
   public static final SerializableArgument.Type<NbtTagArgument> TYPE = SerializableArgument.singletonType(INSTANCE);
   private static final Collection<String> EXAMPLES = List.of("0", "0b", "0l", "0.0", "\"foo\"", "{foo:bar}", "[0]", "[]", "{}", "true");

   private NbtTagArgument() {
      super(CommandParserState.Simple.FACTORY, SnbtGrammar.createParser(NbtOps.INSTANCE));
   }

   @Override
   public SerializableArgument.Type<NbtTagArgument> type() {
      return TYPE;
   }

   public static ArgumentType<Tag> nbtTag() {
      return INSTANCE.toBrigadier();
   }

   public static Tag getNbtTag(final CommandContext<?> context, final String name) {
      return (Tag)context.getArgument(name, Tag.class);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
