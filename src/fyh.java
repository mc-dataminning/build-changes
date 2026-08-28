import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fyh {
   private final Map<ala<? extends jv<?>>, axe.a> a = new HashMap<>();

   public void a(ala<? extends jv<?>> $$0, axe.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      csw.e().n();
   }

   private static void b() {
      doq.f();
      dew.a();
   }

   private void a(jw $$0, Predicate<ala<? extends jv<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((ala<? extends jv<?>>)$$2)) {
            $$3.a($$0.d((ala<? extends jv<?>>)$$2));
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
