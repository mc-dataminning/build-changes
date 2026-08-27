import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class wj {
   public static final String a = ", ";
   public static final wg b = wg.b(", ").a(n.h);
   public static final wg c = wg.b(", ");

   public static wu a(wu $$0, xd $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         xd $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<wu> a(@Nullable du $$0, Optional<wg> $$1, @Nullable bpv $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static wu a(@Nullable du $$0, wg $$1, @Nullable bpv $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         wu $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wg $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xd a(@Nullable du $$0, xd $$1, @Nullable bpv $$2, int $$3) throws CommandSyntaxException {
      wm $$4 = $$1.i();
      if ($$4 != null) {
         wg $$5 = $$4.a(wm.a.a);
         if ($$5 != null) {
            wm $$6 = new wm(wm.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static wg a(Collection<String> $$0) {
      return a($$0, $$0x -> wg.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wg a(Collection<T> $$0, Function<T, wg> $$1) {
      if ($$0.isEmpty()) {
         return wf.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wg b(Collection<? extends T> $$0, Function<T, wg> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> wu a(Collection<? extends T> $$0, Optional<? extends wg> $$1, Function<T, wg> $$2) {
      return a($$0, (wg)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wg a(Collection<? extends wg> $$0, wg $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> wu a(Collection<? extends T> $$0, wg $$1, Function<T, wg> $$2) {
      if ($$0.isEmpty()) {
         return wg.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         wu $$3 = wg.i();
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

   public static wu a(wg $$0) {
      return wg.a("chat.square_brackets", $$0);
   }

   public static wg a(Message $$0) {
      return (wg)($$0 instanceof wg ? (wg)$$0 : wg.b($$0.getString()));
   }

   public static boolean b(@Nullable wg $$0) {
      if ($$0 != null && $$0.b() instanceof xr $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || th.a().b($$2);
      } else {
         return true;
      }
   }

   public static wu a(String $$0) {
      return a((wg)wg.b($$0).a($$1 -> $$1.a(n.k).a(new we(we.a.f, $$0)).a(new wm(wm.a.a, wg.c("chat.copy.click"))).a($$0)));
   }
}
