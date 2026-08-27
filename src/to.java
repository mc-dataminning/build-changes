import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class to {
   public static final String a = ", ";
   public static final tm b = tm.b(", ").a(n.h);
   public static final tm c = tm.b(", ");

   public static tz a(tz $$0, ui $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ui $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<tz> a(@Nullable dt $$0, Optional<tm> $$1, @Nullable biq $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static tz a(@Nullable dt $$0, tm $$1, @Nullable biq $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         tz $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (tm $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ui a(@Nullable dt $$0, ui $$1, @Nullable biq $$2, int $$3) throws CommandSyntaxException {
      tr $$4 = $$1.i();
      if ($$4 != null) {
         tm $$5 = $$4.a(tr.a.a);
         if ($$5 != null) {
            tr $$6 = new tr(tr.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static tm a(Collection<String> $$0) {
      return a($$0, $$0x -> tm.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> tm a(Collection<T> $$0, Function<T, tm> $$1) {
      if ($$0.isEmpty()) {
         return tl.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> tm b(Collection<? extends T> $$0, Function<T, tm> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> tz a(Collection<? extends T> $$0, Optional<? extends tm> $$1, Function<T, tm> $$2) {
      return a($$0, (tm)DataFixUtils.orElse($$1, b), $$2);
   }

   public static tm a(Collection<? extends tm> $$0, tm $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> tz a(Collection<? extends T> $$0, tm $$1, Function<T, tm> $$2) {
      if ($$0.isEmpty()) {
         return tm.h();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).e();
      } else {
         tz $$3 = tm.h();
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

   public static tz a(tm $$0) {
      return tm.a("chat.square_brackets", $$0);
   }

   public static tm a(Message $$0) {
      return (tm)($$0 instanceof tm ? (tm)$$0 : tm.b($$0.getString()));
   }

   public static boolean b(@Nullable tm $$0) {
      if ($$0 != null && $$0.b() instanceof uw $$1) {
         String $$2 = $$1.a();
         String $$3 = $$1.b();
         return $$3 != null || qt.a().b($$2);
      } else {
         return true;
      }
   }

   public static tz a(String $$0) {
      return a((tm)tm.b($$0).a($$1 -> $$1.a(n.k).a(new tk(tk.a.f, $$0)).a(new tr(tr.a.a, tm.c("chat.copy.click"))).a($$0)));
   }
}
