import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class fvh {
   private final Map<aju<? extends ja<?>>, avw.a> a = new HashMap<>();

   public void a(aju<? extends ja<?>> $$0, avw.a $$1) {
      this.a.put($$0, $$1);
   }

   private static void a() {
      cqe.e().n();
   }

   private static void b() {
      dmc.f();
      dcj.a();
   }

   private void a(jb $$0, Predicate<aju<? extends ja<?>>> $$1) {
      this.a.forEach(($$2, $$3) -> {
         if ($$1.test((aju<? extends ja<?>>)$$2)) {
            $$3.a($$0.d((aju<? extends ja<?>>)$$2));
         }
      });
   }

   public void a(jb $$0, boolean $$1) {
      if ($$1) {
         this.a($$0, je.a::contains);
      } else {
         $$0.c().filter($$0x -> !je.a.contains($$0x.a())).forEach($$0x -> $$0x.b().m());
         this.a($$0, $$0x -> true);
         b();
      }

      a();
   }
}
