package net.minecraft.commands.functions;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
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

public class MacroFunction<T extends ExecutionCommandSource<T>> implements CommandFunction<T> {
   private static final DecimalFormat DECIMAL_FORMAT = Util.make(
      new DecimalFormat("#", DecimalFormatSymbols.getInstance(Locale.ROOT)), format -> format.setMaximumFractionDigits(15)
   );
   private static final int MAX_CACHE_ENTRIES = 8;
   private final List<String> parameters;
   private final Object2ObjectLinkedOpenHashMap<List<String>, InstantiatedFunction<T>> cache = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final Identifier id;
   private final List<MacroFunction.Entry<T>> entries;

   public MacroFunction(final Identifier id, final List<MacroFunction.Entry<T>> entries, final List<String> parameters) {
      this.id = id;
      this.entries = entries;
      this.parameters = parameters;
   }

   @Override
   public Identifier id() {
      return this.id;
   }

   @Override
   public InstantiatedFunction<T> instantiate(@Nullable final CompoundTag arguments, final CommandDispatcher<T> dispatcher) throws FunctionInstantiationException {
      if (arguments == null) {
         throw new FunctionInstantiationException(Component.translatable("commands.function.error.missing_arguments", Component.translationArg(this.id())));
      } else {
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

         InstantiatedFunction<T> cachedFunction = (InstantiatedFunction<T>)this.cache.getAndMoveToLast(parameterValues);
         if (cachedFunction != null) {
            return cachedFunction;
         } else {
            if (this.cache.size() >= 8) {
               this.cache.removeFirst();
            }

            InstantiatedFunction<T> function = this.substituteAndParse(this.parameters, parameterValues, dispatcher);
            this.cache.put(parameterValues, function);
            return function;
         }
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static String stringify(final Tag tag) {
      Objects.requireNonNull(tag);
      Tag var1 = tag;
      byte var2 = 0;

      while (true) {
         Throwable var32;
         switch (SwitchBootstraps.typeSwitch<"typeSwitch",FloatTag,DoubleTag,ByteTag,ShortTag,LongTag,StringTag>(var1, var2)) {
            case 0:
               FloatTag var3 = (FloatTag)var1;
               FloatTag var42 = var3;

               try {
                  var43 = var42.value();
               } catch (Throwable var24) {
                  var32 = var24;
                  boolean var48 = false;
                  break;
               }

               float var26 = var43;
               if (true) {
                  return DECIMAL_FORMAT.format((double)var26);
               }

               var2 = 1;
               continue;
            case 1:
               DoubleTag var5 = (DoubleTag)var1;
               DoubleTag var40 = var5;

               try {
                  var41 = var40.value();
               } catch (Throwable var23) {
                  var32 = var23;
                  boolean var47 = false;
                  break;
               }

               double var27 = var41;
               if (true) {
                  return DECIMAL_FORMAT.format(var27);
               }

               var2 = 2;
               continue;
            case 2:
               ByteTag var8 = (ByteTag)var1;
               ByteTag var38 = var8;

               try {
                  var39 = var38.value();
               } catch (Throwable var22) {
                  var32 = var22;
                  boolean var46 = false;
                  break;
               }

               byte var28 = var39;
               if (true) {
                  return String.valueOf((int)var28);
               }

               var2 = 3;
               continue;
            case 3:
               ShortTag var10 = (ShortTag)var1;
               ShortTag var36 = var10;

               try {
                  var37 = var36.value();
               } catch (Throwable var21) {
                  var32 = var21;
                  boolean var45 = false;
                  break;
               }

               short var29 = var37;
               if (true) {
                  return String.valueOf((int)var29);
               }

               var2 = 4;
               continue;
            case 4:
               LongTag var12 = (LongTag)var1;
               LongTag var34 = var12;

               try {
                  var35 = var34.value();
               } catch (Throwable var20) {
                  var32 = var20;
                  boolean var44 = false;
                  break;
               }

               long var30 = var35;
               if (true) {
                  return String.valueOf(var30);
               }

               var2 = 5;
               continue;
            case 5:
               StringTag var15 = (StringTag)var1;
               StringTag var31 = var15;

               try {
                  var33 = var31.value();
               } catch (Throwable var19) {
                  var32 = var19;
                  boolean var10001 = false;
                  break;
               }

               return var33;
            default:
               return tag.toString();
         }

         Throwable var25 = var32;
         throw new MatchException(var25.toString(), var25);
      }
   }

   private static void lookupValues(final List<String> values, final IntList indicesToSelect, final List<String> selectedValuesOutput) {
      selectedValuesOutput.clear();
      indicesToSelect.forEach(index -> selectedValuesOutput.add(values.get(index)));
   }

   private InstantiatedFunction<T> substituteAndParse(final List<String> keys, final List<String> values, final CommandDispatcher<T> dispatcher) throws FunctionInstantiationException {
      List<UnboundEntryAction<T>> newEntries = new ArrayList<>(this.entries.size());
      List<String> entryArguments = new ArrayList<>(values.size());

      for (MacroFunction.Entry<T> entry : this.entries) {
         lookupValues(values, entry.parameters(), entryArguments);
         newEntries.add(entry.instantiate(entryArguments, dispatcher, this.id));
      }

      return new PlainTextFunction<>(this.id().withPath(id -> id + "/" + keys.hashCode()), newEntries);
   }

   interface Entry<T> {
      IntList parameters();

      UnboundEntryAction<T> instantiate(List<String> substitutions, CommandDispatcher<T> dispatcher, Identifier funtionId) throws FunctionInstantiationException;
   }

   static class MacroEntry<T extends ExecutionCommandSource<T>> implements MacroFunction.Entry<T> {
      private final StringTemplate template;
      private final IntList parameters;
      private final T compilationContext;

      public MacroEntry(final StringTemplate template, final IntList parameters, final T compilationContext) {
         this.template = template;
         this.parameters = parameters;
         this.compilationContext = compilationContext;
      }

      @Override
      public IntList parameters() {
         return this.parameters;
      }

      @Override
      public UnboundEntryAction<T> instantiate(final List<String> substitutions, final CommandDispatcher<T> dispatcher, final Identifier functionId) throws FunctionInstantiationException {
         String command = this.template.substitute(substitutions);

         try {
            return CommandFunction.parseCommand(dispatcher, this.compilationContext, new StringReader(command));
         } catch (CommandSyntaxException var6) {
            throw new FunctionInstantiationException(
               Component.translatable("commands.function.error.parse", Component.translationArg(functionId), command, var6.getMessage())
            );
         }
      }
   }

   static class PlainTextEntry<T> implements MacroFunction.Entry<T> {
      private final UnboundEntryAction<T> compiledAction;

      public PlainTextEntry(final UnboundEntryAction<T> compiledAction) {
         this.compiledAction = compiledAction;
      }

      @Override
      public IntList parameters() {
         return IntLists.emptyList();
      }

      @Override
      public UnboundEntryAction<T> instantiate(final List<String> substitutions, final CommandDispatcher<T> dispatcher, final Identifier functionId) {
         return this.compiledAction;
      }
   }
}
