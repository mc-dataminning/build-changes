import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class wx {
   public static final String a = ", ";
   public static final wu b = wu.b(", ").a(n.h);
   public static final wu c = wu.b(", ");

   public static xi a(xi $$0, xr $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         xr $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xi> a(@Nullable eq $$0, Optional<wu> $$1, @Nullable bsg $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xi a(@Nullable eq $$0, wu $$1, @Nullable bsg $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xi $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wu $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xr a(@Nullable eq $$0, xr $$1, @Nullable bsg $$2, int $$3) throws CommandSyntaxException {
      xa $$4 = $$1.i();
      if ($$4 != null) {
         wu $$5 = $$4.a(xa.a.a);
         if ($$5 != null) {
            xa $$6 = new xa(xa.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static wu a(Collection<String> $$0) {
      return a($$0, $$0x -> wu.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wu a(Collection<T> $$0, Function<T, wu> $$1) {
      if ($$0.isEmpty()) {
         return wt.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wu b(Collection<? extends T> $$0, Function<T, wu> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xi a(Collection<? extends T> $$0, Optional<? extends wu> $$1, Function<T, wu> $$2) {
      return a($$0, (wu)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wu a(Collection<? extends wu> $$0, wu $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xi a(Collection<? extends T> $$0, wu $$1, Function<T, wu> $$2) {
      if ($$0.isEmpty()) {
         return wu.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xi $$3 = wu.i();
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

   public static xi a(wu $$0) {
      return wu.a("chat.square_brackets", $$0);
   }

   public static wu a(Message $$0) {
      return (wu)($$0 instanceof wu ? (wu)$$0 : wu.b($$0.getString()));
   }

   public static boolean b(@Nullable wu $$0) {
      if ($$0 != null && $$0.b() instanceof yf $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ts.a().b($$2);
      } else {
         return true;
      }
   }

   public static xi a(String $$0) {
      return a((wu)wu.b($$0).a($$1 -> $$1.a(n.k).a(new ws(ws.a.f, $$0)).a(new xa(xa.a.a, wu.c("chat.copy.click"))).a($$0)));
   }
}
