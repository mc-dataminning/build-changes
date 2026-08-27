import java.util.LinkedHashMap;
import java.util.Map;

public class ni {
   private final csp a;
   private final csp b;
   private final csp c;
   private final nb d;
   private final cpl e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ni(csp $$0, csp $$1, csp $$2, nb $$3, cpl $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ni a(csp $$0, csp $$1, csp $$2, nb $$3, cpl $$4) {
      return new ni($$0, $$1, $$2, $$3, $$4);
   }

   public ni a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(nc $$0, String $$1) {
      this.a($$0, new ajc($$1));
   }

   public void a(nc $$0, ajc $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      ctj $$3 = new ctj(this.a, this.b, this.c, new cpq(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(ajc $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
