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

public class gb implements ArgumentType<gb.b> {
   public static final SuggestionProvider<ew> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      hm $$3 = new hm($$2, hm.a((ew)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> fb.b(((ew)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("argument.scoreHolder.empty"));
   final boolean d;

   public gb(boolean $$0) {
      this.d = $$0;
   }

   public static fav a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<fav> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<fav> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ew)$$0.getSource()).l().aJ()::e);
   }

   public static Collection<fav> a(CommandContext<ew> $$0, String $$1, Supplier<Collection<fav>> $$2) throws CommandSyntaxException {
      Collection<fav> $$3 = ((gb.b)$$0.getArgument($$1, gb.b.class)).getNames((ew)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw fj.d.create();
      } else {
         return $$3;
      }
   }

   public static gb a() {
      return new gb(false);
   }

   public static gb b() {
      return new gb(true);
   }

   public gb.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> gb.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hm.a($$1));
   }

   private gb.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hm $$2 = new hm($$0, $$1);
         hl $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw fj.a.createWithContext($$0);
         } else {
            return new gb.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<fav> $$2 = (Collection<fav>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<fav> $$6 = List.of(fav.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     fav $$5x = null;
                     List<fav> $$6x = null;

                     for (arq $$7x : $$4x.L()) {
                        bui $$8 = $$7x.a($$7);
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
                     arr $$5x = $$4x.ag().a($$5);
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

   public static class a implements is<gb, gb.a.a> {
      private static final byte a = 1;

      public void a(gb.a.a $$0, wi $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.l($$2);
      }

      public gb.a.a a(wi $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new gb.a.a($$2);
      }

      public void a(gb.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public gb.a.a a(gb $$0) {
         return new gb.a.a($$0.d);
      }

      public final class a implements is.a<gb> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public gb a(es $$0) {
            return new gb(this.b);
         }

         @Override
         public is<gb, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<fav> getNames(ew var1, Supplier<Collection<fav>> var2) throws CommandSyntaxException;
   }

   public static class c implements gb.b {
      private final hl a;

      public c(hl $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<fav> getNames(ew $$0, Supplier<Collection<fav>> $$1) throws CommandSyntaxException {
         List<? extends bui> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw fj.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
