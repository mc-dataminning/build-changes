import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gft {
   @Nullable
   private gft.a a;
   @Nullable
   private gft.b b;

   public void a(alo<? extends kd<?>> $$0, List<kh.a> $$1) {
      if (this.a == null) {
         this.a = new gft.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alo<? extends kd<?>>, ayc.a> $$0) {
      if (this.b == null) {
         this.b = new gft.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> kd.a<T> a(ke.b $$0, alo<? extends kd<? extends T>> $$1, ayc.a $$2) {
      kd<T> $$3 = $$0.e($$1);
      return $$3.a($$2.a($$3));
   }

   private ke a(avo $$0, gft.a $$1, boolean $$2) {
      jx<gfi> $$3 = gfi.a();
      ke.b $$4 = $$3.b(gfi.b);
      Map<alo<? extends kd<?>>, alk.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new alk.c($$2x, ayc.a.a)));
      List<kd.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (kh.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<kh.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new alk.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<js.b<?>> $$7 = ayb.a($$4, $$6);

      ke.b $$8;
      try {
         $$8 = alk.a($$5, $$0, $$7, alk.c).e();
      } catch (Exception var13) {
         o $$10 = o.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new z($$10);
      }

      ke $$12 = $$3.a(gfi.b, $$8).a();
      $$6.forEach(kd.a::d);
      return $$12;
   }

   private static void a(o $$0, Map<alo<? extends kd<?>>, alk.c> $$1, List<kd.a<?>> $$2) {
      p $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
               .stream()
               .sorted(Comparator.comparing($$0xx -> ((alo)$$0xx.getKey()).a()))
               .map(
                  $$0xx -> String.format(
                        Locale.ROOT,
                        "\n\t\t%s: elements=%d tags=%d",
                        ((alo)$$0xx.getKey()).a(),
                        ((alk.c)$$0xx.getValue()).a().size(),
                        ((alk.c)$$0xx.getValue()).b().b()
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

   private void a(gft.b $$0, ke.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || kh.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public ke.b a(avo $$0, ke.b $$1, boolean $$2) {
      ke $$3;
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
      final Map<alo<? extends kd<?>>, List<kh.a>> a = new HashMap<>();

      public void a(alo<? extends kd<?>> $$0, List<kh.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alo<? extends kd<?>>, ayc.a> a = new HashMap<>();

      public void a(alo<? extends kd<?>> $$0, ayc.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alo<? extends kd<?>>, ? super ayc.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
