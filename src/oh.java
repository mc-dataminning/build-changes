import java.util.LinkedHashMap;
import java.util.Map;

public class oh {
   private final cwd a;
   private final cwd b;
   private final cwd c;
   private final oa d;
   private final cry e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public oh(cwd $$0, cwd $$1, cwd $$2, oa $$3, cry $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static oh a(cwd $$0, cwd $$1, cwd $$2, oa $$3, cry $$4) {
      return new oh($$0, $$1, $$2, $$3, $$4);
   }

   public oh a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ob $$0, String $$1) {
      this.a($$0, new akf($$1));
   }

   public void a(ob $$0, akf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cwx $$3 = new cwx(this.a, this.b, this.c, new csd(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(akf $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
