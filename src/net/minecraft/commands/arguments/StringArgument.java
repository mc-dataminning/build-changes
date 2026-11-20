package net.minecraft.commands.arguments;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;

public abstract class StringArgument extends BrigadierWrapperArgument<String, StringArgumentType> {
   @Override
   public abstract SerializableArgument.Type<? extends StringArgument> type();

   private StringArgument(final StringArgumentType type) {
      super(type);
   }

   public static ArgumentType<String> word() {
      return StringArgument.Word.INSTANCE.toBrigadier();
   }

   public static ArgumentType<String> string() {
      return StringArgument.Quoted.INSTANCE.toBrigadier();
   }

   public static ArgumentType<String> greedyString() {
      return StringArgument.Greedy.INSTANCE.toBrigadier();
   }

   public static String getString(final CommandContext<?> context, final String name) {
      return (String)context.getArgument(name, String.class);
   }

   public static class Greedy extends StringArgument {
      public static final StringArgument.Greedy INSTANCE = new StringArgument.Greedy();
      public static final SerializableArgument.Type<StringArgument.Greedy> TYPE = SerializableArgument.singletonType(INSTANCE);

      private Greedy() {
         super(StringArgumentType.greedyString());
      }

      @Override
      public SerializableArgument.Type<StringArgument.Greedy> type() {
         return TYPE;
      }
   }

   public static class Quoted extends StringArgument {
      public static final StringArgument.Quoted INSTANCE = new StringArgument.Quoted();
      public static final SerializableArgument.Type<StringArgument.Quoted> TYPE = SerializableArgument.singletonType(INSTANCE);

      private Quoted() {
         super(StringArgumentType.string());
      }

      @Override
      public SerializableArgument.Type<StringArgument.Quoted> type() {
         return TYPE;
      }
   }

   public static class Word extends StringArgument {
      public static final StringArgument.Word INSTANCE = new StringArgument.Word();
      public static final SerializableArgument.Type<StringArgument.Word> TYPE = SerializableArgument.singletonType(INSTANCE);

      private Word() {
         super(StringArgumentType.word());
      }

      @Override
      public SerializableArgument.Type<StringArgument.Word> type() {
         return TYPE;
      }
   }
}
