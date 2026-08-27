import java.util.LinkedHashMap;
import java.util.Map;

public class nj {
   private final nb a;
   private final csp b;
   private final csp c;
   private final csp d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nj(nb $$0, csp $$1, csp $$2, csp $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nj a(csp $$0, csp $$1, csp $$2, nb $$3) {
      return new nj($$3, $$0, $$1, $$2);
   }

   public nj a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(nc $$0, ajc $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      ctk $$3 = new ctk(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(ajc $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
