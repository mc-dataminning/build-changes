import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class gck {
   @Nullable
   private gck.a a;
   @Nullable
   private gck.b b;

   public void a(alg<? extends kc<?>> $$0, List<kg.a> $$1) {
      if (this.a == null) {
         this.a = new gck.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alg<? extends kc<?>>, axr.a> $$0) {
      if (this.b == null) {
         this.b = new gck.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> kc.a<T> a(kd.b $$0, alg<? extends kc<? extends T>> $$1, axr.a $$2) {
      kc<T> $$3 = $$0.e($$1);
      return $$3.a($$2.a($$3));
   }

   private kd a(avd $$0, gck.a $$1, boolean $$2) {
      jw<gbz> $$3 = gbz.a();
      kd.b $$4 = $$3.b(gbz.b);
      Map<alg<? extends kc<?>>, alc.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new alc.c($$2x, axr.a.a)));
      List<kc.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (kg.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<kg.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new alc.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jr.b<?>> $$7 = axq.a($$4, $$6);
      kd.b $$8 = alc.a($$5, $$0, $$7, alc.c).e();
      kd $$9 = $$3.a(gbz.b, $$8).a();
      $$6.forEach(kc.a::c);
      return $$9;
   }

   private void a(gck.b $$0, kd.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || kg.a($$2x)) {
            a($$1, $$2x, $$3).c();
         }
      });
   }

   public kd.b a(avd $$0, kd.b $$1, boolean $$2) {
      kd $$3;
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
      final Map<alg<? extends kc<?>>, List<kg.a>> a = new HashMap<>();

      public void a(alg<? extends kc<?>> $$0, List<kg.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alg<? extends kc<?>>, axr.a> a = new HashMap<>();

      public void a(alg<? extends kc<?>> $$0, axr.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alg<? extends kc<?>>, ? super axr.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
