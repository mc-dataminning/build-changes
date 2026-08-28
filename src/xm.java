import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xm {
   public static final String a = ", ";
   public static final xj b = xj.b(", ").a(n.h);
   public static final xj c = xj.b(", ");

   public static xx a(xx $$0, yg $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         yg $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xx> a(@Nullable ew $$0, Optional<xj> $$1, @Nullable bul $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xx a(@Nullable ew $$0, xj $$1, @Nullable bul $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xx $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xj $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static yg a(@Nullable ew $$0, yg $$1, @Nullable bul $$2, int $$3) throws CommandSyntaxException {
      xp $$4 = $$1.i();
      if ($$4 != null) {
         xj $$5 = $$4.a(xp.a.a);
         if ($$5 != null) {
            xp $$6 = new xp(xp.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xj a(Collection<String> $$0) {
      return a($$0, $$0x -> xj.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xj a(Collection<T> $$0, Function<T, xj> $$1) {
      if ($$0.isEmpty()) {
         return xi.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xj b(Collection<? extends T> $$0, Function<T, xj> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xx a(Collection<? extends T> $$0, Optional<? extends xj> $$1, Function<T, xj> $$2) {
      return a($$0, (xj)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xj a(Collection<? extends xj> $$0, xj $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xx a(Collection<? extends T> $$0, xj $$1, Function<T, xj> $$2) {
      if ($$0.isEmpty()) {
         return xj.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xx $$3 = xj.i();
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

   public static xx a(xj $$0) {
      return xj.a("chat.square_brackets", $$0);
   }

   public static xj a(Message $$0) {
      return (xj)($$0 instanceof xj ? (xj)$$0 : xj.b($$0.getString()));
   }

   public static boolean b(@Nullable xj $$0) {
      if ($$0 != null && $$0.b() instanceof yu $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ug.a().b($$2);
      } else {
         return true;
      }
   }

   public static xx a(String $$0) {
      return a((xj)xj.b($$0).a($$1 -> $$1.a(n.k).a(new xh(xh.a.f, $$0)).a(new xp(xp.a.a, xj.c("chat.copy.click"))).a($$0)));
   }
}
