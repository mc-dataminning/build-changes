import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.server.MinecraftServer;

public class gc implements ArgumentType<gc.b> {
   public static final SuggestionProvider<ex> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      hn $$3 = new hn($$2, hn.a((ex)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> fc.b(((ex)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wo.c("argument.scoreHolder.empty"));
   final boolean d;

   public gc(boolean $$0) {
      this.d = $$0;
   }

   public static fcc a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<fcc> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<fcc> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ex)$$0.getSource()).l().aJ()::e);
   }

   public static Collection<fcc> a(CommandContext<ex> $$0, String $$1, Supplier<Collection<fcc>> $$2) throws CommandSyntaxException {
      Collection<fcc> $$3 = ((gc.b)$$0.getArgument($$1, gc.b.class)).getNames((ex)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw fk.d.create();
      } else {
         return $$3;
      }
   }

   public static gc a() {
      return new gc(false);
   }

   public static gc b() {
      return new gc(true);
   }

   public gc.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> gc.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hn.a($$1));
   }

   private gc.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hn $$2 = new hn($$0, $$1);
         hm $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw fk.a.createWithContext($$0);
         } else {
            return new gc.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<fcc> $$2 = (Collection<fcc>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<fcc> $$6 = List.of(fcc.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     fcc $$5x = null;
                     List<fcc> $$6x = null;

                     for (arc $$7x : $$4x.L()) {
                        buj $$8 = $$7x.a($$7);
                        if ($$8 != null) {
                           if ($$5x == null) {
                              $$5x = $$8;
                           } else {
                              if ($$6x == null) {
                                 $$6x = new ArrayList<>();
                                 $$6x.add($$5x);
                              }

                              $$6x.add($$8);
                           }
                        }
                     }

                     if ($$6x != null) {
                        return $$6x;
                     } else {
                        return $$5x != null ? List.of($$5x) : $$6;
                     }
                  };
               } catch (IllegalArgumentException var7) {
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     ard $$5x = $$4x.ag().a($$5);
                     return $$5x != null ? List.of($$5x) : $$6;
                  };
               }
            }
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a implements it<gc, gc.a.a> {
      private static final byte a = 1;

      public void a(gc.a.a $$0, vl $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.l($$2);
      }

      public gc.a.a a(vl $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new gc.a.a($$2);
      }

      public void a(gc.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public gc.a.a a(gc $$0) {
         return new gc.a.a($$0.d);
      }

      public final class a implements it.a<gc> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public gc a(et $$0) {
            return new gc(this.b);
         }

         @Override
         public it<gc, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<fcc> getNames(ex var1, Supplier<Collection<fcc>> var2) throws CommandSyntaxException;
   }

   public static class c implements gc.b {
      private final hm a;

      public c(hm $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<fcc> getNames(ex $$0, Supplier<Collection<fcc>> $$1) throws CommandSyntaxException {
         List<? extends buj> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw fk.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
