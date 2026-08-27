import java.util.LinkedHashMap;
import java.util.Map;

public class nh {
   private final mz a;
   private final csc b;
   private final csc c;
   private final csc d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nh(mz $$0, csc $$1, csc $$2, csc $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nh a(csc $$0, csc $$1, csc $$2, mz $$3) {
      return new nh($$3, $$0, $$1, $$2);
   }

   public nh a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(na $$0, aiy $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      csx $$3 = new csx(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(aiy $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
