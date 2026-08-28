import java.util.LinkedHashMap;
import java.util.Map;

public class on {
   private final of a;
   private final ddx b;
   private final ddx c;
   private final ddx d;
   private final jf<dhz> e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();

   public on(of $$0, ddx $$1, ddx $$2, ddx $$3, jf<dhz> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static on a(ddx $$0, ddx $$1, ddx $$2, jf<dhz> $$3, of $$4) {
      return new on($$4, $$0, $$1, $$2, $$3);
   }

   public on a(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(og $$0, alf<deb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dez $$3 = new dez(this.b, this.c, this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(alf<deb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
