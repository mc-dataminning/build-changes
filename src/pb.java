import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pb {
   private final ot a;
   private final daf b;
   private final daf c;
   private final daf d;
   private final Map<String, ao<?>> e = new LinkedHashMap<>();

   public pb(ot $$0, daf $$1, daf $$2, daf $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static pb a(daf $$0, daf $$1, daf $$2, ot $$3) {
      return new pb($$3, $$0, $$1, $$2);
   }

   public pb a(String $$0, ao<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ou $$0, alh $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", du.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.e.forEach($$2::a);
      dbe $$3 = new dbe(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.a.a() + "/")));
   }

   private void a(alh $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
