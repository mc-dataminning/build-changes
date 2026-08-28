import java.util.LinkedHashMap;
import java.util.Map;

public class ox {
   private final op a;
   private final cys b;
   private final cys c;
   private final cys d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public ox(op $$0, cys $$1, cys $$2, cys $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ox a(cys $$0, cys $$1, cys $$2, op $$3) {
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
      czn $$3 = new czn(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(alf $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
