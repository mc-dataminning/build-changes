import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fwn {
   private final Map<akg<? extends jj<?>>, awj.a> a = new HashMap<>();

   public void a(akg<? extends jj<?>> $$0, awj.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      crl.e().n();
   }

   private static void b() {
      dna.f();
      ddg.a();
   }

   private void a(jk $$0, Predicate<akg<? extends jj<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((akg<? extends jj<?>>)$$2)) {
            $$3.a($$0.d((akg<? extends jj<?>>)$$2));
         }
      });
   }

   public void a(jk $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, jn.a::contains);
      } else {
         $$0.c().filter($$0x -> !jn.a.contains($$0x.a())).forEach($$0x -> $$0x.b().m());
         this.a($$0, $$0x -> true);
         b();
      }

      a();
   }
}
