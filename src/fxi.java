import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fxi {
   private final Map<akl<? extends jk<?>>, awo.a> a = new HashMap<>();

   public void a(akl<? extends jk<?>> $$0, awo.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      csa.e().n();
   }

   private static void b() {
      dnu.f();
      dea.a();
   }

   private void a(jl $$0, Predicate<akl<? extends jk<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((akl<? extends jk<?>>)$$2)) {
            $$3.a($$0.d((akl<? extends jk<?>>)$$2));
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
