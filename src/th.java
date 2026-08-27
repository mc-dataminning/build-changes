import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class th {
   public static final String a = ", ";
   public static final tf b = tf.b(", ").a(n.h);
   public static final tf c = tf.b(", ");

   public static ts a(ts $$0, ub $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         ub $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<ts> a(@Nullable dr $$0, Optional<tf> $$1, @Nullable bii $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static ts a(@Nullable dr $$0, tf $$1, @Nullable bii $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         ts $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (tf $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static ub a(@Nullable dr $$0, ub $$1, @Nullable bii $$2, int $$3) throws CommandSyntaxException {
      tk $$4 = $$1.i();
      if ($$4 != null) {
         tf $$5 = $$4.a(tk.a.a);
         if ($$5 != null) {
            tk $$6 = new tk(tk.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static tf a(Collection<String> $$0) {
      return a($$0, $$0x -> tf.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> tf a(Collection<T> $$0, Function<T, tf> $$1) {
      if ($$0.isEmpty()) {
         return te.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> tf b(Collection<? extends T> $$0, Function<T, tf> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> ts a(Collection<? extends T> $$0, Optional<? extends tf> $$1, Function<T, tf> $$2) {
      return a($$0, (tf)DataFixUtils.orElse($$1, b), $$2);
   }

   public static tf a(Collection<? extends tf> $$0, tf $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> ts a(Collection<? extends T> $$0, tf $$1, Function<T, tf> $$2) {
      if ($$0.isEmpty()) {
         return tf.h();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).e();
      } else {
         ts $$3 = tf.h();
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

   public static ts a(tf $$0) {
      return tf.a("chat.square_brackets", $$0);
   }

   public static tf a(Message $$0) {
      return (tf)($$0 instanceof tf ? (tf)$$0 : tf.b($$0.getString()));
   }

   public static boolean b(@Nullable tf $$0) {
      if ($$0 != null && $$0.b() instanceof up $$1) {
         String $$2 = $$1.a();
         String $$3 = $$1.b();
         return $$3 != null || qm.a().b($$2);
      } else {
         return true;
      }
   }

   public static ts a(String $$0) {
      return a((tf)tf.b($$0).a($$1 -> $$1.a(n.k).a(new td(td.a.f, $$0)).a(new tk(tk.a.a, tf.c("chat.copy.click"))).a($$0)));
   }
}
