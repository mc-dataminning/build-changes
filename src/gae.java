import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class gae {
   private final Map<aks<? extends jn<?>>, aww.a> a = new HashMap<>();

   public void a(aks<? extends jn<?>> $$0, aww.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      csr.e().n();
   }

   private static void b() {
      dpp.f();
      dfe.a();
   }

   private void a(jo $$0, Predicate<aks<? extends jn<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((aks<? extends jn<?>>)$$2)) {
            $$3.a($$0.d((aks<? extends jn<?>>)$$2));
         }
      });
   }

   public void a(jo $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, jr.a::contains);
      } else {
         $$0.c().filter($$0x -> !jr.a.contains($$0x.a())).forEach($$0x -> $$0x.b().m());
         this.a($$0, $$0x -> true);
         b();
      }

      a();
   }
}
