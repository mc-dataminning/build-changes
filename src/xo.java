import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xo {
   public static final String a = ", ";
   public static final xl b = xl.b(", ").a(n.h);
   public static final xl c = xl.b(", ");

   public static xz a(xz $$0, yi $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         yi $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xz> a(@Nullable ep $$0, Optional<xl> $$1, @Nullable bsp $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xz a(@Nullable ep $$0, xl $$1, @Nullable bsp $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xz $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xl $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static yi a(@Nullable ep $$0, yi $$1, @Nullable bsp $$2, int $$3) throws CommandSyntaxException {
      xr $$4 = $$1.i();
      if ($$4 != null) {
         xl $$5 = $$4.a(xr.a.a);
         if ($$5 != null) {
            xr $$6 = new xr(xr.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xl a(Collection<String> $$0) {
      return a($$0, $$0x -> xl.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xl a(Collection<T> $$0, Function<T, xl> $$1) {
      if ($$0.isEmpty()) {
         return xk.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xl b(Collection<? extends T> $$0, Function<T, xl> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xz a(Collection<? extends T> $$0, Optional<? extends xl> $$1, Function<T, xl> $$2) {
      return a($$0, (xl)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xl a(Collection<? extends xl> $$0, xl $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xz a(Collection<? extends T> $$0, xl $$1, Function<T, xl> $$2) {
      if ($$0.isEmpty()) {
         return xl.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xz $$3 = xl.i();
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

   public static xz a(xl $$0) {
      return xl.a("chat.square_brackets", $$0);
   }

   public static xl a(Message $$0) {
      return (xl)($$0 instanceof xl ? (xl)$$0 : xl.b($$0.getString()));
   }

   public static boolean b(@Nullable xl $$0) {
      if ($$0 != null && $$0.b() instanceof yw $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || um.a().b($$2);
      } else {
         return true;
      }
   }

   public static xz a(String $$0) {
      return a((xl)xl.b($$0).a($$1 -> $$1.a(n.k).a(new xj(xj.a.f, $$0)).a(new xr(xr.a.a, xl.c("chat.copy.click"))).a($$0)));
   }
}
