import java.util.LinkedHashMap;
import java.util.Map;

public class ox {
   private final op a;
   private final cyt b;
   private final cyt c;
   private final cyt d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public ox(op $$0, cyt $$1, cyt $$2, cyt $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ox a(cyt $$0, cyt $$1, cyt $$2, op $$3) {
      return new ox($$3, $$0, $$1, $$2);
   }

   public ox a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(oq $$0, alf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      czo $$3 = new czo(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(alf $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
