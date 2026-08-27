public class fwk extends fxi<bxg, fhw<bxg>> {
   private static final agm a = new agm("textures/entity/fox/fox.png");
   private static final agm i = new agm("textures/entity/fox/fox_sleep.png");
   private static final agm j = new agm("textures/entity/fox/snow_fox.png");
   private static final agm k = new agm("textures/entity/fox/snow_fox_sleep.png");

   public fwk(fwc.a $$0) {
      super($$0, new fhw<>($$0.a(fks.X)), 0.4F);
      this.a(new fzx(this, $$0.d()));
   }

   protected void a(bxg $$0, eob $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gl() || $$0.gf()) {
         float $$5 = -atq.i($$4, $$0.O, $$0.dF());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public agm a(bxg $$0) {
      if ($$0.w() == bxg.v.a) {
         return $$0.fE() ? i : a;
      } else {
         return $$0.fE() ? k : j;
      }
   }
}
