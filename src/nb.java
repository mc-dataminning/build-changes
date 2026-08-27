import java.util.LinkedHashMap;
import java.util.Map;

public class nb {
   private final mt a;
   private final cpi b;
   private final cpi c;
   private final cpi d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nb(mt $$0, cpi $$1, cpi $$2, cpi $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nb a(cpi $$0, cpi $$1, cpi $$2, mt $$3) {
      return new nb($$3, $$0, $$1, $$2);
   }

   public nb a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(mu $$0, agt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cqd $$3 = new cqd(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(agt $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
