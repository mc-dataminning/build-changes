public class giw extends ght<cie, ftu<cie>> {
   private static final akf a = new akf("textures/entity/strider/strider.png");
   private static final akf i = new akf("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public giw(ggn.a $$0) {
      super($$0, new ftu<>($$0.a(fuq.bD)), 0.5F);
      this.a(new gkz<>(this, new ftu<>($$0.a(fuq.bE)), new akf("textures/entity/strider/strider_saddle.png")));
   }

   public akf a(cie $$0) {
      return $$0.r() ? i : a;
   }

   protected float b(cie $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cie $$0, exn $$1, float $$2) {
      float $$3 = $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cie $$0) {
      return super.a($$0) || $$0.r();
   }
}
