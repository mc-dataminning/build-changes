public class gmr extends gln<ckq, fxl<ckq>> {
   private static final akr a = akr.b("textures/entity/strider/strider.png");
   private static final akr i = akr.b("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gmr(gkh.a $$0) {
      super($$0, new fxl<>($$0.a(fyh.bE)), 0.5F);
      this.a(new gou<>(this, new fxl<>($$0.a(fyh.bF)), akr.b("textures/entity/strider/strider_saddle.png")));
   }

   public akr a(ckq $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(ckq $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(ckq $$0, fbg $$1, float $$2) {
      float $$3 = $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(ckq $$0) {
      return super.a($$0) || $$0.s();
   }
}
