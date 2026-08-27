import java.util.LinkedHashMap;
import java.util.Map;

public class ng {
   private final cry a;
   private final cry b;
   private final cry c;
   private final mz d;
   private final cou e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ng(cry $$0, cry $$1, cry $$2, mz $$3, cou $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ng a(cry $$0, cry $$1, cry $$2, mz $$3, cou $$4) {
      return new ng($$0, $$1, $$2, $$3, $$4);
   }

   public ng a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(na $$0, String $$1) {
      this.a($$0, new aiy($$1));
   }

   public void a(na $$0, aiy $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      css $$3 = new css(this.a, this.b, this.c, new coz(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(aiy $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
