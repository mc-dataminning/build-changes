import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xc {
   public static final String a = ", ";
   public static final wz b = wz.b(", ").a(n.h);
   public static final wz c = wz.b(", ");

   public static xn a(xn $$0, xw $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         xw $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xn> a(@Nullable et $$0, Optional<wz> $$1, @Nullable bsr $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xn a(@Nullable et $$0, wz $$1, @Nullable bsr $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xn $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wz $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xw a(@Nullable et $$0, xw $$1, @Nullable bsr $$2, int $$3) throws CommandSyntaxException {
      xf $$4 = $$1.i();
      if ($$4 != null) {
         wz $$5 = $$4.a(xf.a.a);
         if ($$5 != null) {
            xf $$6 = new xf(xf.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static wz a(Collection<String> $$0) {
      return a($$0, $$0x -> wz.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wz a(Collection<T> $$0, Function<T, wz> $$1) {
      if ($$0.isEmpty()) {
         return wy.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wz b(Collection<? extends T> $$0, Function<T, wz> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xn a(Collection<? extends T> $$0, Optional<? extends wz> $$1, Function<T, wz> $$2) {
      return a($$0, (wz)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wz a(Collection<? extends wz> $$0, wz $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xn a(Collection<? extends T> $$0, wz $$1, Function<T, wz> $$2) {
      if ($$0.isEmpty()) {
         return wz.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xn $$3 = wz.i();
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

   public static xn a(wz $$0) {
      return wz.a("chat.square_brackets", $$0);
   }

   public static wz a(Message $$0) {
      return (wz)($$0 instanceof wz ? (wz)$$0 : wz.b($$0.getString()));
   }

   public static boolean b(@Nullable wz $$0) {
      if ($$0 != null && $$0.b() instanceof yk $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tw.a().b($$2);
      } else {
         return true;
      }
   }

   public static xn a(String $$0) {
      return a((wz)wz.b($$0).a($$1 -> $$1.a(n.k).a(new wx(wx.a.f, $$0)).a(new xf(xf.a.a, wz.c("chat.copy.click"))).a($$0)));
   }
}
