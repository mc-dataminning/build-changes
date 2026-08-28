import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xl {
   public static final String a = ", ";
   public static final xi b = xi.b(", ").a(n.h);
   public static final xi c = xi.b(", ");

   public static xw a(xw $$0, yf $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         yf $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xw> a(@Nullable ew $$0, Optional<xi> $$1, @Nullable bue $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xw a(@Nullable ew $$0, xi $$1, @Nullable bue $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xw $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xi $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static yf a(@Nullable ew $$0, yf $$1, @Nullable bue $$2, int $$3) throws CommandSyntaxException {
      xo $$4 = $$1.i();
      if ($$4 != null) {
         xi $$5 = $$4.a(xo.a.a);
         if ($$5 != null) {
            xo $$6 = new xo(xo.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xi a(Collection<String> $$0) {
      return a($$0, $$0x -> xi.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xi a(Collection<T> $$0, Function<T, xi> $$1) {
      if ($$0.isEmpty()) {
         return xh.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xi b(Collection<? extends T> $$0, Function<T, xi> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xw a(Collection<? extends T> $$0, Optional<? extends xi> $$1, Function<T, xi> $$2) {
      return a($$0, (xi)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xi a(Collection<? extends xi> $$0, xi $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xw a(Collection<? extends T> $$0, xi $$1, Function<T, xi> $$2) {
      if ($$0.isEmpty()) {
         return xi.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xw $$3 = xi.i();
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

   public static xw a(xi $$0) {
      return xi.a("chat.square_brackets", $$0);
   }

   public static xi a(Message $$0) {
      return (xi)($$0 instanceof xi ? (xi)$$0 : xi.b($$0.getString()));
   }

   public static boolean b(@Nullable xi $$0) {
      if ($$0 != null && $$0.b() instanceof yt $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || uf.a().b($$2);
      } else {
         return true;
      }
   }

   public static xw a(String $$0) {
      return a((xi)xi.b($$0).a($$1 -> $$1.a(n.k).a(new xg(xg.a.f, $$0)).a(new xo(xo.a.a, xi.c("chat.copy.click"))).a($$0)));
   }
}
