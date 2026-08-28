import java.util.LinkedHashMap;
import java.util.Map;

public class ot {
   private final ol a;
   private final cyu b;
   private final cyu c;
   private final cyu d;
   private final Map<String, ao<?>> e = new LinkedHashMap<>();

   public ot(ol $$0, cyu $$1, cyu $$2, cyu $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ot a(cyu $$0, cyu $$1, cyu $$2, ol $$3) {
      return new ot($$3, $$0, $$1, $$2);
   }

   public ot a(String $$0, ao<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(om $$0, akq $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.e.forEach($$2::a);
      czs $$3 = new czs(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.a.a() + "/")));
   }

   private void a(akq $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
