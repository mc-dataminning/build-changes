import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xg {
   public static final String a = ", ";
   public static final xd b = xd.b(", ").a(n.h);
   public static final xd c = xd.b(", ");

   public static xr a(xr $$0, ya $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ya $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xr> a(@Nullable et $$0, Optional<xd> $$1, @Nullable bto $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xr a(@Nullable et $$0, xd $$1, @Nullable bto $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xr $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xd $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ya a(@Nullable et $$0, ya $$1, @Nullable bto $$2, int $$3) throws CommandSyntaxException {
      xj $$4 = $$1.i();
      if ($$4 != null) {
         xd $$5 = $$4.a(xj.a.a);
         if ($$5 != null) {
            xj $$6 = new xj(xj.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xd a(Collection<String> $$0) {
      return a($$0, $$0x -> xd.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xd a(Collection<T> $$0, Function<T, xd> $$1) {
      if ($$0.isEmpty()) {
         return xc.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xd b(Collection<? extends T> $$0, Function<T, xd> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xr a(Collection<? extends T> $$0, Optional<? extends xd> $$1, Function<T, xd> $$2) {
      return a($$0, (xd)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xd a(Collection<? extends xd> $$0, xd $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xr a(Collection<? extends T> $$0, xd $$1, Function<T, xd> $$2) {
      if ($$0.isEmpty()) {
         return xd.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xr $$3 = xd.i();
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

   public static xr a(xd $$0) {
      return xd.a("chat.square_brackets", $$0);
   }

   public static xd a(Message $$0) {
      return (xd)($$0 instanceof xd ? (xd)$$0 : xd.b($$0.getString()));
   }

   public static boolean b(@Nullable xd $$0) {
      if ($$0 != null && $$0.b() instanceof yo $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ua.a().b($$2);
      } else {
         return true;
      }
   }

   public static xr a(String $$0) {
      return a((xd)xd.b($$0).a($$1 -> $$1.a(n.k).a(new xb(xb.a.f, $$0)).a(new xj(xj.a.a, xd.c("chat.copy.click"))).a($$0)));
   }
}
