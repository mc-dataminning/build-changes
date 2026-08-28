public class gmt extends glp<ckq, fxn<ckq>> {
   private static final akr a = akr.b("textures/entity/strider/strider.png");
   private static final akr i = akr.b("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gmt(gkj.a $$0) {
      super($$0, new fxn<>($$0.a(fyj.bE)), 0.5F);
      this.a(new gow<>(this, new fxn<>($$0.a(fyj.bF)), akr.b("textures/entity/strider/strider_saddle.png")));
   }

   public akr a(ckq $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(ckq $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(ckq $$0, fbi $$1, float $$2) {
      float $$3 = $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(ckq $$0) {
      return super.a($$0) || $$0.s();
   }
}
