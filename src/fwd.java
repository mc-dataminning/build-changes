import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fwd {
   private final Map<ake<? extends ji<?>>, awg.a> a = new HashMap<>();

   public void a(ake<? extends ji<?>> $$0, awg.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      cqp.e().n();
   }

   private static void b() {
      dmr.f();
      dcx.a();
   }

   private void a(jj $$0, Predicate<ake<? extends ji<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((ake<? extends ji<?>>)$$2)) {
            $$3.a($$0.d((ake<? extends ji<?>>)$$2));
         }
      });
   }

   public void a(jj $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, jm.a::contains);
      } else {
         $$0.c().filter($$0x -> !jm.a.contains($$0x.a())).forEach($$0x -> $$0x.b().m());
         this.a($$0, $$0x -> true);
         b();
      }

      a();
   }
}
