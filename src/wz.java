import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class wz {
   public static final String a = ", ";
   public static final ww b = ww.b(", ").a(n.h);
   public static final ww c = ww.b(", ");

   public static xk a(xk $$0, xt $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         xt $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xk> a(@Nullable ei $$0, Optional<ww> $$1, @Nullable bwa $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xk a(@Nullable ei $$0, ww $$1, @Nullable bwa $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xk $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (ww $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xt a(@Nullable ei $$0, xt $$1, @Nullable bwa $$2, int $$3) throws CommandSyntaxException {
      if ($$1.j() instanceof xc.e var5) {
         xc.e var10000 = var5;

         try {
            var10 = var10000.b();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         xc $$6 = var10;
         $$6 = new xc.e(a($$0, $$6, $$2, $$3 + 1));
         return $$1.a($$6);
      } else {
         return $$1;
      }
   }

   public static ww a(Collection<String> $$0) {
      return a($$0, $$0x -> ww.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> ww a(Collection<T> $$0, Function<T, ww> $$1) {
      if ($$0.isEmpty()) {
         return wv.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> ww b(Collection<? extends T> $$0, Function<T, ww> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xk a(Collection<? extends T> $$0, Optional<? extends ww> $$1, Function<T, ww> $$2) {
      return a($$0, (ww)DataFixUtils.orElse($$1, b), $$2);
   }

   public static ww a(Collection<? extends ww> $$0, ww $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xk a(Collection<? extends T> $$0, ww $$1, Function<T, ww> $$2) {
      if ($$0.isEmpty()) {
         return ww.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xk $$3 = ww.i();
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

   public static xk a(ww $$0) {
      return ww.a("chat.square_brackets", $$0);
   }

   public static ww a(Message $$0) {
      return (ww)($$0 instanceof ww ? (ww)$$0 : ww.b($$0.getString()));
   }

   public static boolean b(@Nullable ww $$0) {
      if ($$0 != null && $$0.b() instanceof yh $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ts.a().b($$2);
      } else {
         return true;
      }
   }

   public static xk a(String $$0) {
      return a((ww)ww.b($$0).a($$1 -> $$1.a(n.k).a(new wu.c($$0)).a(new xc.e(ww.c("chat.copy.click"))).a($$0)));
   }
}
