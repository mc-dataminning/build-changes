public class gqu extends gpq<cme, gwm, gao> {
   private static final ali a = ali.b("textures/entity/strider/strider.png");
   private static final ali b = ali.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gqu(gok.a $$0) {
      super($$0, new gao($$0.a(gbl.cF)), 0.5F);
      this.a(new gsy<>(this, new gao($$0.a(gbl.cG)), ali.b("textures/entity/strider/strider_saddle.png")));
   }

   public ali a(gwm $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gwm $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gwm c() {
      return new gwm();
   }

   public void a(cme $$0, gwm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.q();
      $$1.c = $$0.cb();
   }

   protected void a(gwm $$0, feb $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gwm $$0) {
      return super.a($$0) || $$0.b;
   }
}
