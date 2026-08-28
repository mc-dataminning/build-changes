import java.util.LinkedHashMap;
import java.util.Map;

public class ot {
   private final cyw a;
   private final cyw b;
   private final cyw c;
   private final om d;
   private final cul e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();

   public ot(cyw $$0, cyw $$1, cyw $$2, om $$3, cul $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ot a(cyw $$0, cyw $$1, cyw $$2, om $$3, cul $$4) {
      return new ot($$0, $$1, $$2, $$3, $$4);
   }

   public ot a(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(on $$0, String $$1) {
      this.a($$0, akr.a($$1));
   }

   public void a(on $$0, akr $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czt $$3 = new czt(this.a, this.b, this.c, new cuq(this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.d.a() + "/")));
   }

   private void a(akr $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
