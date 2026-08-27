import java.util.LinkedHashMap;
import java.util.Map;

public class nz {
   private final nr a;
   private final cvp b;
   private final cvp c;
   private final cvp d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nz(nr $$0, cvp $$1, cvp $$2, cvp $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nz a(cvp $$0, cvp $$1, cvp $$2, nr $$3) {
      return new nz($$3, $$0, $$1, $$2);
   }

   public nz a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ns $$0, ajv $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cwk $$3 = new cwk(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(ajv $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
