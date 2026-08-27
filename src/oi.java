import java.util.LinkedHashMap;
import java.util.Map;

public class oi {
   private final oa a;
   private final cwd b;
   private final cwd c;
   private final cwd d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public oi(oa $$0, cwd $$1, cwd $$2, cwd $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static oi a(cwd $$0, cwd $$1, cwd $$2, oa $$3) {
      return new oi($$3, $$0, $$1, $$2);
   }

   public oi a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ob $$0, akf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cwy $$3 = new cwy(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(akf $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
