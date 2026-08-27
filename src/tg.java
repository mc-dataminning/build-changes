import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class tg {
   public static final String a = ", ";
   public static final te b = te.b(", ").a(n.h);
   public static final te c = te.b(", ");

   public static tr a(tr $$0, ua $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ua $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<tr> a(@Nullable ds $$0, Optional<te> $$1, @Nullable big $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static tr a(@Nullable ds $$0, te $$1, @Nullable big $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         tr $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (te $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ua a(@Nullable ds $$0, ua $$1, @Nullable big $$2, int $$3) throws CommandSyntaxException {
      tj $$4 = $$1.i();
      if ($$4 != null) {
         te $$5 = $$4.a(tj.a.a);
         if ($$5 != null) {
            tj $$6 = new tj(tj.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static te a(Collection<String> $$0) {
      return a($$0, $$0x -> te.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> te a(Collection<T> $$0, Function<T, te> $$1) {
      if ($$0.isEmpty()) {
         return td.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> te b(Collection<? extends T> $$0, Function<T, te> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> tr a(Collection<? extends T> $$0, Optional<? extends te> $$1, Function<T, te> $$2) {
      return a($$0, (te)DataFixUtils.orElse($$1, b), $$2);
   }

   public static te a(Collection<? extends te> $$0, te $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> tr a(Collection<? extends T> $$0, te $$1, Function<T, te> $$2) {
      if ($$0.isEmpty()) {
         return te.h();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).e();
      } else {
         tr $$3 = te.h();
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

   public static tr a(te $$0) {
      return te.a("chat.square_brackets", $$0);
   }

   public static te a(Message $$0) {
      return (te)($$0 instanceof te ? (te)$$0 : te.b($$0.getString()));
   }

   public static boolean b(@Nullable te $$0) {
      if ($$0 != null && $$0.b() instanceof uo $$1) {
         String $$2 = $$1.a();
         String $$3 = $$1.b();
         return $$3 != null || qn.a().b($$2);
      } else {
         return true;
      }
   }

   public static tr a(String $$0) {
      return a((te)te.b($$0).a($$1 -> $$1.a(n.k).a(new tc(tc.a.f, $$0)).a(new tj(tj.a.a, te.c("chat.copy.click"))).a($$0)));
   }
}
