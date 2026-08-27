import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xh {
   public static final String a = ", ";
   public static final xe b = xe.b(", ").a(n.h);
   public static final xe c = xe.b(", ");

   public static xs a(xs $$0, yb $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         yb $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xs> a(@Nullable eh $$0, Optional<xe> $$1, @Nullable brv $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xs a(@Nullable eh $$0, xe $$1, @Nullable brv $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xs $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (xe $$5 : $$1.c()) {
            $$4.a(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static yb a(@Nullable eh $$0, yb $$1, @Nullable brv $$2, int $$3) throws CommandSyntaxException {
      xk $$4 = $$1.i();
      if ($$4 != null) {
         xe $$5 = $$4.a(xk.a.a);
         if ($$5 != null) {
            xk $$6 = new xk(xk.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static xe a(Collection<String> $$0) {
      return a($$0, $$0x -> xe.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> xe a(Collection<T> $$0, Function<T, xe> $$1) {
      if ($$0.isEmpty()) {
         return xd.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> xe b(Collection<? extends T> $$0, Function<T, xe> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xs a(Collection<? extends T> $$0, Optional<? extends xe> $$1, Function<T, xe> $$2) {
      return a($$0, (xe)DataFixUtils.orElse($$1, b), $$2);
   }

   public static xe a(Collection<? extends xe> $$0, xe $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xs a(Collection<? extends T> $$0, xe $$1, Function<T, xe> $$2) {
      if ($$0.isEmpty()) {
         return xe.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xs $$3 = xe.i();
         boolean $$4 = true;

         for (T $$5 : $$0) {
            if (!$$4) {
               $$3.a($$1);
            }

            $$3.a($$2.apply($$5));
            $$4 = false;
         }

         return $$3;
      }
   }

   public static xs a(xe $$0) {
      return xe.a("chat.square_brackets", $$0);
   }

   public static xe a(Message $$0) {
      return (xe)($$0 instanceof xe ? (xe)$$0 : xe.b($$0.getString()));
   }

   public static boolean b(@Nullable xe $$0) {
      if ($$0 != null && $$0.b() instanceof yp $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || uf.a().b($$2);
      } else {
         return true;
      }
   }

   public static xs a(String $$0) {
      return a((xe)xe.b($$0).a($$1 -> $$1.a(n.k).a(new xc(xc.a.f, $$0)).a(new xk(xk.a.a, xe.c("chat.copy.click"))).a($$0)));
   }
}
