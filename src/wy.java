import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class wy {
   public static final String a = ", ";
   public static final wv b = wv.b(", ").a(n.h);
   public static final wv c = wv.b(", ");

   public static xj a(xj $$0, xs $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         xs $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xj> a(@Nullable ex $$0, Optional<wv> $$1, @Nullable bvs $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xj a(@Nullable ex $$0, wv $$1, @Nullable bvs $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xj $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wv $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xs a(@Nullable ex $$0, xs $$1, @Nullable bvs $$2, int $$3) throws CommandSyntaxException {
      if ($$1.j() instanceof xb.e var5) {
         xb.e var10000 = var5;

         try {
            var10 = var10000.b();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         xb $$6 = var10;
         $$6 = new xb.e(a($$0, $$6, $$2, $$3 + 1));
         return $$1.a($$6);
      } else {
         return $$1;
      }
   }

   public static wv a(Collection<String> $$0) {
      return a($$0, $$0x -> wv.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wv a(Collection<T> $$0, Function<T, wv> $$1) {
      if ($$0.isEmpty()) {
         return wu.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wv b(Collection<? extends T> $$0, Function<T, wv> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xj a(Collection<? extends T> $$0, Optional<? extends wv> $$1, Function<T, wv> $$2) {
      return a($$0, (wv)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wv a(Collection<? extends wv> $$0, wv $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xj a(Collection<? extends T> $$0, wv $$1, Function<T, wv> $$2) {
      if ($$0.isEmpty()) {
         return wv.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xj $$3 = wv.i();
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

   public static xj a(wv $$0) {
      return wv.a("chat.square_brackets", $$0);
   }

   public static wv a(Message $$0) {
      return (wv)($$0 instanceof wv ? (wv)$$0 : wv.b($$0.getString()));
   }

   public static boolean b(@Nullable wv $$0) {
      if ($$0 != null && $$0.b() instanceof yg $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tr.a().b($$2);
      } else {
         return true;
      }
   }

   public static xj a(String $$0) {
      return a((wv)wv.b($$0).a($$1 -> $$1.a(n.k).a(new wt.c($$0)).a(new xb.e(wv.c("chat.copy.click"))).a($$0)));
   }
}
