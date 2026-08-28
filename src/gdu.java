import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class gdu {
   @Nullable
   private gdu.a a;
   @Nullable
   private gdu.b b;

   public void a(ali<? extends kd<?>> $$0, List<kh.a> $$1) {
      if (this.a == null) {
         this.a = new gdu.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ali<? extends kd<?>>, axu.a> $$0) {
      if (this.b == null) {
         this.b = new gdu.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> kd.a<T> a(ke.b $$0, ali<? extends kd<? extends T>> $$1, axu.a $$2) {
      kd<T> $$3 = $$0.e($$1);
      return $$3.a($$2.a($$3));
   }

   private ke a(avg $$0, gdu.a $$1, boolean $$2) {
      jx<gdj> $$3 = gdj.a();
      ke.b $$4 = $$3.b(gdj.b);
      Map<ali<? extends kd<?>>, ale.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new ale.c($$2x, axu.a.a)));
      List<kd.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (kh.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<kh.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new ale.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<js.b<?>> $$7 = axt.a($$4, $$6);
      ke.b $$8 = ale.a($$5, $$0, $$7, ale.c).e();
      ke $$9 = $$3.a(gdj.b, $$8).a();
      $$6.forEach(kd.a::c);
      return $$9;
   }

   private void a(gdu.b $$0, ke.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || kh.a($$2x)) {
            a($$1, $$2x, $$3).c();
         }
      });
   }

   public ke.b a(avg $$0, ke.b $$1, boolean $$2) {
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
      final Map<ali<? extends kd<?>>, List<kh.a>> a = new HashMap<>();

      public void a(ali<? extends kd<?>> $$0, List<kh.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<ali<? extends kd<?>>, axu.a> a = new HashMap<>();

      public void a(ali<? extends kd<?>> $$0, axu.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super ali<? extends kd<?>>, ? super axu.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
