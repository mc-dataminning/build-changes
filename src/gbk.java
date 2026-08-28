import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class gbk {
   @Nullable
   private gbk.a a;
   @Nullable
   private gbk.b b;

   public void a(ala<? extends ka<?>> $$0, List<ke.a> $$1) {
      if (this.a == null) {
         this.a = new gbk.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ala<? extends ka<?>>, axk.a> $$0) {
      if (this.b == null) {
         this.b = new gbk.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> ka.a<T> a(kb.b $$0, ala<? extends ka<? extends T>> $$1, axk.a $$2) {
      ka<T> $$3 = $$0.d($$1);
      return $$3.a($$2.a($$3));
   }

   private kb a(auv $$0, gbk.a $$1, boolean $$2) {
      ju<gaz> $$3 = gaz.a();
      kb.b $$4 = $$3.b(gaz.b);
      Map<ala<? extends ka<?>>, akw.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new akw.c($$2x, axk.a.a)));
      List<ka.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (ke.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<ke.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new akw.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jp.b<?>> $$7 = axj.a($$4, $$6);
      kb.b $$8 = akw.a($$5, $$0, $$7, akw.c).f();
      kb $$9 = $$3.a(gaz.b, $$8).a();
      $$6.forEach(ka.a::c);
      return $$9;
   }

   private void a(gbk.b $$0, kb.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || ke.a($$2x)) {
            a($$1, $$2x, $$3).c();
         }
      });
   }

   public kb.b a(auv $$0, kb.b $$1, boolean $$2) {
      kb $$3;
      if (this.a != null) {
         $$3 = this.a($$0, this.a, $$2);
      } else {
         if (this.b != null) {
            this.a(this.b, $$1, !$$2);
         }

         $$3 = $$1;
      }

      return $$3.f();
   }

   static class a {
      final Map<ala<? extends ka<?>>, List<ke.a>> a = new HashMap<>();

      public void a(ala<? extends ka<?>> $$0, List<ke.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<ala<? extends ka<?>>, axk.a> a = new HashMap<>();

      public void a(ala<? extends ka<?>> $$0, axk.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super ala<? extends ka<?>>, ? super axk.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
