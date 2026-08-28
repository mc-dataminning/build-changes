import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class wr {
   public static final String a = ", ";
   public static final wo b = wo.b(", ").a(n.h);
   public static final wo c = wo.b(", ");

   public static xc a(xc $$0, xl $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         xl $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xc> a(@Nullable ex $$0, Optional<wo> $$1, @Nullable buj $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xc a(@Nullable ex $$0, wo $$1, @Nullable buj $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xc $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wo $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xl a(@Nullable ex $$0, xl $$1, @Nullable buj $$2, int $$3) throws CommandSyntaxException {
      wu $$4 = $$1.j();
      if ($$4 != null) {
         wo $$5 = $$4.a(wu.a.a);
         if ($$5 != null) {
            wu $$6 = new wu(wu.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static wo a(Collection<String> $$0) {
      return a($$0, $$0x -> wo.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wo a(Collection<T> $$0, Function<T, wo> $$1) {
      if ($$0.isEmpty()) {
         return wn.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wo b(Collection<? extends T> $$0, Function<T, wo> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xc a(Collection<? extends T> $$0, Optional<? extends wo> $$1, Function<T, wo> $$2) {
      return a($$0, (wo)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wo a(Collection<? extends wo> $$0, wo $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xc a(Collection<? extends T> $$0, wo $$1, Function<T, wo> $$2) {
      if ($$0.isEmpty()) {
         return wo.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xc $$3 = wo.i();
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

   public static xc a(wo $$0) {
      return wo.a("chat.square_brackets", $$0);
   }

   public static wo a(Message $$0) {
      return (wo)($$0 instanceof wo ? (wo)$$0 : wo.b($$0.getString()));
   }

   public static boolean b(@Nullable wo $$0) {
      if ($$0 != null && $$0.b() instanceof xz $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tl.a().b($$2);
      } else {
         return true;
      }
   }

   public static xc a(String $$0) {
      return a((wo)wo.b($$0).a($$1 -> $$1.a(n.k).a(new wm(wm.a.f, $$0)).a(new wu(wu.a.a, wo.c("chat.copy.click"))).a($$0)));
   }
}
