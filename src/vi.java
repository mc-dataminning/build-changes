import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vi {
   public static final String a = ", ";
   public static final vf b = vf.b(", ").a(n.h);
   public static final vf c = vf.b(", ");

   public static vt a(vt $$0, wc $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         wc $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<vt> a(@Nullable ds $$0, Optional<vf> $$1, @Nullable blv $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static vt a(@Nullable ds $$0, vf $$1, @Nullable blv $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         vt $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (vf $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static wc a(@Nullable ds $$0, wc $$1, @Nullable blv $$2, int $$3) throws CommandSyntaxException {
      vl $$4 = $$1.i();
      if ($$4 != null) {
         vf $$5 = $$4.a(vl.a.a);
         if ($$5 != null) {
            vl $$6 = new vl(vl.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static vf a(Collection<String> $$0) {
      return a($$0, $$0x -> vf.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> vf a(Collection<T> $$0, Function<T, vf> $$1) {
      if ($$0.isEmpty()) {
         return ve.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> vf b(Collection<? extends T> $$0, Function<T, vf> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> vt a(Collection<? extends T> $$0, Optional<? extends vf> $$1, Function<T, vf> $$2) {
      return a($$0, (vf)DataFixUtils.orElse($$1, b), $$2);
   }

   public static vf a(Collection<? extends vf> $$0, vf $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> vt a(Collection<? extends T> $$0, vf $$1, Function<T, vf> $$2) {
      if ($$0.isEmpty()) {
         return vf.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         vt $$3 = vf.i();
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

   public static vt a(vf $$0) {
      return vf.a("chat.square_brackets", $$0);
   }

   public static vf a(Message $$0) {
      return (vf)($$0 instanceof vf ? (vf)$$0 : vf.b($$0.getString()));
   }

   public static boolean b(@Nullable vf $$0) {
      if ($$0 != null && $$0.b() instanceof wq $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || si.a().b($$2);
      } else {
         return true;
      }
   }

   public static vt a(String $$0) {
      return a((vf)vf.b($$0).a($$1 -> $$1.a(n.k).a(new vd(vd.a.f, $$0)).a(new vl(vl.a.a, vf.c("chat.copy.click"))).a($$0)));
   }
}
