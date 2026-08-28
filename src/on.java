import java.util.LinkedHashMap;
import java.util.Map;

public class on {
   private final of a;
   private final dea b;
   private final dea c;
   private final dea d;
   private final jf<dic> e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();

   public on(of $$0, dea $$1, dea $$2, dea $$3, jf<dic> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static on a(dea $$0, dea $$1, dea $$2, jf<dic> $$3, of $$4) {
      return new on($$4, $$0, $$1, $$2, $$3);
   }

   public on a(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(og $$0, alf<dee<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfc $$3 = new dfc(this.b, this.c, this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(alf<dee<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
