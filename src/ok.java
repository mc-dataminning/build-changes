import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ok {
   private final oc a;
   private final dch b;
   private final dch c;
   private final dch d;
   private final Map<String, aq<?>> e = new LinkedHashMap<>();

   public ok(oc $$0, dch $$1, dch $$2, dch $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ok a(dch $$0, dch $$1, dch $$2, oc $$3) {
      return new ok($$3, $$0, $$1, $$2);
   }

   public ok a(String $$0, aq<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(od $$0, alc<dcl<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.e.forEach($$2::a);
      ddj $$3 = new ddj(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(alc<dcl<?>> $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
