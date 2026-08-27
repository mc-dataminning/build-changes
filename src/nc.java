import java.util.LinkedHashMap;
import java.util.Map;

public class nc {
   private final cps a;
   private final cps b;
   private final cps c;
   private final mv d;
   private final cmm e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public nc(cps $$0, cps $$1, cps $$2, mv $$3, cmm $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static nc a(cps $$0, cps $$1, cps $$2, mv $$3, cmm $$4) {
      return new nc($$0, $$1, $$2, $$3, $$4);
   }

   public nc a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(mw $$0, String $$1) {
      this.a($$0, new ahd($$1));
   }

   public void a(mw $$0, ahd $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cqm $$3 = new cqm(this.a, this.b, this.c, new cmr(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(ahd $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
