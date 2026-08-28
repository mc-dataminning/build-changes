import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gkz {
   @Nullable
   private gkz.a a;
   @Nullable
   private gkz.b b;

   public void a(alf<? extends js<?>> $$0, List<jw.a> $$1) {
      if (this.a == null) {
         this.a = new gkz.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alf<? extends js<?>>, axt.a> $$0) {
      if (this.b == null) {
         this.b = new gkz.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> js.a<T> a(jt.b $$0, alf<? extends js<? extends T>> $$1, axt.a $$2) {
      js<T> $$3 = $$0.f($$1);
      return $$3.a($$2.a($$3));
   }

   private jt a(avg $$0, gkz.a $$1, boolean $$2) {
      jm<gko> $$3 = gko.a();
      jt.b $$4 = $$3.b(gko.b);
      Map<alf<? extends js<?>>, alb.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new alb.c($$2x, axt.a.a)));
      List<js.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (jw.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<jw.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new alb.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jh.b<?>> $$7 = axs.a($$4, $$6);

      jt.b $$8;
      try {
         $$8 = alb.a($$5, $$0, $$7, alb.c).e();
      } catch (Exception var13) {
         p $$10 = p.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new aa($$10);
      }

      jt $$12 = $$3.a(gko.b, $$8).a();
      $$6.forEach(js.a::d);
      return $$12;
   }

   private static void a(p $$0, Map<alf<? extends js<?>>, alb.c> $$1, List<js.a<?>> $$2) {
      q $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
               .stream()
               .sorted(Comparator.comparing($$0xx -> ((alf)$$0xx.getKey()).a()))
               .map(
                  $$0xx -> String.format(
                        Locale.ROOT,
                        "\n\t\t%s: elements=%d tags=%d",
                        ((alf)$$0xx.getKey()).a(),
                        ((alb.c)$$0xx.getValue()).a().size(),
                        ((alb.c)$$0xx.getValue()).b().b()
                     )
               )
               .collect(Collectors.joining())
      );
      $$3.a(
         "Static Registries",
         () -> $$2.stream()
               .sorted(Comparator.comparing($$0xx -> $$0xx.a().a()))
               .map($$0xx -> String.format(Locale.ROOT, "\n\t\t%s: tags=%d", $$0xx.a().a(), $$0xx.b()))
               .collect(Collectors.joining())
      );
   }

   private void a(gkz.b $$0, jt.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || jw.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public jt.b a(avg $$0, jt.b $$1, boolean $$2) {
      jt $$3;
      if (this.a != null) {
         $$3 = this.a($$0, this.a, $$2);
      } else {
         if (this.b != null) {
            this.a(this.b, $$1, !$$2);
         }

         $$3 = $$1;
      }

      return $$3.e();
   }

   static class a {
      final Map<alf<? extends js<?>>, List<jw.a>> a = new HashMap<>();

      public void a(alf<? extends js<?>> $$0, List<jw.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alf<? extends js<?>>, axt.a> a = new HashMap<>();

      public void a(alf<? extends js<?>> $$0, axt.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alf<? extends js<?>>, ? super axt.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
