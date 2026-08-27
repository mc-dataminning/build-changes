import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ve {
   public static final String a = ", ";
   public static final vb b = vb.b(", ").a(n.h);
   public static final vb c = vb.b(", ");

   public static vp a(vp $$0, vy $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         vy $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<vp> a(@Nullable ds $$0, Optional<vb> $$1, @Nullable blf $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static vp a(@Nullable ds $$0, vb $$1, @Nullable blf $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         vp $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (vb $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static vy a(@Nullable ds $$0, vy $$1, @Nullable blf $$2, int $$3) throws CommandSyntaxException {
      vh $$4 = $$1.i();
      if ($$4 != null) {
         vb $$5 = $$4.a(vh.a.a);
         if ($$5 != null) {
            vh $$6 = new vh(vh.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static vb a(Collection<String> $$0) {
      return a($$0, $$0x -> vb.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> vb a(Collection<T> $$0, Function<T, vb> $$1) {
      if ($$0.isEmpty()) {
         return va.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> vb b(Collection<? extends T> $$0, Function<T, vb> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> vp a(Collection<? extends T> $$0, Optional<? extends vb> $$1, Function<T, vb> $$2) {
      return a($$0, (vb)DataFixUtils.orElse($$1, b), $$2);
   }

   public static vb a(Collection<? extends vb> $$0, vb $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> vp a(Collection<? extends T> $$0, vb $$1, Function<T, vb> $$2) {
      if ($$0.isEmpty()) {
         return vb.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         vp $$3 = vb.i();
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

   public static vp a(vb $$0) {
      return vb.a("chat.square_brackets", $$0);
   }

   public static vb a(Message $$0) {
      return (vb)($$0 instanceof vb ? (vb)$$0 : vb.b($$0.getString()));
   }

   public static boolean b(@Nullable vb $$0) {
      if ($$0 != null && $$0.b() instanceof wm $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || se.a().b($$2);
      } else {
         return true;
      }
   }

   public static vp a(String $$0) {
      return a((vb)vb.b($$0).a($$1 -> $$1.a(n.k).a(new uz(uz.a.f, $$0)).a(new vh(vh.a.a, vb.c("chat.copy.click"))).a($$0)));
   }
}
