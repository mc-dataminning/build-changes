import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xd {
   public static final String a = ", ";
   public static final xa b = xa.b(", ").a(o.h);
   public static final xa c = xa.b(", ");

   public static xo a(xo $$0, xx $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         xx $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xo> a(@Nullable ej $$0, Optional<xa> $$1, @Nullable bwt $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xo a(@Nullable ej $$0, xa $$1, @Nullable bwt $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xo $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xa $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xx a(@Nullable ej $$0, xx $$1, @Nullable bwt $$2, int $$3) throws CommandSyntaxException {
      if ($$1.j() instanceof xg.e var5) {
         xg.e var10000 = var5;

         try {
            var10 = var10000.b();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         xg $$6 = var10;
         $$6 = new xg.e(a($$0, $$6, $$2, $$3 + 1));
         return $$1.a($$6);
      } else {
         return $$1;
      }
   }

   public static xa a(Collection<String> $$0) {
      return a($$0, $$0x -> xa.b($$0x).a(o.k));
   }

   public static <T extends Comparable<T>> xa a(Collection<T> $$0, Function<T, xa> $$1) {
      if ($$0.isEmpty()) {
         return wz.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xa b(Collection<? extends T> $$0, Function<T, xa> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xo a(Collection<? extends T> $$0, Optional<? extends xa> $$1, Function<T, xa> $$2) {
      return a($$0, (xa)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xa a(Collection<? extends xa> $$0, xa $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xo a(Collection<? extends T> $$0, xa $$1, Function<T, xa> $$2) {
      if ($$0.isEmpty()) {
         return xa.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xo $$3 = xa.i();
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

   public static xo a(xa $$0) {
      return xa.a("chat.square_brackets", $$0);
   }

   public static xa a(Message $$0) {
      return (xa)($$0 instanceof xa ? (xa)$$0 : xa.b($$0.getString()));
   }

   public static boolean b(@Nullable xa $$0) {
      if ($$0 != null && $$0.b() instanceof yl $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tu.a().b($$2);
      } else {
         return true;
      }
   }

   public static xo a(String $$0) {
      return a((xa)xa.b($$0).a($$1 -> $$1.a(o.k).a(new wy.c($$0)).a(new xg.e(xa.c("chat.copy.click"))).a($$0)));
   }
}
