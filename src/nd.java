import java.util.LinkedHashMap;
import java.util.Map;

public class nd {
   private final mv a;
   private final cps b;
   private final cps c;
   private final cps d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nd(mv $$0, cps $$1, cps $$2, cps $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nd a(cps $$0, cps $$1, cps $$2, mv $$3) {
      return new nd($$3, $$0, $$1, $$2);
   }

   public nd a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(mw $$0, ahd $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cqn $$3 = new cqn(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(ahd $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
