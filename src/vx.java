import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vx {
   public static final String a = ", ";
   public static final vu b = vu.b(", ").a(n.h);
   public static final vu c = vu.b(", ");

   public static wi a(wi $$0, wr $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         wr $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<wi> a(@Nullable du $$0, Optional<vu> $$1, @Nullable box $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static wi a(@Nullable du $$0, vu $$1, @Nullable box $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         wi $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (vu $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static wr a(@Nullable du $$0, wr $$1, @Nullable box $$2, int $$3) throws CommandSyntaxException {
      wa $$4 = $$1.i();
      if ($$4 != null) {
         vu $$5 = $$4.a(wa.a.a);
         if ($$5 != null) {
            wa $$6 = new wa(wa.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static vu a(Collection<String> $$0) {
      return a($$0, $$0x -> vu.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> vu a(Collection<T> $$0, Function<T, vu> $$1) {
      if ($$0.isEmpty()) {
         return vt.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> vu b(Collection<? extends T> $$0, Function<T, vu> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> wi a(Collection<? extends T> $$0, Optional<? extends vu> $$1, Function<T, vu> $$2) {
      return a($$0, (vu)DataFixUtils.orElse($$1, b), $$2);
   }

   public static vu a(Collection<? extends vu> $$0, vu $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> wi a(Collection<? extends T> $$0, vu $$1, Function<T, vu> $$2) {
      if ($$0.isEmpty()) {
         return vu.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         wi $$3 = vu.i();
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

   public static wi a(vu $$0) {
      return vu.a("chat.square_brackets", $$0);
   }

   public static vu a(Message $$0) {
      return (vu)($$0 instanceof vu ? (vu)$$0 : vu.b($$0.getString()));
   }

   public static boolean b(@Nullable vu $$0) {
      if ($$0 != null && $$0.b() instanceof xf $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || sv.a().b($$2);
      } else {
         return true;
      }
   }

   public static wi a(String $$0) {
      return a((vu)vu.b($$0).a($$1 -> $$1.a(n.k).a(new vs(vs.a.f, $$0)).a(new wa(wa.a.a, vu.c("chat.copy.click"))).a($$0)));
   }
}
