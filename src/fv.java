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

public class fv implements ArgumentType<fv.b> {
   public static final SuggestionProvider<eq> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      hg $$3 = new hg($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> ev.b(((eq)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.scoreHolder.empty"));
   final boolean d;

   public fv(boolean $$0) {
      this.d = $$0;
   }

   public static exc a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<exc> b(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<exc> c(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((eq)$$0.getSource()).l().aK()::e);
   }

   public static Collection<exc> a(CommandContext<eq> $$0, String $$1, Supplier<Collection<exc>> $$2) throws CommandSyntaxException {
      Collection<exc> $$3 = ((fv.b)$$0.getArgument($$1, fv.b.class)).getNames((eq)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw fd.d.create();
      } else {
         return $$3;
      }
   }

   public static fv a() {
      return new fv(false);
   }

   public static fv b() {
      return new fv(true);
   }

   public fv.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hg $$1 = new hg($$0);
         hf $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw fd.a.createWithContext($$0);
         } else {
            return new fv.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<exc> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<exc> $$5 = List.of(exc.c($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     exc $$5x = null;
                     List<exc> $$6x = null;

                     for (aqk $$7 : $$4x.K()) {
                        bsd $$8 = $$7.a($$6);
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
                        return $$5x != null ? List.of($$5x) : $$5;
                     }
                  };
               } catch (IllegalArgumentException var6) {
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     aql $$5x = $$4x.ah().a($$4);
                     return $$5x != null ? List.of($$5x) : $$5;
                  };
               }
            }
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a implements il<fv, fv.a.a> {
      private static final byte a = 1;

      public void a(fv.a.a $$0, vr $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public fv.a.a a(vr $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fv.a.a($$2);
      }

      public void a(fv.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fv.a.a a(fv $$0) {
         return new fv.a.a($$0.d);
      }

      public final class a implements il.a<fv> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public fv a(em $$0) {
            return new fv(this.b);
         }

         @Override
         public il<fv, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<exc> getNames(eq var1, Supplier<Collection<exc>> var2) throws CommandSyntaxException;
   }

   public static class c implements fv.b {
      private final hf a;

      public c(hf $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<exc> getNames(eq $$0, Supplier<Collection<exc>> $$1) throws CommandSyntaxException {
         List<? extends bsd> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw fd.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
