import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xb {
   public static final String a = ", ";
   public static final wy b = wy.b(", ").a(n.h);
   public static final wy c = wy.b(", ");

   public static xm a(xm $$0, xv $$1) {
      if ($$1.h()) {
         return $$0;
      } else {
         xv $$2 = $$0.a();
         if ($$2.h()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xm> a(@Nullable ei $$0, Optional<wy> $$1, @Nullable bwd $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xm a(@Nullable ei $$0, wy $$1, @Nullable bwd $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xm $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wy $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xv a(@Nullable ei $$0, xv $$1, @Nullable bwd $$2, int $$3) throws CommandSyntaxException {
      if ($$1.j() instanceof xe.e var5) {
         xe.e var10000 = var5;

         try {
            var10 = var10000.b();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         xe $$6 = var10;
         $$6 = new xe.e(a($$0, $$6, $$2, $$3 + 1));
         return $$1.a($$6);
      } else {
         return $$1;
      }
   }

   public static wy a(Collection<String> $$0) {
      return a($$0, $$0x -> wy.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wy a(Collection<T> $$0, Function<T, wy> $$1) {
      if ($$0.isEmpty()) {
         return wx.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wy b(Collection<? extends T> $$0, Function<T, wy> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xm a(Collection<? extends T> $$0, Optional<? extends wy> $$1, Function<T, wy> $$2) {
      return a($$0, (wy)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wy a(Collection<? extends wy> $$0, wy $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xm a(Collection<? extends T> $$0, wy $$1, Function<T, wy> $$2) {
      if ($$0.isEmpty()) {
         return wy.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xm $$3 = wy.i();
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

   public static xm a(wy $$0) {
      return wy.a("chat.square_brackets", $$0);
   }

   public static wy a(Message $$0) {
      return (wy)($$0 instanceof wy ? (wy)$$0 : wy.b($$0.getString()));
   }

   public static boolean b(@Nullable wy $$0) {
      if ($$0 != null && $$0.b() instanceof yj $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || tu.a().b($$2);
      } else {
         return true;
      }
   }

   public static xm a(String $$0) {
      return a((wy)wy.b($$0).a($$1 -> $$1.a(n.k).a(new ww.c($$0)).a(new xe.e(wy.c("chat.copy.click"))).a($$0)));
   }
}
