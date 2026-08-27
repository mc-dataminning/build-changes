public class fzi extends gag<bym, fkl<bym>> {
   private static final ahh a = new ahh("textures/entity/fox/fox.png");
   private static final ahh i = new ahh("textures/entity/fox/fox_sleep.png");
   private static final ahh j = new ahh("textures/entity/fox/snow_fox.png");
   private static final ahh k = new ahh("textures/entity/fox/snow_fox_sleep.png");

   public fzi(fza.a $$0) {
      super($$0, new fkl<>($$0.a(fni.Z)), 0.4F);
      this.a(new gcy(this, $$0.d()));
   }

   protected void a(bym $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gl() || $$0.gf()) {
         float $$5 = -aup.i($$4, $$0.O, $$0.dD());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public ahh a(bym $$0) {
      if ($$0.w() == bym.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
