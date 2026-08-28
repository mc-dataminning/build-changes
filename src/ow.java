import java.util.LinkedHashMap;
import java.util.Map;

public class ow {
   private final cyn a;
   private final cyn b;
   private final cyn c;
   private final op d;
   private final cuf e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ow(cyn $$0, cyn $$1, cyn $$2, op $$3, cuf $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ow a(cyn $$0, cyn $$1, cyn $$2, op $$3, cuf $$4) {
      return new ow($$0, $$1, $$2, $$3, $$4);
   }

   public ow a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oq $$0, String $$1) {
      this.a($$0, new alb($$1));
   }

   public void a(oq $$0, alb $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      czh $$3 = new czh(this.a, this.b, this.c, new cuk(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(alb $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
