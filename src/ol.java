import java.util.LinkedHashMap;
import java.util.Map;

public class ol {
   private final cxr a;
   private final cxr b;
   private final cxr c;
   private final oe d;
   private final ctj e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ol(cxr $$0, cxr $$1, cxr $$2, oe $$3, ctj $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ol a(cxr $$0, cxr $$1, cxr $$2, oe $$3, ctj $$4) {
      return new ol($$0, $$1, $$2, $$3, $$4);
   }

   public ol a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(of $$0, String $$1) {
      this.a($$0, new akm($$1));
   }

   public void a(of $$0, akm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyl $$3 = new cyl(this.a, this.b, this.c, new cto(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(akm $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
