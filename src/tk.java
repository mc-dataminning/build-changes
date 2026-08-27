import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class tk {
   public static final String a = ", ";
   public static final ti b = ti.b(", ").a(n.h);
   public static final ti c = ti.b(", ");

   public static tv a(tv $$0, ue $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ue $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<tv> a(@Nullable dt $$0, Optional<ti> $$1, @Nullable bil $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static tv a(@Nullable dt $$0, ti $$1, @Nullable bil $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         tv $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (ti $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ue a(@Nullable dt $$0, ue $$1, @Nullable bil $$2, int $$3) throws CommandSyntaxException {
      tn $$4 = $$1.i();
      if ($$4 != null) {
         ti $$5 = $$4.a(tn.a.a);
         if ($$5 != null) {
            tn $$6 = new tn(tn.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static ti a(Collection<String> $$0) {
      return a($$0, $$0x -> ti.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> ti a(Collection<T> $$0, Function<T, ti> $$1) {
      if ($$0.isEmpty()) {
         return th.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> ti b(Collection<? extends T> $$0, Function<T, ti> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> tv a(Collection<? extends T> $$0, Optional<? extends ti> $$1, Function<T, ti> $$2) {
      return a($$0, (ti)DataFixUtils.orElse($$1, b), $$2);
   }

   public static ti a(Collection<? extends ti> $$0, ti $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> tv a(Collection<? extends T> $$0, ti $$1, Function<T, ti> $$2) {
      if ($$0.isEmpty()) {
         return ti.h();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).e();
      } else {
         tv $$3 = ti.h();
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

   public static tv a(ti $$0) {
      return ti.a("chat.square_brackets", $$0);
   }

   public static ti a(Message $$0) {
      return (ti)($$0 instanceof ti ? (ti)$$0 : ti.b($$0.getString()));
   }

   public static boolean b(@Nullable ti $$0) {
      if ($$0 != null && $$0.b() instanceof us $$1) {
         String $$2 = $$1.a();
         String $$3 = $$1.b();
         return $$3 != null || qp.a().b($$2);
      } else {
         return true;
      }
   }

   public static tv a(String $$0) {
      return a((ti)ti.b($$0).a($$1 -> $$1.a(n.k).a(new tg(tg.a.f, $$0)).a(new tn(tn.a.a, ti.c("chat.copy.click"))).a($$0)));
   }
}
