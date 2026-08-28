public class gzo extends gxz<coz, hfh, giv> {
   private static final alg a = alg.b("textures/entity/illager/vex.png");
   private static final alg j = alg.b("textures/entity/illager/vex_charging.png");

   public gzo(gwt.a $$0) {
      super($$0, new giv($$0.a(gjn.dI)), 0.3F);
      this.a(new haz<>(this));
   }

   protected int a(coz $$0, iv $$1) {
      return 15;
   }

   public alg a(hfh $$0) {
      return $$0.a ? j : a;
   }

   public hfh b() {
      return new hfh();
   }

   public void a(coz $$0, hfh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hcd.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}
