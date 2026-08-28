public class glw extends gks<ckd, fwr<ckd>> {
   private static final akk a = new akk("textures/entity/strider/strider.png");
   private static final akk i = new akk("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public glw(gjm.a $$0) {
      super($$0, new fwr<>($$0.a(fxn.bD)), 0.5F);
      this.a(new gnz<>(this, new fwr<>($$0.a(fxn.bE)), new akk("textures/entity/strider/strider_saddle.png")));
   }

   public akk a(ckd $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(ckd $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(ckd $$0, fam $$1, float $$2) {
      float $$3 = $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(ckd $$0) {
      return super.a($$0) || $$0.s();
   }
}
