import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gmr {
   @Nullable
   private gmr.a a;
   @Nullable
   private gmr.b b;

   public void a(alj<? extends jt<?>> $$0, List<jx.a> $$1) {
      if (this.a == null) {
         this.a = new gmr.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alj<? extends jt<?>>, axx.a> $$0) {
      if (this.b == null) {
         this.b = new gmr.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> jt.a<T> a(ju.b $$0, alj<? extends jt<? extends T>> $$1, axx.a $$2) {
      jt<T> $$3 = $$0.f($$1);
      return $$3.a($$2.a($$3));
   }

   private ju a(avk $$0, gmr.a $$1, boolean $$2) {
      jn<gmg> $$3 = gmg.a();
      ju.b $$4 = $$3.b(gmg.b);
      Map<alj<? extends jt<?>>, alf.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new alf.c($$2x, axx.a.a)));
      List<jt.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (jx.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<jx.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new alf.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<ji.b<?>> $$7 = axw.a($$4, $$6);

      ju.b $$8;
      try {
         $$8 = alf.a($$5, $$0, $$7, alf.c).e();
      } catch (Exception var13) {
         p $$10 = p.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new aa($$10);
      }

      ju $$12 = $$3.a(gmg.b, $$8).a();
      $$6.forEach(jt.a::d);
      return $$12;
   }

   private static void a(p $$0, Map<alj<? extends jt<?>>, alf.c> $$1, List<jt.a<?>> $$2) {
      q $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
               .stream()
               .sorted(Comparator.comparing($$0xx -> ((alj)$$0xx.getKey()).a()))
               .map(
                  $$0xx -> String.format(
                        Locale.ROOT,
                        "\n\t\t%s: elements=%d tags=%d",
                        ((alj)$$0xx.getKey()).a(),
                        ((alf.c)$$0xx.getValue()).a().size(),
                        ((alf.c)$$0xx.getValue()).b().b()
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

   private void a(gmr.b $$0, ju.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || jx.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public ju.b a(avk $$0, ju.b $$1, boolean $$2) {
      ju $$3;
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
      final Map<alj<? extends jt<?>>, List<jx.a>> a = new HashMap<>();

      public void a(alj<? extends jt<?>> $$0, List<jx.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alj<? extends jt<?>>, axx.a> a = new HashMap<>();

      public void a(alj<? extends jt<?>> $$0, axx.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alj<? extends jt<?>>, ? super axx.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
