import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Set;
import org.slf4j.Logger;

public class hl {
   private static final Logger a = LogUtils.getLogger();
   private static final byte b = 1;
   private static final byte c = 2;

   public static int a(boolean $$0, boolean $$1) {
      int $$2 = 0;
      if ($$0) {
         $$2 |= 1;
      }

      if ($$1) {
         $$2 |= 2;
      }

      return $$2;
   }

   public static boolean a(byte $$0) {
      return ($$0 & 1) != 0;
   }

   public static boolean b(byte $$0) {
      return ($$0 & 2) != 0;
   }

   private static <A extends ArgumentType<?>> void a(JsonObject $$0, hj.a<A> $$1) {
      a($$0, $$1.a(), $$1);
   }

   private static <A extends ArgumentType<?>, T extends hj.a<A>> void a(JsonObject $$0, hj<A, T> $$1, hj.a<A> $$2) {
      $$1.a((T)$$2, $$0);
   }

   private static <T extends ArgumentType<?>> void a(JsonObject $$0, T $$1) {
      hj.a<T> $$2 = hk.b($$1);
      $$0.addProperty("type", "argument");
      $$0.addProperty("parser", kc.x.b($$2.a()).toString());
      JsonObject $$3 = new JsonObject();
      a($$3, $$2);
      if ($$3.size() > 0) {
         $$0.add("properties", $$3);
      }
   }

   public static <S> JsonObject a(CommandDispatcher<S> $$0, CommandNode<S> $$1) {
      JsonObject $$2 = new JsonObject();
      if ($$1 instanceof RootCommandNode) {
         $$2.addProperty("type", "root");
      } else if ($$1 instanceof LiteralCommandNode) {
         $$2.addProperty("type", "literal");
      } else if ($$1 instanceof ArgumentCommandNode<?, ?> $$3) {
         a($$2, $$3.getType());
      } else {
         a.error("Could not serialize node {} ({})!", $$1, $$1.getClass());
         $$2.addProperty("type", "unknown");
      }

      JsonObject $$4 = new JsonObject();

      for (CommandNode<S> $$5 : $$1.getChildren()) {
         $$4.add($$5.getName(), a($$0, $$5));
      }

      if ($$4.size() > 0) {
         $$2.add("children", $$4);
      }

      if ($$1.getCommand() != null) {
         $$2.addProperty("executable", true);
      }

      if ($$1.getRedirect() != null) {
         Collection<String> $$6 = $$0.getPath($$1.getRedirect());
         if (!$$6.isEmpty()) {
            JsonArray $$7 = new JsonArray();

            for (String $$8 : $$6) {
               $$7.add($$8);
            }

            $$2.add("redirect", $$7);
         }
      }

      return $$2;
   }

   public static <T> Set<ArgumentType<?>> a(CommandNode<T> $$0) {
      Set<CommandNode<T>> $$1 = Sets.newIdentityHashSet();
      Set<ArgumentType<?>> $$2 = Sets.newHashSet();
      a($$0, $$2, $$1);
      return $$2;
   }

   private static <T> void a(CommandNode<T> $$0, Set<ArgumentType<?>> $$1, Set<CommandNode<T>> $$2) {
      if ($$2.add($$0)) {
         if ($$0 instanceof ArgumentCommandNode<?, ?> $$3) {
            $$1.add($$3.getType());
         }

         $$0.getChildren().forEach($$2x -> a($$2x, $$1, $$2));
         CommandNode<T> $$4 = $$0.getRedirect();
         if ($$4 != null) {
            a($$4, $$1, $$2);
         }
      }
   }
}
