import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gjr {
   @Nullable
   private gjr.a a;
   @Nullable
   private gjr.b b;

   public void a(ald<? extends jr<?>> $$0, List<jv.a> $$1) {
      if (this.a == null) {
         this.a = new gjr.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ald<? extends jr<?>>, axr.a> $$0) {
      if (this.b == null) {
         this.b = new gjr.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> jr.a<T> a(js.b $$0, ald<? extends jr<? extends T>> $$1, axr.a $$2) {
      jr<T> $$3 = $$0.f($$1);
      return $$3.a($$2.a($$3));
   }

   private js a(ave $$0, gjr.a $$1, boolean $$2) {
      jl<gjg> $$3 = gjg.a();
      js.b $$4 = $$3.b(gjg.b);
      Map<ald<? extends jr<?>>, akz.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new akz.c($$2x, axr.a.a)));
      List<jr.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (jv.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<jv.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new akz.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jg.b<?>> $$7 = axq.a($$4, $$6);

      js.b $$8;
      try {
         $$8 = akz.a($$5, $$0, $$7, akz.c).e();
      } catch (Exception var13) {
         o $$10 = o.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new z($$10);
      }

      js $$12 = $$3.a(gjg.b, $$8).a();
      $$6.forEach(jr.a::d);
      return $$12;
   }

   private static void a(o $$0, Map<ald<? extends jr<?>>, akz.c> $$1, List<jr.a<?>> $$2) {
      p $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
               .stream()
               .sorted(Comparator.comparing($$0xx -> ((ald)$$0xx.getKey()).a()))
               .map(
                  $$0xx -> String.format(
                        Locale.ROOT,
                        "\n\t\t%s: elements=%d tags=%d",
                        ((ald)$$0xx.getKey()).a(),
                        ((akz.c)$$0xx.getValue()).a().size(),
                        ((akz.c)$$0xx.getValue()).b().b()
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

   private void a(gjr.b $$0, js.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || jv.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public js.b a(ave $$0, js.b $$1, boolean $$2) {
      js $$3;
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
      final Map<ald<? extends jr<?>>, List<jv.a>> a = new HashMap<>();

      public void a(ald<? extends jr<?>> $$0, List<jv.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<ald<? extends jr<?>>, axr.a> a = new HashMap<>();

      public void a(ald<? extends jr<?>> $$0, axr.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super ald<? extends jr<?>>, ? super axr.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
