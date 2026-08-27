import java.util.LinkedHashMap;
import java.util.Map;

public class om {
   private final oe a;
   private final cxr b;
   private final cxr c;
   private final cxr d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public om(oe $$0, cxr $$1, cxr $$2, cxr $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static om a(cxr $$0, cxr $$1, cxr $$2, oe $$3) {
      return new om($$3, $$0, $$1, $$2);
   }

   public om a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(of $$0, akm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cym $$3 = new cym(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(akm $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
