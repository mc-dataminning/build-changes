import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class oy {
   private final oq a;
   private final dag b;
   private final dag c;
   private final dag d;
   private final Map<String, ao<?>> e = new LinkedHashMap<>();

   public oy(oq $$0, dag $$1, dag $$2, dag $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static oy a(dag $$0, dag $$1, dag $$2, oq $$3) {
      return new oy($$3, $$0, $$1, $$2);
   }

   public oy a(String $$0, ao<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(or $$0, ale $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.e.forEach($$2::a);
      dbf $$3 = new dbf(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.a.a() + "/")));
   }

   private void a(ale $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
