import java.util.LinkedHashMap;
import java.util.Map;

public class ol {
   private final cxt a;
   private final cxt b;
   private final cxt c;
   private final oe d;
   private final ctl e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public ol(cxt $$0, cxt $$1, cxt $$2, oe $$3, ctl $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ol a(cxt $$0, cxt $$1, cxt $$2, oe $$3, ctl $$4) {
      return new ol($$0, $$1, $$2, $$3, $$4);
   }

   public ol a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(of $$0, String $$1) {
      this.a($$0, new akn($$1));
   }

   public void a(of $$0, akn $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyn $$3 = new cyn(this.a, this.b, this.c, new ctq(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(akn $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
