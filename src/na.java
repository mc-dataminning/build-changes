import java.util.LinkedHashMap;
import java.util.Map;

public class na {
   private final cpi a;
   private final cpi b;
   private final cpi c;
   private final mt d;
   private final cmc e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public na(cpi $$0, cpi $$1, cpi $$2, mt $$3, cmc $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static na a(cpi $$0, cpi $$1, cpi $$2, mt $$3, cmc $$4) {
      return new na($$0, $$1, $$2, $$3, $$4);
   }

   public na a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(mu $$0, String $$1) {
      this.a($$0, new agt($$1));
   }

   public void a(mu $$0, agt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cqc $$3 = new cqc(this.a, this.b, this.c, new cmh(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(agt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
