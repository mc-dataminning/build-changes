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

public class gd implements ArgumentType<gd.b> {
   public static final SuggestionProvider<ex> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      ho $$3 = new ho($$2, ho.a((ex)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> fc.b(((ex)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wv.c("argument.scoreHolder.empty"));
   final boolean d;

   public gd(boolean $$0) {
      this.d = $$0;
   }

   public static fdy a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<fdy> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<fdy> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ex)$$0.getSource()).l().aJ()::e);
   }

   public static Collection<fdy> a(CommandContext<ex> $$0, String $$1, Supplier<Collection<fdy>> $$2) throws CommandSyntaxException {
      Collection<fdy> $$3 = ((gd.b)$$0.getArgument($$1, gd.b.class)).getNames((ex)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw fk.d.create();
      } else {
         return $$3;
      }
   }

   public static gd a() {
      return new gd(false);
   }

   public static gd b() {
      return new gd(true);
   }

   public gd.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> gd.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, ho.a($$1));
   }

   private gd.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         ho $$2 = new ho($$0, $$1);
         hn $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw fk.a.createWithContext($$0);
         } else {
            return new gd.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<fdy> $$2 = (Collection<fdy>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<fdy> $$6 = List.of(fdy.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     fdy $$5x = null;
                     List<fdy> $$6x = null;

                     for (arn $$7x : $$4x.L()) {
                        bvs $$8 = $$7x.b($$7);
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
                     aro $$5x = $$4x.ag().a($$5);
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

   public static class a implements iu<gd, gd.a.a> {
      private static final byte a = 1;

      public void a(gd.a.a $$0, vr $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.l($$2);
      }

      public gd.a.a a(vr $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new gd.a.a($$2);
      }

      public void a(gd.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public gd.a.a a(gd $$0) {
         return new gd.a.a($$0.d);
      }

      public final class a implements iu.a<gd> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public gd a(et $$0) {
            return new gd(this.b);
         }

         @Override
         public iu<gd, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<fdy> getNames(ex var1, Supplier<Collection<fdy>> var2) throws CommandSyntaxException;
   }

   public static class c implements gd.b {
      private final hn a;

      public c(hn $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<fdy> getNames(ex $$0, Supplier<Collection<fdy>> $$1) throws CommandSyntaxException {
         List<? extends bvs> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw fk.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
