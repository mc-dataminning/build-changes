public class gnd extends glz<cjr, fxv<cjr>> {
   private static final akt a = new akt("textures/entity/strider/strider.png");
   private static final akt b = new akt("textures/entity/strider/strider_cold.png");
   private static final float g = 0.5F;

   public gnd(gkq.a $$0) {
      super($$0, new fxv<>($$0.a(fyr.bJ)), 0.5F);
      this.a(new gpj<>(this, new fxv<>($$0.a(fyr.bK)), new akt("textures/entity/strider/strider_saddle.png")));
   }

   public akt a(cjr $$0) {
      return $$0.r() ? b : a;
   }

   protected float b(cjr $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cjr $$0, fbc $$1, float $$2) {
      float $$3 = $$0.el();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cjr $$0) {
      return super.a($$0) || $$0.r();
   }
}
