import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xj {
   public static final String a = ", ";
   public static final xg b = xg.b(", ").a(o.h);
   public static final xg c = xg.b(", ");

   public static xu a(xu $$0, yd $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         yd $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xu> a(@Nullable ek $$0, Optional<xg> $$1, @Nullable bxe $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xu a(@Nullable ek $$0, xg $$1, @Nullable bxe $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xu $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xg $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static yd a(@Nullable ek $$0, yd $$1, @Nullable bxe $$2, int $$3) throws CommandSyntaxException {
      if ($$1.j() instanceof xm.e var5) {
         xm.e var10000 = var5;

         try {
            var10 = var10000.b();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         xm $$6 = var10;
         $$6 = new xm.e(a($$0, $$6, $$2, $$3 + 1));
         return $$1.a($$6);
      } else {
         return $$1;
      }
   }

   public static xg a(Collection<String> $$0) {
      return a($$0, $$0x -> xg.b($$0x).a(o.k));
   }

   public static <T extends Comparable<T>> xg a(Collection<T> $$0, Function<T, xg> $$1) {
      if ($$0.isEmpty()) {
         return xf.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xg b(Collection<? extends T> $$0, Function<T, xg> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xu a(Collection<? extends T> $$0, Optional<? extends xg> $$1, Function<T, xg> $$2) {
      return a($$0, (xg)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xg a(Collection<? extends xg> $$0, xg $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xu a(Collection<? extends T> $$0, xg $$1, Function<T, xg> $$2) {
      if ($$0.isEmpty()) {
         return xg.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xu $$3 = xg.i();
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

   public static xu a(xg $$0) {
      return xg.a("chat.square_brackets", $$0);
   }

   public static xg a(Message $$0) {
      return (xg)($$0 instanceof xg ? (xg)$$0 : xg.b($$0.getString()));
   }

   public static boolean b(@Nullable xg $$0) {
      if ($$0 != null && $$0.b() instanceof yr $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tv.a().b($$2);
      } else {
         return true;
      }
   }

   public static xu a(String $$0) {
      return a((xg)xg.b($$0).a($$1 -> $$1.a(o.k).a(new xe.c($$0)).a(new xm.e(xg.c("chat.copy.click"))).a($$0)));
   }
}
