import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vj {
   public static final String a = ", ";
   public static final vg b = vg.b(", ").a(n.h);
   public static final vg c = vg.b(", ");

   public static vu a(vu $$0, wd $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         wd $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<vu> a(@Nullable ds $$0, Optional<vg> $$1, @Nullable blw $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static vu a(@Nullable ds $$0, vg $$1, @Nullable blw $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         vu $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (vg $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static wd a(@Nullable ds $$0, wd $$1, @Nullable blw $$2, int $$3) throws CommandSyntaxException {
      vm $$4 = $$1.i();
      if ($$4 != null) {
         vg $$5 = $$4.a(vm.a.a);
         if ($$5 != null) {
            vm $$6 = new vm(vm.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static vg a(Collection<String> $$0) {
      return a($$0, $$0x -> vg.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> vg a(Collection<T> $$0, Function<T, vg> $$1) {
      if ($$0.isEmpty()) {
         return vf.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> vg b(Collection<? extends T> $$0, Function<T, vg> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> vu a(Collection<? extends T> $$0, Optional<? extends vg> $$1, Function<T, vg> $$2) {
      return a($$0, (vg)DataFixUtils.orElse($$1, b), $$2);
   }

   public static vg a(Collection<? extends vg> $$0, vg $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> vu a(Collection<? extends T> $$0, vg $$1, Function<T, vg> $$2) {
      if ($$0.isEmpty()) {
         return vg.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         vu $$3 = vg.i();
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

   public static vu a(vg $$0) {
      return vg.a("chat.square_brackets", $$0);
   }

   public static vg a(Message $$0) {
      return (vg)($$0 instanceof vg ? (vg)$$0 : vg.b($$0.getString()));
   }

   public static boolean b(@Nullable vg $$0) {
      if ($$0 != null && $$0.b() instanceof wr $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || sj.a().b($$2);
      } else {
         return true;
      }
   }

   public static vu a(String $$0) {
      return a((vg)vg.b($$0).a($$1 -> $$1.a(n.k).a(new ve(ve.a.f, $$0)).a(new vm(vm.a.a, vg.c("chat.copy.click"))).a($$0)));
   }
}
