public class fyw extends fzs<cci, fka<cci>> {
   private static final ahg a = new ahg("textures/entity/ghast/ghast.png");
   private static final ahg i = new ahg("textures/entity/ghast/ghast_shooting.png");

   public fyw(fym.a $$0) {
      super($$0, new fka<>($$0.a(fmv.ad)), 1.5F);
   }

   public ahg a(cci $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(cci $$0, eqa $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
