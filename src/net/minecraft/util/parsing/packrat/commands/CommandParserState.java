package net.minecraft.util.parsing.packrat.commands;

import com.mojang.brigadier.StringReader;
import net.minecraft.commands.ParseContext;

public interface CommandParserState {
   StringReader reader();

   static CommandParserState simple(final StringReader reader) {
      return new CommandParserState.Simple(reader);
   }

   static CommandParserState simple(final String value) {
      return simple(new StringReader(value));
   }

   interface Factory<S extends CommandParserState> {
      default S create(final ParseContext parseContext, final String input) {
         return this.create(parseContext, new StringReader(input));
      }

      S create(ParseContext parseContext, StringReader reader);
   }

   record Simple(StringReader reader) implements CommandParserState {
      public static final CommandParserState.Factory<CommandParserState.Simple> FACTORY = (var0, reader) -> new CommandParserState.Simple(reader);
   }
}
