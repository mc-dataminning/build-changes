import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gmp {
   @Nullable
   private gmp.a a;
   @Nullable
   private gmp.b b;

   public void a(alh<? extends js<?>> $$0, List<jw.a> $$1) {
      if (this.a == null) {
         this.a = new gmp.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alh<? extends js<?>>, axv.a> $$0) {
      if (this.b == null) {
         this.b = new gmp.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> js.a<T> a(jt.b $$0, alh<? extends js<? extends T>> $$1, axv.a $$2) {
      js<T> $$3 = $$0.f($$1);
      return $$3.a($$2.a($$3));
   }

   private jt a(avi $$0, gmp.a $$1, boolean $$2) {
      jm<gme> $$3 = gme.a();
      jt.b $$4 = $$3.b(gme.b);
      Map<alh<? extends js<?>>, ald.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new ald.c($$2x, axv.a.a)));
      List<js.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (jw.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<jw.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new ald.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jh.b<?>> $$7 = axu.a($$4, $$6);

      jt.b $$8;
      try {
         $$8 = ald.a($$5, $$0, $$7, ald.c).e();
      } catch (Exception var13) {
         p $$10 = p.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new aa($$10);
      }

      jt $$12 = $$3.a(gme.b, $$8).a();
      $$6.forEach(js.a::d);
      return $$12;
   }

   private static void a(p $$0, Map<alh<? extends js<?>>, ald.c> $$1, List<js.a<?>> $$2) {
      q $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
               .stream()
               .sorted(Comparator.comparing($$0xx -> ((alh)$$0xx.getKey()).a()))
               .map(
                  $$0xx -> String.format(
                        Locale.ROOT,
                        "\n\t\t%s: elements=%d tags=%d",
                        ((alh)$$0xx.getKey()).a(),
                        ((ald.c)$$0xx.getValue()).a().size(),
                        ((ald.c)$$0xx.getValue()).b().b()
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

   private void a(gmp.b $$0, jt.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || jw.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public jt.b a(avi $$0, jt.b $$1, boolean $$2) {
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
      final Map<alh<? extends js<?>>, List<jw.a>> a = new HashMap<>();

      public void a(alh<? extends js<?>> $$0, List<jw.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alh<? extends js<?>>, axv.a> a = new HashMap<>();

      public void a(alh<? extends js<?>> $$0, axv.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alh<? extends js<?>>, ? super axv.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
