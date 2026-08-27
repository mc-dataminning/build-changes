import java.util.LinkedHashMap;
import java.util.Map;

public class on {
   private final cyv a;
   private final cyv b;
   private final cyv c;
   private final og d;
   private final cuc e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();

   public on(cyv $$0, cyv $$1, cyv $$2, og $$3, cuc $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static on a(cyv $$0, cyv $$1, cyv $$2, og $$3, cuc $$4) {
      return new on($$0, $$1, $$2, $$3, $$4);
   }

   public on a(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oh $$0, String $$1) {
      this.a($$0, new akt($$1));
   }

   public void a(oh $$0, akt $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", df.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czr $$3 = new czr(this.a, this.b, this.c, new cuh(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(akt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
