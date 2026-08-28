import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fzr {
   private final Map<akp<? extends jz<?>>, aww.a> a = new HashMap<>();

   public void a(akp<? extends jz<?>> $$0, aww.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      dpt.f();
      dfy.a();
   }

   private void a(ka $$0, Predicate<akp<? extends jz<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((akp<? extends jz<?>>)$$2)) {
            $$3.a($$0.d((akp<? extends jz<?>>)$$2));
         }
      });
   }

   public void a(ka $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, kd.a::contains);
      } else {
         $$0.c().filter($$0x -> !kd.a.contains($$0x.a())).forEach($$0x -> $$0x.b().n());
         this.a($$0, $$0x -> true);
         a();
      }
   }
}
