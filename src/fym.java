import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fym {
   private final Map<ale<? extends jv<?>>, axi.a> a = new HashMap<>();

   public void a(ale<? extends jv<?>> $$0, axi.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      ctb.e().n();
   }

   private static void b() {
      dov.f();
      dfb.a();
   }

   private void a(jw $$0, Predicate<ale<? extends jv<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((ale<? extends jv<?>>)$$2)) {
            $$3.a($$0.d((ale<? extends jv<?>>)$$2));
         }
      });
   }

   public void a(jw $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, jz.a::contains);
      } else {
         $$0.c().filter($$0x -> !jz.a.contains($$0x.a())).forEach($$0x -> $$0x.b().m());
         this.a($$0, $$0x -> true);
         b();
      }

      a();
   }
}
