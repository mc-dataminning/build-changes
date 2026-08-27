public class fyu extends fzs<byh, fjy<byh>> {
   private static final ahg a = new ahg("textures/entity/fox/fox.png");
   private static final ahg i = new ahg("textures/entity/fox/fox_sleep.png");
   private static final ahg j = new ahg("textures/entity/fox/snow_fox.png");
   private static final ahg k = new ahg("textures/entity/fox/snow_fox_sleep.png");

   public fyu(fym.a $$0) {
      super($$0, new fjy<>($$0.a(fmv.aa)), 0.4F);
      this.a(new gck(this, $$0.d()));
   }

   protected void a(byh $$0, eqa $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gk() || $$0.ge()) {
         float $$5 = -aun.i($$4, $$0.O, $$0.dE());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public ahg a(byh $$0) {
      if ($$0.w() == byh.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
