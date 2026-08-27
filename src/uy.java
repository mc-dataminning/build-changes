import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class uy {
   public static final String a = ", ";
   public static final uv b = uv.b(", ").a(n.h);
   public static final uv c = uv.b(", ");

   public static vj a(vj $$0, vs $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         vs $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<vj> a(@Nullable du $$0, Optional<uv> $$1, @Nullable bkv $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static vj a(@Nullable du $$0, uv $$1, @Nullable bkv $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         vj $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (uv $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static vs a(@Nullable du $$0, vs $$1, @Nullable bkv $$2, int $$3) throws CommandSyntaxException {
      vb $$4 = $$1.i();
      if ($$4 != null) {
         uv $$5 = $$4.a(vb.a.a);
         if ($$5 != null) {
            vb $$6 = new vb(vb.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static uv a(Collection<String> $$0) {
      return a($$0, $$0x -> uv.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> uv a(Collection<T> $$0, Function<T, uv> $$1) {
      if ($$0.isEmpty()) {
         return uu.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> uv b(Collection<? extends T> $$0, Function<T, uv> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> vj a(Collection<? extends T> $$0, Optional<? extends uv> $$1, Function<T, uv> $$2) {
      return a($$0, (uv)DataFixUtils.orElse($$1, b), $$2);
   }

   public static uv a(Collection<? extends uv> $$0, uv $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> vj a(Collection<? extends T> $$0, uv $$1, Function<T, uv> $$2) {
      if ($$0.isEmpty()) {
         return uv.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         vj $$3 = uv.i();
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

   public static vj a(uv $$0) {
      return uv.a("chat.square_brackets", $$0);
   }

   public static uv a(Message $$0) {
      return (uv)($$0 instanceof uv ? (uv)$$0 : uv.b($$0.getString()));
   }

   public static boolean b(@Nullable uv $$0) {
      if ($$0 != null && $$0.b() instanceof wg $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ry.a().b($$2);
      } else {
         return true;
      }
   }

   public static vj a(String $$0) {
      return a((uv)uv.b($$0).a($$1 -> $$1.a(n.k).a(new ut(ut.a.f, $$0)).a(new vb(vb.a.a, uv.c("chat.copy.click"))).a($$0)));
   }
}
