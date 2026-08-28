public class gzt extends gye<cpc, hfn, gja> {
   private static final alg a = alg.b("textures/entity/illager/vex.png");
   private static final alg j = alg.b("textures/entity/illager/vex_charging.png");

   public gzt(gwy.a $$0) {
      super($$0, new gja($$0.a(gjs.dK)), 0.3F);
      this.a(new hbe<>(this));
   }

   protected int a(cpc $$0, iv $$1) {
      return 15;
   }

   public alg a(hfn $$0) {
      return $$0.a ? j : a;
   }

   public hfn b() {
      return new hfn();
   }

   public void a(cpc $$0, hfn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hcj.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}
