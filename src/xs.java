import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xs {
   public static final String a = ", ";
   public static final xp b = xp.b(", ").a(n.h);
   public static final xp c = xp.b(", ");

   public static yd a(yd $$0, ym $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ym $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<yd> a(@Nullable ep $$0, Optional<xp> $$1, @Nullable bsv $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static yd a(@Nullable ep $$0, xp $$1, @Nullable bsv $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         yd $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xp $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ym a(@Nullable ep $$0, ym $$1, @Nullable bsv $$2, int $$3) throws CommandSyntaxException {
      xv $$4 = $$1.i();
      if ($$4 != null) {
         xp $$5 = $$4.a(xv.a.a);
         if ($$5 != null) {
            xv $$6 = new xv(xv.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xp a(Collection<String> $$0) {
      return a($$0, $$0x -> xp.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xp a(Collection<T> $$0, Function<T, xp> $$1) {
      if ($$0.isEmpty()) {
         return xo.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xp b(Collection<? extends T> $$0, Function<T, xp> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> yd a(Collection<? extends T> $$0, Optional<? extends xp> $$1, Function<T, xp> $$2) {
      return a($$0, (xp)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xp a(Collection<? extends xp> $$0, xp $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> yd a(Collection<? extends T> $$0, xp $$1, Function<T, xp> $$2) {
      if ($$0.isEmpty()) {
         return xp.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         yd $$3 = xp.i();
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

   public static yd a(xp $$0) {
      return xp.a("chat.square_brackets", $$0);
   }

   public static xp a(Message $$0) {
      return (xp)($$0 instanceof xp ? (xp)$$0 : xp.b($$0.getString()));
   }

   public static boolean b(@Nullable xp $$0) {
      if ($$0 != null && $$0.b() instanceof za $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || un.a().b($$2);
      } else {
         return true;
      }
   }

   public static yd a(String $$0) {
      return a((xp)xp.b($$0).a($$1 -> $$1.a(n.k).a(new xn(xn.a.f, $$0)).a(new xv(xv.a.a, xp.c("chat.copy.click"))).a($$0)));
   }
}
