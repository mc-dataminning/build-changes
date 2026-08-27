public class fvs extends fwq<bwt, fhe<bwt>> {
   private static final agg a = new agg("textures/entity/fox/fox.png");
   private static final agg i = new agg("textures/entity/fox/fox_sleep.png");
   private static final agg j = new agg("textures/entity/fox/snow_fox.png");
   private static final agg k = new agg("textures/entity/fox/snow_fox_sleep.png");

   public fvs(fvk.a $$0) {
      super($$0, new fhe<>($$0.a(fka.X)), 0.4F);
      this.a(new fzf(this, $$0.d()));
   }

   protected void a(bwt $$0, enk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gk() || $$0.ge()) {
         float $$5 = -ati.i($$4, $$0.O, $$0.dD());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public agg a(bwt $$0) {
      if ($$0.t() == bwt.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
