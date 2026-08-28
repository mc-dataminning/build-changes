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

public class ga implements ArgumentType<ga.b> {
   public static final SuggestionProvider<ev> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      hl $$3 = new hl($$2, hl.a((ev)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> fa.b(((ev)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("argument.scoreHolder.empty"));
   final boolean d;

   public ga(boolean $$0) {
      this.d = $$0;
   }

   public static fal a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<fal> b(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<fal> c(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ev)$$0.getSource()).l().aJ()::e);
   }

   public static Collection<fal> a(CommandContext<ev> $$0, String $$1, Supplier<Collection<fal>> $$2) throws CommandSyntaxException {
      Collection<fal> $$3 = ((ga.b)$$0.getArgument($$1, ga.b.class)).getNames((ev)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw fi.d.create();
      } else {
         return $$3;
      }
   }

   public static ga a() {
      return new ga(false);
   }

   public static ga b() {
      return new ga(true);
   }

   public ga.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> ga.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hl.a($$1));
   }

   private ga.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hl $$2 = new hl($$0, $$1);
         hk $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw fi.a.createWithContext($$0);
         } else {
            return new ga.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<fal> $$2 = (Collection<fal>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<fal> $$6 = List.of(fal.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     fal $$5x = null;
                     List<fal> $$6x = null;

                     for (arm $$7x : $$4x.L()) {
                        btz $$8 = $$7x.a($$7);
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
                     arn $$5x = $$4x.ag().a($$5);
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

   public static class a implements ir<ga, ga.a.a> {
      private static final byte a = 1;

      public void a(ga.a.a $$0, we $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.l($$2);
      }

      public ga.a.a a(we $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new ga.a.a($$2);
      }

      public void a(ga.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public ga.a.a a(ga $$0) {
         return new ga.a.a($$0.d);
      }

      public final class a implements ir.a<ga> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public ga a(er $$0) {
            return new ga(this.b);
         }

         @Override
         public ir<ga, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<fal> getNames(ev var1, Supplier<Collection<fal>> var2) throws CommandSyntaxException;
   }

   public static class c implements ga.b {
      private final hk a;

      public c(hk $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<fal> getNames(ev $$0, Supplier<Collection<fal>> $$1) throws CommandSyntaxException {
         List<? extends btz> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw fi.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
