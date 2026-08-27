import java.util.LinkedHashMap;
import java.util.Map;

public class oo {
   private final og a;
   private final cyv b;
   private final cyv c;
   private final cyv d;
   private final Map<String, ao<?>> e = new LinkedHashMap<>();

   public oo(og $$0, cyv $$1, cyv $$2, cyv $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static oo a(cyv $$0, cyv $$1, cyv $$2, og $$3) {
      return new oo($$3, $$0, $$1, $$2);
   }

   public oo a(String $$0, ao<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(oh $$0, akt $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", df.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.e.forEach($$2::a);
      czs $$3 = new czs(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(akt $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
