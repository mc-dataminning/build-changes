import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vt {
   public static final String a = ", ";
   public static final vq b = vq.b(", ").a(n.h);
   public static final vq c = vq.b(", ");

   public static we a(we $$0, wn $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         wn $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<we> a(@Nullable du $$0, Optional<vq> $$1, @Nullable bnq $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static we a(@Nullable du $$0, vq $$1, @Nullable bnq $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         we $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (vq $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static wn a(@Nullable du $$0, wn $$1, @Nullable bnq $$2, int $$3) throws CommandSyntaxException {
      vw $$4 = $$1.i();
      if ($$4 != null) {
         vq $$5 = $$4.a(vw.a.a);
         if ($$5 != null) {
            vw $$6 = new vw(vw.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static vq a(Collection<String> $$0) {
      return a($$0, $$0x -> vq.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> vq a(Collection<T> $$0, Function<T, vq> $$1) {
      if ($$0.isEmpty()) {
         return vp.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> vq b(Collection<? extends T> $$0, Function<T, vq> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> we a(Collection<? extends T> $$0, Optional<? extends vq> $$1, Function<T, vq> $$2) {
      return a($$0, (vq)DataFixUtils.orElse($$1, b), $$2);
   }

   public static vq a(Collection<? extends vq> $$0, vq $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> we a(Collection<? extends T> $$0, vq $$1, Function<T, vq> $$2) {
      if ($$0.isEmpty()) {
         return vq.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         we $$3 = vq.i();
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

   public static we a(vq $$0) {
      return vq.a("chat.square_brackets", $$0);
   }

   public static vq a(Message $$0) {
      return (vq)($$0 instanceof vq ? (vq)$$0 : vq.b($$0.getString()));
   }

   public static boolean b(@Nullable vq $$0) {
      if ($$0 != null && $$0.b() instanceof xb $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || sr.a().b($$2);
      } else {
         return true;
      }
   }

   public static we a(String $$0) {
      return a((vq)vq.b($$0).a($$1 -> $$1.a(n.k).a(new vo(vo.a.f, $$0)).a(new vw(vw.a.a, vq.c("chat.copy.click"))).a($$0)));
   }
}
