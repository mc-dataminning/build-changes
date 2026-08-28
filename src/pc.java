import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pc {
   private final daw a;
   private final daw b;
   private final daw c;
   private final ov d;
   private final cwi e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();

   public pc(daw $$0, daw $$1, daw $$2, ov $$3, cwi $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static pc a(daw $$0, daw $$1, daw $$2, ov $$3, cwi $$4) {
      return new pc($$0, $$1, $$2, $$3, $$4);
   }

   public pc a(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ow $$0, String $$1) {
      this.a($$0, alj.a($$1));
   }

   public void a(ow $$0, alj $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dbt $$3 = new dbt(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cwm(this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.d.a() + "/")));
   }

   private void a(alj $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
