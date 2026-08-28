import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xn {
   public static final String a = ", ";
   public static final xk b = xk.b(", ").a(n.h);
   public static final xk c = xk.b(", ");

   public static xy a(xy $$0, yh $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         yh $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xy> a(@Nullable ew $$0, Optional<xk> $$1, @Nullable bvb $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xy a(@Nullable ew $$0, xk $$1, @Nullable bvb $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xy $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xk $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static yh a(@Nullable ew $$0, yh $$1, @Nullable bvb $$2, int $$3) throws CommandSyntaxException {
      xq $$4 = $$1.j();
      if ($$4 != null) {
         xk $$5 = $$4.a(xq.a.a);
         if ($$5 != null) {
            xq $$6 = new xq(xq.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xk a(Collection<String> $$0) {
      return a($$0, $$0x -> xk.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xk a(Collection<T> $$0, Function<T, xk> $$1) {
      if ($$0.isEmpty()) {
         return xj.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xk b(Collection<? extends T> $$0, Function<T, xk> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xy a(Collection<? extends T> $$0, Optional<? extends xk> $$1, Function<T, xk> $$2) {
      return a($$0, (xk)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xk a(Collection<? extends xk> $$0, xk $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xy a(Collection<? extends T> $$0, xk $$1, Function<T, xk> $$2) {
      if ($$0.isEmpty()) {
         return xk.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xy $$3 = xk.i();
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

   public static xy a(xk $$0) {
      return xk.a("chat.square_brackets", $$0);
   }

   public static xk a(Message $$0) {
      return (xk)($$0 instanceof xk ? (xk)$$0 : xk.b($$0.getString()));
   }

   public static boolean b(@Nullable xk $$0) {
      if ($$0 != null && $$0.b() instanceof yv $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || uh.a().b($$2);
      } else {
         return true;
      }
   }

   public static xy a(String $$0) {
      return a((xk)xk.b($$0).a($$1 -> $$1.a(n.k).a(new xi(xi.a.f, $$0)).a(new xq(xq.a.a, xk.c("chat.copy.click"))).a($$0)));
   }
}
