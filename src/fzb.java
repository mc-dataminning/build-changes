import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fzb {
   private final Map<akj<? extends jw<?>>, awp.a> a = new HashMap<>();

   public void a(akj<? extends jw<?>> $$0, awp.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      dpd.f();
      dfj.a();
   }

   private void a(jx $$0, Predicate<akj<? extends jw<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((akj<? extends jw<?>>)$$2)) {
            $$3.a($$0.d((akj<? extends jw<?>>)$$2));
         }
      });
   }

   public void a(jx $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, ka.a::contains);
      } else {
         $$0.c().filter($$0x -> !ka.a.contains($$0x.a())).forEach($$0x -> $$0x.b().n());
         this.a($$0, $$0x -> true);
         a();
      }
   }
}
