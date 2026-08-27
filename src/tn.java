import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class tn {
   public static final String a = ", ";
   public static final tl b = tl.b(", ").a(n.h);
   public static final tl c = tl.b(", ");

   public static ty a(ty $$0, uh $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         uh $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<ty> a(@Nullable dt $$0, Optional<tl> $$1, @Nullable biq $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static ty a(@Nullable dt $$0, tl $$1, @Nullable biq $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         ty $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (tl $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static uh a(@Nullable dt $$0, uh $$1, @Nullable biq $$2, int $$3) throws CommandSyntaxException {
      tq $$4 = $$1.i();
      if ($$4 != null) {
         tl $$5 = $$4.a(tq.a.a);
         if ($$5 != null) {
            tq $$6 = new tq(tq.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static tl a(Collection<String> $$0) {
      return a($$0, $$0x -> tl.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> tl a(Collection<T> $$0, Function<T, tl> $$1) {
      if ($$0.isEmpty()) {
         return tk.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> tl b(Collection<? extends T> $$0, Function<T, tl> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> ty a(Collection<? extends T> $$0, Optional<? extends tl> $$1, Function<T, tl> $$2) {
      return a($$0, (tl)DataFixUtils.orElse($$1, b), $$2);
   }

   public static tl a(Collection<? extends tl> $$0, tl $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> ty a(Collection<? extends T> $$0, tl $$1, Function<T, tl> $$2) {
      if ($$0.isEmpty()) {
         return tl.h();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).e();
      } else {
         ty $$3 = tl.h();
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

   public static ty a(tl $$0) {
      return tl.a("chat.square_brackets", $$0);
   }

   public static tl a(Message $$0) {
      return (tl)($$0 instanceof tl ? (tl)$$0 : tl.b($$0.getString()));
   }

   public static boolean b(@Nullable tl $$0) {
      if ($$0 != null && $$0.b() instanceof uv $$1) {
         String $$2 = $$1.a();
         String $$3 = $$1.b();
         return $$3 != null || qs.a().b($$2);
      } else {
         return true;
      }
   }

   public static ty a(String $$0) {
      return a((tl)tl.b($$0).a($$1 -> $$1.a(n.k).a(new tj(tj.a.f, $$0)).a(new tq(tq.a.a, tl.c("chat.copy.click"))).a($$0)));
   }
}
