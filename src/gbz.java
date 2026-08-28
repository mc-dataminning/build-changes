import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class gbz {
   @Nullable
   private gbz.a a;
   @Nullable
   private gbz.b b;

   public void a(ald<? extends kb<?>> $$0, List<kf.a> $$1) {
      if (this.a == null) {
         this.a = new gbz.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ald<? extends kb<?>>, axn.a> $$0) {
      if (this.b == null) {
         this.b = new gbz.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> kb.a<T> a(kc.b $$0, ald<? extends kb<? extends T>> $$1, axn.a $$2) {
      kb<T> $$3 = $$0.e($$1);
      return $$3.a($$2.a($$3));
   }

   private kc a(auz $$0, gbz.a $$1, boolean $$2) {
      jv<gbo> $$3 = gbo.a();
      kc.b $$4 = $$3.b(gbo.b);
      Map<ald<? extends kb<?>>, akz.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new akz.c($$2x, axn.a.a)));
      List<kb.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (kf.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<kf.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new akz.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jq.b<?>> $$7 = axm.a($$4, $$6);
      kc.b $$8 = akz.a($$5, $$0, $$7, akz.c).e();
      kc $$9 = $$3.a(gbo.b, $$8).a();
      $$6.forEach(kb.a::c);
      return $$9;
   }

   private void a(gbz.b $$0, kc.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || kf.a($$2x)) {
            a($$1, $$2x, $$3).c();
         }
      });
   }

   public kc.b a(auz $$0, kc.b $$1, boolean $$2) {
      kc $$3;
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
      final Map<ald<? extends kb<?>>, List<kf.a>> a = new HashMap<>();

      public void a(ald<? extends kb<?>> $$0, List<kf.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<ald<? extends kb<?>>, axn.a> a = new HashMap<>();

      public void a(ald<? extends kb<?>> $$0, axn.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super ald<? extends kb<?>>, ? super axn.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
