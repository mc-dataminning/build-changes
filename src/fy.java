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

public class fy implements ArgumentType<fy.b> {
   public static final SuggestionProvider<et> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      hj $$3 = new hj($$2, hj.a((et)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> ey.b(((et)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("argument.scoreHolder.empty"));
   final boolean d;

   public fy(boolean $$0) {
      this.d = $$0;
   }

   public static eyf a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<eyf> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<eyf> c(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((et)$$0.getSource()).l().aK()::e);
   }

   public static Collection<eyf> a(CommandContext<et> $$0, String $$1, Supplier<Collection<eyf>> $$2) throws CommandSyntaxException {
      Collection<eyf> $$3 = ((fy.b)$$0.getArgument($$1, fy.b.class)).getNames((et)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw fg.d.create();
      } else {
         return $$3;
      }
   }

   public static fy a() {
      return new fy(false);
   }

   public static fy b() {
      return new fy(true);
   }

   public fy.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> fy.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hj.a($$1));
   }

   private fy.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hj $$2 = new hj($$0, $$1);
         hi $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw fg.a.createWithContext($$0);
         } else {
            return new fy.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<eyf> $$2 = (Collection<eyf>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<eyf> $$6 = List.of(eyf.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     eyf $$5x = null;
                     List<eyf> $$6x = null;

                     for (aqu $$7x : $$4x.K()) {
                        bsr $$8 = $$7x.a($$7);
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
                     aqv $$5x = $$4x.ah().a($$5);
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

   public static class a implements io<fy, fy.a.a> {
      private static final byte a = 1;

      public void a(fy.a.a $$0, vw $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public fy.a.a a(vw $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fy.a.a($$2);
      }

      public void a(fy.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fy.a.a a(fy $$0) {
         return new fy.a.a($$0.d);
      }

      public final class a implements io.a<fy> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public fy a(ep $$0) {
            return new fy(this.b);
         }

         @Override
         public io<fy, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<eyf> getNames(et var1, Supplier<Collection<eyf>> var2) throws CommandSyntaxException;
   }

   public static class c implements fy.b {
      private final hi a;

      public c(hi $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<eyf> getNames(et $$0, Supplier<Collection<eyf>> $$1) throws CommandSyntaxException {
         List<? extends bsr> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw fg.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
