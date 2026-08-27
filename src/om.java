import java.util.LinkedHashMap;
import java.util.Map;

public class om {
   private final oe a;
   private final cxt b;
   private final cxt c;
   private final cxt d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public om(oe $$0, cxt $$1, cxt $$2, cxt $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static om a(cxt $$0, cxt $$1, cxt $$2, oe $$3) {
      return new om($$3, $$0, $$1, $$2);
   }

   public om a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(of $$0, akn $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cyo $$3 = new cyo(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(akn $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
