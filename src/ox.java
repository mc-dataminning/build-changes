import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ox {
   private final op a;
   private final czp b;
   private final czp c;
   private final czp d;
   private final Map<String, ao<?>> e = new LinkedHashMap<>();

   public ox(op $$0, czp $$1, czp $$2, czp $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ox a(czp $$0, czp $$1, czp $$2, op $$3) {
      return new ox($$3, $$0, $$1, $$2);
   }

   public ox a(String $$0, ao<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(oq $$0, alb $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.e.forEach($$2::a);
      dao $$3 = new dao(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.a.a() + "/")));
   }

   private void a(alb $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
