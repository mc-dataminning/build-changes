import java.util.LinkedHashMap;
import java.util.Map;

public class op {
   private final cyd a;
   private final cyd b;
   private final cyd c;
   private final oi d;
   private final ctv e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public op(cyd $$0, cyd $$1, cyd $$2, oi $$3, ctv $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static op a(cyd $$0, cyd $$1, cyd $$2, oi $$3, ctv $$4) {
      return new op($$0, $$1, $$2, $$3, $$4);
   }

   public op a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oj $$0, String $$1) {
      this.a($$0, new akk($$1));
   }

   public void a(oj $$0, akk $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cza $$3 = new cza(this.a, this.b, this.c, new cua(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(akk $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
