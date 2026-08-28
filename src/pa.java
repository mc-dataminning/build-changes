import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pa {
   private final daf a;
   private final daf b;
   private final daf c;
   private final ot d;
   private final cvt e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();

   public pa(daf $$0, daf $$1, daf $$2, ot $$3, cvt $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static pa a(daf $$0, daf $$1, daf $$2, ot $$3, cvt $$4) {
      return new pa($$0, $$1, $$2, $$3, $$4);
   }

   public pa a(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ou $$0, String $$1) {
      this.a($$0, alh.a($$1));
   }

   public void a(ou $$0, alh $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", du.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      dbd $$3 = new dbd(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cvx(this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.d.a() + "/")));
   }

   private void a(alh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
