package net.minecraft.commands.functions;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.commands.ExecutionCommandSource;
import net.minecraft.commands.FunctionInstantiationException;
import net.minecraft.commands.execution.UnboundEntryAction;
import net.minecraft.nbt.ByteTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.DoubleTag;
import net.minecraft.nbt.FloatTag;
import net.minecraft.nbt.LongTag;
import net.minecraft.nbt.ShortTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import org.jspecify.annotations.Nullable;

public class MacroFunction<Runtime extends ExecutionCommandSource<Runtime>> implements CommandFunction<Runtime> {
   private static final DecimalFormat DECIMAL_FORMAT = Util.make(
      new DecimalFormat("#", DecimalFormatSymbols.getInstance(Locale.ROOT)), format -> format.setMaximumFractionDigits(15)
   );
   private static final int MAX_CACHE_ENTRIES = 8;
   private final CommandParser.Provider<Runtime> parserProvider;
   private final Identifier id;
   private final List<MacroFunction.Entry<Runtime>> entries;
   private final List<String> parameters;
   private final Object2ObjectLinkedOpenHashMap<List<String>, InstantiatedFunction<Runtime>> cache = new Object2ObjectLinkedOpenHashMap(8, 0.25F);

   MacroFunction(
      final CommandParser.Provider<Runtime> parserProvider,
      final Identifier id,
      final List<MacroFunction.Entry<Runtime>> entries,
      final List<String> parameters
   ) {
      this.parserProvider = parserProvider;
      this.id = id;
      this.entries = entries;
      this.parameters = parameters;
   }

   @Override
   public Identifier id() {
      return this.id;
   }

   @Override
   public InstantiatedFunction<Runtime> instantiate(final @Nullable CompoundTag arguments) throws FunctionInstantiationException {
      if (arguments == null) {
         throw new FunctionInstantiationException(Component.translatable("commands.function.error.missing_arguments", Component.translationArg(this.id())));
      }

      List<String> parameterValues = new ArrayList<>(this.parameters.size());

      for (String argument : this.parameters) {
         Tag argumentValue = arguments.get(argument);
         if (argumentValue == null) {
            throw new FunctionInstantiationException(
               Component.translatable("commands.function.error.missing_argument", Component.translationArg(this.id()), argument)
            );
         }

         parameterValues.add(stringify(argumentValue));
      }

      InstantiatedFunction<Runtime> cachedFunction = (InstantiatedFunction<Runtime>)this.cache.getAndMoveToLast(parameterValues);
      if (cachedFunction != null) {
         return cachedFunction;
      }

      if (this.cache.size() >= 8) {
         this.cache.removeFirst();
      }

      InstantiatedFunction<Runtime> function = this.substituteAndParse(this.parameters, parameterValues);
      this.cache.put(parameterValues, function);
      return function;
   }

   private static String stringify(final Tag tag) {
      return switch (tag) {
         case FloatTag(float value) -> DECIMAL_FORMAT.format(value);
         case DoubleTag(double value) -> DECIMAL_FORMAT.format(value);
         case ByteTag(byte value) -> String.valueOf(value);
         case ShortTag(short value) -> String.valueOf(value);
         case LongTag(long value) -> String.valueOf(value);
         case StringTag(String value) -> value;
         default -> tag.toString();
      };
   }

   private static void lookupValues(final List<String> values, final IntList indicesToSelect, final List<String> selectedValuesOutput) {
      selectedValuesOutput.clear();
      indicesToSelect.forEach(index -> selectedValuesOutput.add(values.get(index)));
   }

   private InstantiatedFunction<Runtime> substituteAndParse(final List<String> keys, final List<String> values) throws FunctionInstantiationException {
      List<UnboundEntryAction<Runtime>> newEntries = new ArrayList<>(this.entries.size());
      List<String> entryArguments = new ArrayList<>(values.size());

      try (CommandParser<Runtime> parser = this.parserProvider.create(this.id)) {
         for (MacroFunction.Entry<Runtime> entry : this.entries) {
            lookupValues(values, entry.parameters(), entryArguments);
            newEntries.add(entry.instantiate(entryArguments, parser, this.id));
         }
      } catch (FunctionInstantiationException e) {
         throw e;
      } catch (Exception e) {
         throw new FunctionInstantiationException(
            Component.translatable("commands.function.error.validation", Component.translationArg(this.id), e.getMessage())
         );
      }

      return new PlainTextFunction<>(this.id().withPath(id -> id + "/" + keys.hashCode()), newEntries);
   }

   interface Entry<Runtime> {
      IntList parameters();

      UnboundEntryAction<Runtime> instantiate(List<String> substitutions, CommandParser<Runtime> parser, Identifier funtionId) throws FunctionInstantiationException;
   }

   static class MacroEntry<Runtime extends ExecutionCommandSource<Runtime>> implements MacroFunction.Entry<Runtime> {
      private final StringTemplate template;
      private final IntList parameters;

      public MacroEntry(final StringTemplate template, final IntList parameters) {
         this.template = template;
         this.parameters = parameters;
      }

      @Override
      public IntList parameters() {
         return this.parameters;
      }

      @Override
      public UnboundEntryAction<Runtime> instantiate(final List<String> substitutions, final CommandParser<Runtime> parse, final Identifier functionId) throws FunctionInstantiationException {
         String command = this.template.substitute(substitutions);

         try {
            return CommandFunction.parseCommand(parse, new StringReader(command));
         } catch (CommandSyntaxException e) {
            throw new FunctionInstantiationException(
               Component.translatable("commands.function.error.parse", Component.translationArg(functionId), command, e.getMessage())
            );
         }
      }
   }

   static class PlainTextEntry<Runtime> implements MacroFunction.Entry<Runtime> {
      private final UnboundEntryAction<Runtime> compiledAction;

      public PlainTextEntry(final UnboundEntryAction<Runtime> compiledAction) {
         this.compiledAction = compiledAction;
      }

      @Override
      public IntList parameters() {
         return IntLists.emptyList();
      }

      @Override
      public UnboundEntryAction<Runtime> instantiate(final List<String> substitutions, final CommandParser<Runtime> parser, final Identifier functionId) {
         return this.compiledAction;
      }
   }
}
