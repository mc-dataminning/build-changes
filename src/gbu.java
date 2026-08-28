import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class gbu {
   @Nullable
   private gbu.a a;
   @Nullable
   private gbu.b b;

   public void a(alb<? extends ka<?>> $$0, List<ke.a> $$1) {
      if (this.a == null) {
         this.a = new gbu.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<alb<? extends ka<?>>, axl.a> $$0) {
      if (this.b == null) {
         this.b = new gbu.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> ka.a<T> a(kb.b $$0, alb<? extends ka<? extends T>> $$1, axl.a $$2) {
      ka<T> $$3 = $$0.d($$1);
      return $$3.a($$2.a($$3));
   }

   private kb a(auw $$0, gbu.a $$1, boolean $$2) {
      ju<gbj> $$3 = gbj.a();
      kb.b $$4 = $$3.b(gbj.b);
      Map<alb<? extends ka<?>>, akx.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new akx.c($$2x, axl.a.a)));
      List<ka.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (ke.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<ke.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new akx.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jp.b<?>> $$7 = axk.a($$4, $$6);
      kb.b $$8 = akx.a($$5, $$0, $$7, akx.c).f();
      kb $$9 = $$3.a(gbj.b, $$8).a();
      $$6.forEach(ka.a::c);
      return $$9;
   }

   private void a(gbu.b $$0, kb.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || ke.a($$2x)) {
            a($$1, $$2x, $$3).c();
         }
      });
   }

   public kb.b a(auw $$0, kb.b $$1, boolean $$2) {
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
      final Map<alb<? extends ka<?>>, List<ke.a>> a = new HashMap<>();

      public void a(alb<? extends ka<?>> $$0, List<ke.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<alb<? extends ka<?>>, axl.a> a = new HashMap<>();

      public void a(alb<? extends ka<?>> $$0, axl.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super alb<? extends ka<?>>, ? super axl.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
