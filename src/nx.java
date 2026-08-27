import java.util.LinkedHashMap;
import java.util.Map;

public class nx {
   private final np a;
   private final cvg b;
   private final cvg c;
   private final cvg d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nx(np $$0, cvg $$1, cvg $$2, cvg $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nx a(cvg $$0, cvg $$1, cvg $$2, np $$3) {
      return new nx($$3, $$0, $$1, $$2);
   }

   public nx a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(nq $$0, ajt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cwb $$3 = new cwb(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(ajt $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
