import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vg {
   public static final String a = ", ";
   public static final vd b = vd.b(", ").a(n.h);
   public static final vd c = vd.b(", ");

   public static vr a(vr $$0, wa $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         wa $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<vr> a(@Nullable ds $$0, Optional<vd> $$1, @Nullable blp $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static vr a(@Nullable ds $$0, vd $$1, @Nullable blp $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         vr $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (vd $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static wa a(@Nullable ds $$0, wa $$1, @Nullable blp $$2, int $$3) throws CommandSyntaxException {
      vj $$4 = $$1.i();
      if ($$4 != null) {
         vd $$5 = $$4.a(vj.a.a);
         if ($$5 != null) {
            vj $$6 = new vj(vj.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static vd a(Collection<String> $$0) {
      return a($$0, $$0x -> vd.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> vd a(Collection<T> $$0, Function<T, vd> $$1) {
      if ($$0.isEmpty()) {
         return vc.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> vd b(Collection<? extends T> $$0, Function<T, vd> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> vr a(Collection<? extends T> $$0, Optional<? extends vd> $$1, Function<T, vd> $$2) {
      return a($$0, (vd)DataFixUtils.orElse($$1, b), $$2);
   }

   public static vd a(Collection<? extends vd> $$0, vd $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> vr a(Collection<? extends T> $$0, vd $$1, Function<T, vd> $$2) {
      if ($$0.isEmpty()) {
         return vd.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         vr $$3 = vd.i();
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

   public static vr a(vd $$0) {
      return vd.a("chat.square_brackets", $$0);
   }

   public static vd a(Message $$0) {
      return (vd)($$0 instanceof vd ? (vd)$$0 : vd.b($$0.getString()));
   }

   public static boolean b(@Nullable vd $$0) {
      if ($$0 != null && $$0.b() instanceof wo $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || sg.a().b($$2);
      } else {
         return true;
      }
   }

   public static vr a(String $$0) {
      return a((vd)vd.b($$0).a($$1 -> $$1.a(n.k).a(new vb(vb.a.f, $$0)).a(new vj(vj.a.a, vd.c("chat.copy.click"))).a($$0)));
   }
}
