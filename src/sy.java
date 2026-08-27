import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class sy {
   public static final String a = ", ";
   public static final sw b = sw.b(", ").a(n.h);
   public static final sw c = sw.b(", ");

   public static tj a(tj $$0, ts $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ts $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<tj> a(@Nullable ds $$0, Optional<sw> $$1, @Nullable bfj $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static tj a(@Nullable ds $$0, sw $$1, @Nullable bfj $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         tj $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (sw $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ts a(@Nullable ds $$0, ts $$1, @Nullable bfj $$2, int $$3) throws CommandSyntaxException {
      tb $$4 = $$1.i();
      if ($$4 != null) {
         sw $$5 = $$4.a(tb.a.a);
         if ($$5 != null) {
            tb $$6 = new tb(tb.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static sw a(GameProfile $$0) {
      if ($$0.getName() != null) {
         return sw.b($$0.getName());
      } else {
         return $$0.getId() != null ? sw.b($$0.getId().toString()) : sw.b("(unknown)");
      }
   }

   public static sw a(Collection<String> $$0) {
      return a($$0, $$0x -> sw.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> sw a(Collection<T> $$0, Function<T, sw> $$1) {
      if ($$0.isEmpty()) {
         return sv.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> sw b(Collection<? extends T> $$0, Function<T, sw> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> tj a(Collection<? extends T> $$0, Optional<? extends sw> $$1, Function<T, sw> $$2) {
      return a($$0, (sw)DataFixUtils.orElse($$1, b), $$2);
   }

   public static sw a(Collection<? extends sw> $$0, sw $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> tj a(Collection<? extends T> $$0, sw $$1, Function<T, sw> $$2) {
      if ($$0.isEmpty()) {
         return sw.h();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).e();
      } else {
         tj $$3 = sw.h();
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

   public static tj a(sw $$0) {
      return sw.a("chat.square_brackets", $$0);
   }

   public static sw a(Message $$0) {
      return (sw)($$0 instanceof sw ? (sw)$$0 : sw.b($$0.getString()));
   }

   public static boolean b(@Nullable sw $$0) {
      if ($$0 != null && $$0.b() instanceof ug $$1) {
         String $$2 = $$1.a();
         String $$3 = $$1.b();
         return $$3 != null || qm.a().b($$2);
      } else {
         return true;
      }
   }

   public static tj a(String $$0) {
      return a((sw)sw.b($$0).a($$1 -> $$1.a(n.k).a(new su(su.a.f, $$0)).a(new tb(tb.a.a, sw.c("chat.copy.click"))).a($$0)));
   }
}
