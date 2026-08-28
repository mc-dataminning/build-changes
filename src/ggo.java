import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ggo {
   @Nullable
   private ggo.a a;
   @Nullable
   private ggo.b b;

   public void a(aku<? extends ke<?>> $$0, List<ki.a> $$1) {
      if (this.a == null) {
         this.a = new ggo.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<aku<? extends ke<?>>, axh.a> $$0) {
      if (this.b == null) {
         this.b = new ggo.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> ke.a<T> a(kf.b $$0, aku<? extends ke<? extends T>> $$1, axh.a $$2) {
      ke<T> $$3 = $$0.e($$1);
      return $$3.a($$2.a($$3));
   }

   private kf a(aus $$0, ggo.a $$1, boolean $$2) {
      jy<ggd> $$3 = ggd.a();
      kf.b $$4 = $$3.b(ggd.b);
      Map<aku<? extends ke<?>>, akq.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new akq.c($$2x, axh.a.a)));
      List<ke.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (ki.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<ki.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new akq.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jt.b<?>> $$7 = axg.a($$4, $$6);

      kf.b $$8;
      try {
         $$8 = akq.a($$5, $$0, $$7, akq.c).e();
      } catch (Exception var13) {
         o $$10 = o.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new z($$10);
      }

      kf $$12 = $$3.a(ggd.b, $$8).a();
      $$6.forEach(ke.a::d);
      return $$12;
   }

   private static void a(o $$0, Map<aku<? extends ke<?>>, akq.c> $$1, List<ke.a<?>> $$2) {
      p $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
               .stream()
               .sorted(Comparator.comparing($$0xx -> ((aku)$$0xx.getKey()).a()))
               .map(
                  $$0xx -> String.format(
                        Locale.ROOT,
                        "\n\t\t%s: elements=%d tags=%d",
                        ((aku)$$0xx.getKey()).a(),
                        ((akq.c)$$0xx.getValue()).a().size(),
                        ((akq.c)$$0xx.getValue()).b().b()
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

   private void a(ggo.b $$0, kf.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || ki.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public kf.b a(aus $$0, kf.b $$1, boolean $$2) {
      kf $$3;
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
      final Map<aku<? extends ke<?>>, List<ki.a>> a = new HashMap<>();

      public void a(aku<? extends ke<?>> $$0, List<ki.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<aku<? extends ke<?>>, axh.a> a = new HashMap<>();

      public void a(aku<? extends ke<?>> $$0, axh.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super aku<? extends ke<?>>, ? super axh.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
