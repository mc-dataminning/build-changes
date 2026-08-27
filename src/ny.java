import java.util.LinkedHashMap;
import java.util.Map;

public class ny {
   private final cvp a;
   private final cvp b;
   private final cvp c;
   private final nr d;
   private final crn e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ny(cvp $$0, cvp $$1, cvp $$2, nr $$3, crn $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ny a(cvp $$0, cvp $$1, cvp $$2, nr $$3, crn $$4) {
      return new ny($$0, $$1, $$2, $$3, $$4);
   }

   public ny a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ns $$0, String $$1) {
      this.a($$0, new ajv($$1));
   }

   public void a(ns $$0, ajv $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cwj $$3 = new cwj(this.a, this.b, this.c, new crs(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(ajv $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
