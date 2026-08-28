import java.util.LinkedHashMap;
import java.util.Map;

public class ou {
   private final om a;
   private final cyw b;
   private final cyw c;
   private final cyw d;
   private final Map<String, ao<?>> e = new LinkedHashMap<>();

   public ou(om $$0, cyw $$1, cyw $$2, cyw $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ou a(cyw $$0, cyw $$1, cyw $$2, om $$3) {
      return new ou($$3, $$0, $$1, $$2);
   }

   public ou a(String $$0, ao<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(on $$0, akr $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.e.forEach($$2::a);
      czu $$3 = new czu(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.a.a() + "/")));
   }

   private void a(akr $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
