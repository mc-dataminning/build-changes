import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xr {
   public static final String a = ", ";
   public static final xo b = xo.b(", ").a(n.h);
   public static final xo c = xo.b(", ");

   public static yc a(yc $$0, yl $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         yl $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<yc> a(@Nullable ep $$0, Optional<xo> $$1, @Nullable bst $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static yc a(@Nullable ep $$0, xo $$1, @Nullable bst $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         yc $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xo $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static yl a(@Nullable ep $$0, yl $$1, @Nullable bst $$2, int $$3) throws CommandSyntaxException {
      xu $$4 = $$1.i();
      if ($$4 != null) {
         xo $$5 = $$4.a(xu.a.a);
         if ($$5 != null) {
            xu $$6 = new xu(xu.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xo a(Collection<String> $$0) {
      return a($$0, $$0x -> xo.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xo a(Collection<T> $$0, Function<T, xo> $$1) {
      if ($$0.isEmpty()) {
         return xn.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xo b(Collection<? extends T> $$0, Function<T, xo> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> yc a(Collection<? extends T> $$0, Optional<? extends xo> $$1, Function<T, xo> $$2) {
      return a($$0, (xo)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xo a(Collection<? extends xo> $$0, xo $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> yc a(Collection<? extends T> $$0, xo $$1, Function<T, xo> $$2) {
      if ($$0.isEmpty()) {
         return xo.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         yc $$3 = xo.i();
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

   public static yc a(xo $$0) {
      return xo.a("chat.square_brackets", $$0);
   }

   public static xo a(Message $$0) {
      return (xo)($$0 instanceof xo ? (xo)$$0 : xo.b($$0.getString()));
   }

   public static boolean b(@Nullable xo $$0) {
      if ($$0 != null && $$0.b() instanceof yz $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || um.a().b($$2);
      } else {
         return true;
      }
   }

   public static yc a(String $$0) {
      return a((xo)xo.b($$0).a($$1 -> $$1.a(n.k).a(new xm(xm.a.f, $$0)).a(new xu(xu.a.a, xo.c("chat.copy.click"))).a($$0)));
   }
}
