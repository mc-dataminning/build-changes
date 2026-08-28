import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ph {
   private final dca a;
   private final dca b;
   private final dca c;
   private final pa d;
   private final cxl e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();

   public ph(dca $$0, dca $$1, dca $$2, pa $$3, cxl $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ph a(dca $$0, dca $$1, dca $$2, pa $$3, cxl $$4) {
      return new ph($$0, $$1, $$2, $$3, $$4);
   }

   public ph a(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(pb $$0, String $$1) {
      this.a($$0, aly.a(mb.bk, alz.a($$1)));
   }

   public void a(pb $$0, aly<dce<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      ddb $$3 = new ddb(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cxp(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(aly<dce<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
