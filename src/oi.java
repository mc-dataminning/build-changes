import java.util.LinkedHashMap;
import java.util.Map;

public class oi {
   private final cxa a;
   private final cxa b;
   private final cxa c;
   private final ob d;
   private final csu e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public oi(cxa $$0, cxa $$1, cxa $$2, ob $$3, csu $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static oi a(cxa $$0, cxa $$1, cxa $$2, ob $$3, csu $$4) {
      return new oi($$0, $$1, $$2, $$3, $$4);
   }

   public oi a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oc $$0, String $$1) {
      this.a($$0, new akh($$1));
   }

   public void a(oc $$0, akh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dc.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cxu $$3 = new cxu(this.a, this.b, this.c, new csz(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(akh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
