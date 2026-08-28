import java.util.LinkedHashMap;
import java.util.Map;

public class ow {
   private final cyu a;
   private final cyu b;
   private final cyu c;
   private final op d;
   private final cum e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ow(cyu $$0, cyu $$1, cyu $$2, op $$3, cum $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ow a(cyu $$0, cyu $$1, cyu $$2, op $$3, cum $$4) {
      return new ow($$0, $$1, $$2, $$3, $$4);
   }

   public ow a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oq $$0, String $$1) {
      this.a($$0, new alf($$1));
   }

   public void a(oq $$0, alf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      czo $$3 = new czo(this.a, this.b, this.c, new cur(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(alf $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
