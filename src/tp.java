import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class tp {
   public static final String a = ", ";
   public static final tn b = tn.b(", ").a(n.h);
   public static final tn c = tn.b(", ");

   public static ua a(ua $$0, uj $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         uj $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<ua> a(@Nullable dt $$0, Optional<tn> $$1, @Nullable bis $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static ua a(@Nullable dt $$0, tn $$1, @Nullable bis $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         ua $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (tn $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static uj a(@Nullable dt $$0, uj $$1, @Nullable bis $$2, int $$3) throws CommandSyntaxException {
      ts $$4 = $$1.i();
      if ($$4 != null) {
         tn $$5 = $$4.a(ts.a.a);
         if ($$5 != null) {
            ts $$6 = new ts(ts.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static tn a(Collection<String> $$0) {
      return a($$0, $$0x -> tn.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> tn a(Collection<T> $$0, Function<T, tn> $$1) {
      if ($$0.isEmpty()) {
         return tm.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> tn b(Collection<? extends T> $$0, Function<T, tn> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> ua a(Collection<? extends T> $$0, Optional<? extends tn> $$1, Function<T, tn> $$2) {
      return a($$0, (tn)DataFixUtils.orElse($$1, b), $$2);
   }

   public static tn a(Collection<? extends tn> $$0, tn $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> ua a(Collection<? extends T> $$0, tn $$1, Function<T, tn> $$2) {
      if ($$0.isEmpty()) {
         return tn.h();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).e();
      } else {
         ua $$3 = tn.h();
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

   public static ua a(tn $$0) {
      return tn.a("chat.square_brackets", $$0);
   }

   public static tn a(Message $$0) {
      return (tn)($$0 instanceof tn ? (tn)$$0 : tn.b($$0.getString()));
   }

   public static boolean b(@Nullable tn $$0) {
      if ($$0 != null && $$0.b() instanceof ux $$1) {
         String $$2 = $$1.a();
         String $$3 = $$1.b();
         return $$3 != null || qt.a().b($$2);
      } else {
         return true;
      }
   }

   public static ua a(String $$0) {
      return a((tn)tn.b($$0).a($$1 -> $$1.a(n.k).a(new tl(tl.a.f, $$0)).a(new ts(ts.a.a, tn.c("chat.copy.click"))).a($$0)));
   }
}
