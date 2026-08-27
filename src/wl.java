import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class wl {
   public static final String a = ", ";
   public static final wi b = wi.b(", ").a(n.h);
   public static final wi c = wi.b(", ");

   public static ww a(ww $$0, xf $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         xf $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<ww> a(@Nullable dv $$0, Optional<wi> $$1, @Nullable bqa $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static ww a(@Nullable dv $$0, wi $$1, @Nullable bqa $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         ww $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wi $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xf a(@Nullable dv $$0, xf $$1, @Nullable bqa $$2, int $$3) throws CommandSyntaxException {
      wo $$4 = $$1.i();
      if ($$4 != null) {
         wi $$5 = $$4.a(wo.a.a);
         if ($$5 != null) {
            wo $$6 = new wo(wo.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static wi a(Collection<String> $$0) {
      return a($$0, $$0x -> wi.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wi a(Collection<T> $$0, Function<T, wi> $$1) {
      if ($$0.isEmpty()) {
         return wh.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wi b(Collection<? extends T> $$0, Function<T, wi> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> ww a(Collection<? extends T> $$0, Optional<? extends wi> $$1, Function<T, wi> $$2) {
      return a($$0, (wi)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wi a(Collection<? extends wi> $$0, wi $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> ww a(Collection<? extends T> $$0, wi $$1, Function<T, wi> $$2) {
      if ($$0.isEmpty()) {
         return wi.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         ww $$3 = wi.i();
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

   public static ww a(wi $$0) {
      return wi.a("chat.square_brackets", $$0);
   }

   public static wi a(Message $$0) {
      return (wi)($$0 instanceof wi ? (wi)$$0 : wi.b($$0.getString()));
   }

   public static boolean b(@Nullable wi $$0) {
      if ($$0 != null && $$0.b() instanceof xt $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tj.a().b($$2);
      } else {
         return true;
      }
   }

   public static ww a(String $$0) {
      return a((wi)wi.b($$0).a($$1 -> $$1.a(n.k).a(new wg(wg.a.f, $$0)).a(new wo(wo.a.a, wi.c("chat.copy.click"))).a($$0)));
   }
}
