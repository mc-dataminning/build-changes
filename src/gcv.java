import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class gcv {
   @Nullable
   private gcv.a a;
   @Nullable
   private gcv.b b;

   public void a(alh<? extends kd<?>> $$0, List<kh.a> $$1) {
      if (this.a == null) {
         this.a = new gcv.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alh<? extends kd<?>>, axs.a> $$0) {
      if (this.b == null) {
         this.b = new gcv.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> kd.a<T> a(ke.b $$0, alh<? extends kd<? extends T>> $$1, axs.a $$2) {
      kd<T> $$3 = $$0.e($$1);
      return $$3.a($$2.a($$3));
   }

   private ke a(ave $$0, gcv.a $$1, boolean $$2) {
      jx<gck> $$3 = gck.a();
      ke.b $$4 = $$3.b(gck.b);
      Map<alh<? extends kd<?>>, ald.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new ald.c($$2x, axs.a.a)));
      List<kd.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (kh.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<kh.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new ald.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<js.b<?>> $$7 = axr.a($$4, $$6);
      ke.b $$8 = ald.a($$5, $$0, $$7, ald.c).e();
      ke $$9 = $$3.a(gck.b, $$8).a();
      $$6.forEach(kd.a::c);
      return $$9;
   }

   private void a(gcv.b $$0, ke.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || kh.a($$2x)) {
            a($$1, $$2x, $$3).c();
         }
      });
   }

   public ke.b a(ave $$0, ke.b $$1, boolean $$2) {
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
      final Map<alh<? extends kd<?>>, List<kh.a>> a = new HashMap<>();

      public void a(alh<? extends kd<?>> $$0, List<kh.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alh<? extends kd<?>>, axs.a> a = new HashMap<>();

      public void a(alh<? extends kd<?>> $$0, axs.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alh<? extends kd<?>>, ? super axs.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
