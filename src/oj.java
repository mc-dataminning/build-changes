import java.util.LinkedHashMap;
import java.util.Map;

public class oj {
   private final ob a;
   private final cxa b;
   private final cxa c;
   private final cxa d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public oj(ob $$0, cxa $$1, cxa $$2, cxa $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static oj a(cxa $$0, cxa $$1, cxa $$2, ob $$3) {
      return new oj($$3, $$0, $$1, $$2);
   }

   public oj a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(oc $$0, akh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dc.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cxv $$3 = new cxv(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(akh $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
