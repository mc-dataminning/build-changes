import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class xa {
   public static final String a = ", ";
   public static final wx b = wx.b(", ").a(n.h);
   public static final wx c = wx.b(", ");

   public static xl a(xl $$0, xu $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         xu $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<xl> a(@Nullable ee $$0, Optional<wx> $$1, @Nullable bru $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static xl a(@Nullable ee $$0, wx $$1, @Nullable bru $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         xl $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (wx $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static xu a(@Nullable ee $$0, xu $$1, @Nullable bru $$2, int $$3) throws CommandSyntaxException {
      xd $$4 = $$1.i();
      if ($$4 != null) {
         wx $$5 = $$4.a(xd.a.a);
         if ($$5 != null) {
            xd $$6 = new xd(xd.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static wx a(Collection<String> $$0) {
      return a($$0, $$0x -> wx.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> wx a(Collection<T> $$0, Function<T, wx> $$1) {
      if ($$0.isEmpty()) {
         return ww.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> wx b(Collection<? extends T> $$0, Function<T, wx> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> xl a(Collection<? extends T> $$0, Optional<? extends wx> $$1, Function<T, wx> $$2) {
      return a($$0, (wx)DataFixUtils.orElse($$1, b), $$2);
   }

   public static wx a(Collection<? extends wx> $$0, wx $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> xl a(Collection<? extends T> $$0, wx $$1, Function<T, wx> $$2) {
      if ($$0.isEmpty()) {
         return wx.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         xl $$3 = wx.i();
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

   public static xl a(wx $$0) {
      return wx.a("chat.square_brackets", $$0);
   }

   public static wx a(Message $$0) {
      return (wx)($$0 instanceof wx ? (wx)$$0 : wx.b($$0.getString()));
   }

   public static boolean b(@Nullable wx $$0) {
      if ($$0 != null && $$0.b() instanceof yi $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ty.a().b($$2);
      } else {
         return true;
      }
   }

   public static xl a(String $$0) {
      return a((wx)wx.b($$0).a($$1 -> $$1.a(n.k).a(new wv(wv.a.f, $$0)).a(new xd(xd.a.a, wx.c("chat.copy.click"))).a($$0)));
   }
}
