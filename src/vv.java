import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vv {
   public static final String a = ", ";
   public static final vs b = vs.b(", ").a(n.h);
   public static final vs c = vs.b(", ");

   public static wg a(wg $$0, wp $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         wp $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<wg> a(@Nullable du $$0, Optional<vs> $$1, @Nullable bof $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static wg a(@Nullable du $$0, vs $$1, @Nullable bof $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         wg $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (vs $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static wp a(@Nullable du $$0, wp $$1, @Nullable bof $$2, int $$3) throws CommandSyntaxException {
      vy $$4 = $$1.i();
      if ($$4 != null) {
         vs $$5 = $$4.a(vy.a.a);
         if ($$5 != null) {
            vy $$6 = new vy(vy.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static vs a(Collection<String> $$0) {
      return a($$0, $$0x -> vs.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> vs a(Collection<T> $$0, Function<T, vs> $$1) {
      if ($$0.isEmpty()) {
         return vr.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> vs b(Collection<? extends T> $$0, Function<T, vs> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> wg a(Collection<? extends T> $$0, Optional<? extends vs> $$1, Function<T, vs> $$2) {
      return a($$0, (vs)DataFixUtils.orElse($$1, b), $$2);
   }

   public static vs a(Collection<? extends vs> $$0, vs $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> wg a(Collection<? extends T> $$0, vs $$1, Function<T, vs> $$2) {
      if ($$0.isEmpty()) {
         return vs.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         wg $$3 = vs.i();
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

   public static wg a(vs $$0) {
      return vs.a("chat.square_brackets", $$0);
   }

   public static vs a(Message $$0) {
      return (vs)($$0 instanceof vs ? (vs)$$0 : vs.b($$0.getString()));
   }

   public static boolean b(@Nullable vs $$0) {
      if ($$0 != null && $$0.b() instanceof xd $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || st.a().b($$2);
      } else {
         return true;
      }
   }

   public static wg a(String $$0) {
      return a((vs)vs.b($$0).a($$1 -> $$1.a(n.k).a(new vq(vq.a.f, $$0)).a(new vy(vy.a.a, vs.c("chat.copy.click"))).a($$0)));
   }
}
