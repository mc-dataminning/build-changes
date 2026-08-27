import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fuy {
   private final Map<ajs<? extends iy<?>>, avu.a> a = new HashMap<>();

   public void a(ajs<? extends iy<?>> $$0, avu.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      cpv.e().n();
   }

   private static void b() {
      dlt.f();
      dca.a();
   }

   private void a(iz $$0, Predicate<ajs<? extends iy<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((ajs<? extends iy<?>>)$$2)) {
            $$3.a($$0.d((ajs<? extends iy<?>>)$$2));
         }
      });
   }

   public void a(iz $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, jc.a::contains);
      } else {
         $$0.c().filter($$0x -> !jc.a.contains($$0x.a())).forEach($$0x -> $$0x.b().m());
         this.a($$0, $$0x -> true);
         b();
      }

      a();
   }
}
