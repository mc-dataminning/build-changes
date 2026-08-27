import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ul {
   public static final String a = ", ";
   public static final ui b = ui.b(", ").a(n.h);
   public static final ui c = ui.b(", ");

   public static uw a(uw $$0, vf $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         vf $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<uw> a(@Nullable du $$0, Optional<ui> $$1, @Nullable bjt $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static uw a(@Nullable du $$0, ui $$1, @Nullable bjt $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.f();
      } else {
         uw $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for (ui $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static vf a(@Nullable du $$0, vf $$1, @Nullable bjt $$2, int $$3) throws CommandSyntaxException {
      uo $$4 = $$1.i();
      if ($$4 != null) {
         ui $$5 = $$4.a(uo.a.a);
         if ($$5 != null) {
            uo $$6 = new uo(uo.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static ui a(Collection<String> $$0) {
      return a($$0, $$0x -> ui.b($$0x).a(n.k));
   }

   public static <T extends Comparable<T>> ui a(Collection<T> $$0, Function<T, ui> $$1) {
      if ($$0.isEmpty()) {
         return uh.a;
      } else if ($$0.size() == 1) {
         return $$1.apply($$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> ui b(Collection<? extends T> $$0, Function<T, ui> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> uw a(Collection<? extends T> $$0, Optional<? extends ui> $$1, Function<T, ui> $$2) {
      return a($$0, (ui)DataFixUtils.orElse($$1, b), $$2);
   }

   public static ui a(Collection<? extends ui> $$0, ui $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> uw a(Collection<? extends T> $$0, ui $$1, Function<T, ui> $$2) {
      if ($$0.isEmpty()) {
         return ui.i();
      } else if ($$0.size() == 1) {
         return $$2.apply((T)$$0.iterator().next()).f();
      } else {
         uw $$3 = ui.i();
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

   public static uw a(ui $$0) {
      return ui.a("chat.square_brackets", $$0);
   }

   public static ui a(Message $$0) {
      return (ui)($$0 instanceof ui ? (ui)$$0 : ui.b($$0.getString()));
   }

   public static boolean b(@Nullable ui $$0) {
      if ($$0 != null && $$0.b() instanceof vt $$1) {
         String $$2 = $$1.b();
         String $$3 = $$1.c();
         return $$3 != null || ro.a().b($$2);
      } else {
         return true;
      }
   }

   public static uw a(String $$0) {
      return a((ui)ui.b($$0).a($$1 -> $$1.a(n.k).a(new ug(ug.a.f, $$0)).a(new uo(uo.a.a, ui.c("chat.copy.click"))).a($$0)));
   }
}
