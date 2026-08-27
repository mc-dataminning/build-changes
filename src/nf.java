import java.util.LinkedHashMap;
import java.util.Map;

public class nf {
   private final mx a;
   private final cpy b;
   private final cpy c;
   private final cpy d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nf(mx $$0, cpy $$1, cpy $$2, cpy $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nf a(cpy $$0, cpy $$1, cpy $$2, mx $$3) {
      return new nf($$3, $$0, $$1, $$2);
   }

   public nf a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(my $$0, ahg $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cqt $$3 = new cqt(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(ahg $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
