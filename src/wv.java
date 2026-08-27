import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class wv {
   public static final String a = ", ";
   public static final ws b = ws.b(", ").a(n.h);
   public static final ws c = ws.b(", ");

   public static xg a(xg $$0, xp $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         xp $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xg> a(@Nullable ec $$0, Optional<ws> $$1, @Nullable bql $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xg a(@Nullable ec $$0, ws $$1, @Nullable bql $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xg $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (ws $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xp a(@Nullable ec $$0, xp $$1, @Nullable bql $$2, int $$3) throws CommandSyntaxException {
      wy $$4 = $$1.i();
      if ($$4 != null) {
         ws $$5 = $$4.a(wy.a.a);
         if ($$5 != null) {
            wy $$6 = new wy(wy.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static ws a(Collection<String> $$0) {
      return a($$0, $$0x -> ws.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> ws a(Collection<T> $$0, Function<T, ws> $$1) {
      if ($$0.isEmpty()) {
         return wr.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> ws b(Collection<? extends T> $$0, Function<T, ws> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xg a(Collection<? extends T> $$0, Optional<? extends ws> $$1, Function<T, ws> $$2) {
      return a($$0, (ws)DataFixUtils.orElse($$1, b), $$2);
   }

   public static ws a(Collection<? extends ws> $$0, ws $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xg a(Collection<? extends T> $$0, ws $$1, Function<T, ws> $$2) {
      if ($$0.isEmpty()) {
         return ws.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xg $$3 = ws.i();
         boolean $$4 = true;

         for (T $$5 : $$0) {
            if (!$$4) {
               $$3.b($$1);
            }

            $$3.b($$2.apply($$5));
            $$4 = false;
         }

         return $$3;
      }
   }

   public static xg a(ws $$0) {
      return ws.a("chat.square_brackets", $$0);
   }

   public static ws a(Message $$0) {
      return (ws)($$0 instanceof ws ? (ws)$$0 : ws.b($$0.getString()));
   }

   public static boolean b(@Nullable ws $$0) {
      if ($$0 != null && $$0.b() instanceof yd $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tt.a().b($$2);
      } else {
         return true;
      }
   }

   public static xg a(String $$0) {
      return a((ws)ws.b($$0).a($$1 -> $$1.a(n.k).a(new wq(wq.a.f, $$0)).a(new wy(wy.a.a, ws.c("chat.copy.click"))).a($$0)));
   }
}
