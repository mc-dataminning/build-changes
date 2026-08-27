import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fxi {
   private final Map<akm<? extends jk<?>>, awp.a> a = new HashMap<>();

   public void a(akm<? extends jk<?>> $$0, awp.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      csc.e().n();
   }

   private static void b() {
      dnw.f();
      dec.a();
   }

   private void a(jl $$0, Predicate<akm<? extends jk<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((akm<? extends jk<?>>)$$2)) {
            $$3.a($$0.d((akm<? extends jk<?>>)$$2));
         }
      });
   }

   public void a(jl $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, jo.a::contains);
      } else {
         $$0.c().filter($$0x -> !jo.a.contains($$0x.a())).forEach($$0x -> $$0x.b().m());
         this.a($$0, $$0x -> true);
         b();
      }

      a();
   }
}
