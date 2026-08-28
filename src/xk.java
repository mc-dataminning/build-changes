import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xk {
   public static final String a = ", ";
   public static final xh b = xh.b(", ").a(n.h);
   public static final xh c = xh.b(", ");

   public static xv a(xv $$0, ye $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ye $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xv> a(@Nullable ev $$0, Optional<xh> $$1, @Nullable btz $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xv a(@Nullable ev $$0, xh $$1, @Nullable btz $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xv $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xh $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ye a(@Nullable ev $$0, ye $$1, @Nullable btz $$2, int $$3) throws CommandSyntaxException {
      xn $$4 = $$1.i();
      if ($$4 != null) {
         xh $$5 = $$4.a(xn.a.a);
         if ($$5 != null) {
            xn $$6 = new xn(xn.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xh a(Collection<String> $$0) {
      return a($$0, $$0x -> xh.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xh a(Collection<T> $$0, Function<T, xh> $$1) {
      if ($$0.isEmpty()) {
         return xg.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xh b(Collection<? extends T> $$0, Function<T, xh> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xv a(Collection<? extends T> $$0, Optional<? extends xh> $$1, Function<T, xh> $$2) {
      return a($$0, (xh)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xh a(Collection<? extends xh> $$0, xh $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xv a(Collection<? extends T> $$0, xh $$1, Function<T, xh> $$2) {
      if ($$0.isEmpty()) {
         return xh.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xv $$3 = xh.i();
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

   public static xv a(xh $$0) {
      return xh.a("chat.square_brackets", $$0);
   }

   public static xh a(Message $$0) {
      return (xh)($$0 instanceof xh ? (xh)$$0 : xh.b($$0.getString()));
   }

   public static boolean b(@Nullable xh $$0) {
      if ($$0 != null && $$0.b() instanceof ys $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ue.a().b($$2);
      } else {
         return true;
      }
   }

   public static xv a(String $$0) {
      return a((xh)xh.b($$0).a($$1 -> $$1.a(n.k).a(new xf(xf.a.f, $$0)).a(new xn(xn.a.a, xh.c("chat.copy.click"))).a($$0)));
   }
}
