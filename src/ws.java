import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ws {
   public static final String a = ", ";
   public static final wp b = wp.b(", ").a(n.h);
   public static final wp c = wp.b(", ");

   public static xd a(xd $$0, xm $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         xm $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xd> a(@Nullable ex $$0, Optional<wp> $$1, @Nullable bva $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xd a(@Nullable ex $$0, wp $$1, @Nullable bva $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xd $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wp $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xm a(@Nullable ex $$0, xm $$1, @Nullable bva $$2, int $$3) throws CommandSyntaxException {
      if ($$1.j() instanceof wv.e var5) {
         wv.e var10000 = var5;

         try {
            var10 = var10000.b();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         wv $$6 = var10;
         $$6 = new wv.e(a($$0, $$6, $$2, $$3 + 1));
         return $$1.a($$6);
      } else {
         return $$1;
      }
   }

   public static wp a(Collection<String> $$0) {
      return a($$0, $$0x -> wp.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wp a(Collection<T> $$0, Function<T, wp> $$1) {
      if ($$0.isEmpty()) {
         return wo.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wp b(Collection<? extends T> $$0, Function<T, wp> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xd a(Collection<? extends T> $$0, Optional<? extends wp> $$1, Function<T, wp> $$2) {
      return a($$0, (wp)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wp a(Collection<? extends wp> $$0, wp $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xd a(Collection<? extends T> $$0, wp $$1, Function<T, wp> $$2) {
      if ($$0.isEmpty()) {
         return wp.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xd $$3 = wp.i();
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

   public static xd a(wp $$0) {
      return wp.a("chat.square_brackets", $$0);
   }

   public static wp a(Message $$0) {
      return (wp)($$0 instanceof wp ? (wp)$$0 : wp.b($$0.getString()));
   }

   public static boolean b(@Nullable wp $$0) {
      if ($$0 != null && $$0.b() instanceof ya $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tl.a().b($$2);
      } else {
         return true;
      }
   }

   public static xd a(String $$0) {
      return a((wp)wp.b($$0).a($$1 -> $$1.a(n.k).a(new wn.c($$0)).a(new wv.e(wp.c("chat.copy.click"))).a($$0)));
   }
}
