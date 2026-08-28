import java.util.LinkedHashMap;
import java.util.Map;

public class oq {
   private final oi a;
   private final cyg b;
   private final cyg c;
   private final cyg d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public oq(oi $$0, cyg $$1, cyg $$2, cyg $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static oq a(cyg $$0, cyg $$1, cyg $$2, oi $$3) {
      return new oq($$3, $$0, $$1, $$2);
   }

   public oq a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(oj $$0, akk $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cze $$3 = new cze(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(akk $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
