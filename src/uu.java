import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class uu {
   public static final String a = ", ";
   public static final ur b = ur.b(", ").a(n.h);
   public static final ur c = ur.b(", ");

   public static vf a(vf $$0, vo $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         vo $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<vf> a(@Nullable du $$0, Optional<ur> $$1, @Nullable bkq $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static vf a(@Nullable du $$0, ur $$1, @Nullable bkq $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         vf $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (ur $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static vo a(@Nullable du $$0, vo $$1, @Nullable bkq $$2, int $$3) throws CommandSyntaxException {
      ux $$4 = $$1.i();
      if ($$4 != null) {
         ur $$5 = $$4.a(ux.a.a);
         if ($$5 != null) {
            ux $$6 = new ux(ux.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static ur a(Collection<String> $$0) {
      return a($$0, $$0x -> ur.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> ur a(Collection<T> $$0, Function<T, ur> $$1) {
      if ($$0.isEmpty()) {
         return uq.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> ur b(Collection<? extends T> $$0, Function<T, ur> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> vf a(Collection<? extends T> $$0, Optional<? extends ur> $$1, Function<T, ur> $$2) {
      return a($$0, (ur)DataFixUtils.orElse($$1, b), $$2);
   }

   public static ur a(Collection<? extends ur> $$0, ur $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> vf a(Collection<? extends T> $$0, ur $$1, Function<T, ur> $$2) {
      if ($$0.isEmpty()) {
         return ur.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         vf $$3 = ur.i();
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

   public static vf a(ur $$0) {
      return ur.a("chat.square_brackets", $$0);
   }

   public static ur a(Message $$0) {
      return (ur)($$0 instanceof ur ? (ur)$$0 : ur.b($$0.getString()));
   }

   public static boolean b(@Nullable ur $$0) {
      if ($$0 != null && $$0.b() instanceof wc $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ru.a().b($$2);
      } else {
         return true;
      }
   }

   public static vf a(String $$0) {
      return a((ur)ur.b($$0).a($$1 -> $$1.a(n.k).a(new up(up.a.f, $$0)).a(new ux(ux.a.a, ur.c("chat.copy.click"))).a($$0)));
   }
}
