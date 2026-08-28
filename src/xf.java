import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xf {
   public static final String a = ", ";
   public static final xc b = xc.b(", ").a(o.h);
   public static final xc c = xc.b(", ");

   public static xq a(xq $$0, xz $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         xz $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xq> a(@Nullable ek $$0, Optional<xc> $$1, @Nullable bwv $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xq a(@Nullable ek $$0, xc $$1, @Nullable bwv $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xq $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xc $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xz a(@Nullable ek $$0, xz $$1, @Nullable bwv $$2, int $$3) throws CommandSyntaxException {
      if ($$1.j() instanceof xi.e var5) {
         xi.e var10000 = var5;

         try {
            var10 = var10000.b();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         xi $$6 = var10;
         $$6 = new xi.e(a($$0, $$6, $$2, $$3 + 1));
         return $$1.a($$6);
      } else {
         return $$1;
      }
   }

   public static xc a(Collection<String> $$0) {
      return a($$0, $$0x -> xc.b($$0x).a(o.k));
   }

   public static <T extends Comparable<T>> xc a(Collection<T> $$0, Function<T, xc> $$1) {
      if ($$0.isEmpty()) {
         return xb.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xc b(Collection<? extends T> $$0, Function<T, xc> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xq a(Collection<? extends T> $$0, Optional<? extends xc> $$1, Function<T, xc> $$2) {
      return a($$0, (xc)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xc a(Collection<? extends xc> $$0, xc $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xq a(Collection<? extends T> $$0, xc $$1, Function<T, xc> $$2) {
      if ($$0.isEmpty()) {
         return xc.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xq $$3 = xc.i();
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

   public static xq a(xc $$0) {
      return xc.a("chat.square_brackets", $$0);
   }

   public static xc a(Message $$0) {
      return (xc)($$0 instanceof xc ? (xc)$$0 : xc.b($$0.getString()));
   }

   public static boolean b(@Nullable xc $$0) {
      if ($$0 != null && $$0.b() instanceof yn $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tv.a().b($$2);
      } else {
         return true;
      }
   }

   public static xq a(String $$0) {
      return a((xc)xc.b($$0).a($$1 -> $$1.a(o.k).a(new xa.c($$0)).a(new xi.e(xc.c("chat.copy.click"))).a($$0)));
   }
}
