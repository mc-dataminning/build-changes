import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gin {
   @Nullable
   private gin.a a;
   @Nullable
   private gin.b b;

   public void a(alc<? extends kf<?>> $$0, List<kj.a> $$1) {
      if (this.a == null) {
         this.a = new gin.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alc<? extends kf<?>>, axr.a> $$0) {
      if (this.b == null) {
         this.b = new gin.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> kf.a<T> a(kg.b $$0, alc<? extends kf<? extends T>> $$1, axr.a $$2) {
      kf<T> $$3 = $$0.f($$1);
      return $$3.a($$2.a($$3));
   }

   private kg a(avd $$0, gin.a $$1, boolean $$2) {
      jz<gic> $$3 = gic.a();
      kg.b $$4 = $$3.b(gic.b);
      Map<alc<? extends kf<?>>, aky.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new aky.c($$2x, axr.a.a)));
      List<kf.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (kj.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<kj.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new aky.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<ju.b<?>> $$7 = axq.a($$4, $$6);

      kg.b $$8;
      try {
         $$8 = aky.a($$5, $$0, $$7, aky.c).e();
      } catch (Exception var13) {
         o $$10 = o.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new z($$10);
      }

      kg $$12 = $$3.a(gic.b, $$8).a();
      $$6.forEach(kf.a::d);
      return $$12;
   }

   private static void a(o $$0, Map<alc<? extends kf<?>>, aky.c> $$1, List<kf.a<?>> $$2) {
      p $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
               .stream()
               .sorted(Comparator.comparing($$0xx -> ((alc)$$0xx.getKey()).a()))
               .map(
                  $$0xx -> String.format(
                        Locale.ROOT,
                        "\n\t\t%s: elements=%d tags=%d",
                        ((alc)$$0xx.getKey()).a(),
                        ((aky.c)$$0xx.getValue()).a().size(),
                        ((aky.c)$$0xx.getValue()).b().b()
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

   private void a(gin.b $$0, kg.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || kj.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public kg.b a(avd $$0, kg.b $$1, boolean $$2) {
      kg $$3;
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
      final Map<alc<? extends kf<?>>, List<kj.a>> a = new HashMap<>();

      public void a(alc<? extends kf<?>> $$0, List<kj.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alc<? extends kf<?>>, axr.a> a = new HashMap<>();

      public void a(alc<? extends kf<?>> $$0, axr.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alc<? extends kf<?>>, ? super axr.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
