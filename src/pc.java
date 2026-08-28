import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pc {
   private final dap a;
   private final dap b;
   private final dap c;
   private final ov d;
   private final cwb e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();

   public pc(dap $$0, dap $$1, dap $$2, ov $$3, cwb $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static pc a(dap $$0, dap $$1, dap $$2, ov $$3, cwb $$4) {
      return new pc($$0, $$1, $$2, $$3, $$4);
   }

   public pc a(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ow $$0, String $$1) {
      this.a($$0, all.a($$1));
   }

   public void a(ow $$0, all $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dbm $$3 = new dbm(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cwf(this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.d.a() + "/")));
   }

   private void a(all $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
