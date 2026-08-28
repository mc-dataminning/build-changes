import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xy {
   public static final String a = ", ";
   public static final xv b = xv.b(", ").a(n.h);
   public static final xv c = xv.b(", ");

   public static yj a(yj $$0, ys $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ys $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<yj> a(@Nullable ew $$0, Optional<xv> $$1, @Nullable bvj $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static yj a(@Nullable ew $$0, xv $$1, @Nullable bvj $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         yj $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xv $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ys a(@Nullable ew $$0, ys $$1, @Nullable bvj $$2, int $$3) throws CommandSyntaxException {
      yb $$4 = $$1.i();
      if ($$4 != null) {
         xv $$5 = $$4.a(yb.a.a);
         if ($$5 != null) {
            yb $$6 = new yb(yb.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xv a(Collection<String> $$0) {
      return a($$0, $$0x -> xv.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xv a(Collection<T> $$0, Function<T, xv> $$1) {
      if ($$0.isEmpty()) {
         return xu.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xv b(Collection<? extends T> $$0, Function<T, xv> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> yj a(Collection<? extends T> $$0, Optional<? extends xv> $$1, Function<T, xv> $$2) {
      return a($$0, (xv)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xv a(Collection<? extends xv> $$0, xv $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> yj a(Collection<? extends T> $$0, xv $$1, Function<T, xv> $$2) {
      if ($$0.isEmpty()) {
         return xv.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         yj $$3 = xv.i();
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

   public static yj a(xv $$0) {
      return xv.a("chat.square_brackets", $$0);
   }

   public static xv a(Message $$0) {
      return (xv)($$0 instanceof xv ? (xv)$$0 : xv.b($$0.getString()));
   }

   public static boolean b(@Nullable xv $$0) {
      if ($$0 != null && $$0.b() instanceof zg $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || us.a().b($$2);
      } else {
         return true;
      }
   }

   public static yj a(String $$0) {
      return a((xv)xv.b($$0).a($$1 -> $$1.a(n.k).a(new xt(xt.a.f, $$0)).a(new yb(yb.a.a, xv.c("chat.copy.click"))).a($$0)));
   }
}
