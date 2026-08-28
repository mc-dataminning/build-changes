public class gmn extends glj<cko, fxh<cko>> {
   private static final akq a = akq.b("textures/entity/strider/strider.png");
   private static final akq i = akq.b("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gmn(gkd.a $$0) {
      super($$0, new fxh<>($$0.a(fyd.bE)), 0.5F);
      this.a(new goq<>(this, new fxh<>($$0.a(fyd.bF)), akq.b("textures/entity/strider/strider_saddle.png")));
   }

   public akq a(cko $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(cko $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cko $$0, fbc $$1, float $$2) {
      float $$3 = $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cko $$0) {
      return super.a($$0) || $$0.s();
   }
}
