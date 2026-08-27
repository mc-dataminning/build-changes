public class ghf extends gid<cdz, fsd<cdz>> {
   private static final akh a = new akh("textures/entity/fox/fox.png");
   private static final akh i = new akh("textures/entity/fox/fox_sleep.png");
   private static final akh j = new akh("textures/entity/fox/snow_fox.png");
   private static final akh k = new akh("textures/entity/fox/snow_fox_sleep.png");

   public ghf(ggx.a $$0) {
      super($$0, new fsd<>($$0.a(fva.ad)), 0.4F);
      this.a(new gkv(this, $$0.d()));
   }

   protected void a(cdz $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gv() || $$0.gp()) {
         float $$6 = -axz.i($$4, $$0.P, $$0.dF());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akh a(cdz $$0) {
      if ($$0.u() == cdz.v.a) {
         return $$0.fJ() ? i : a;
      } else {
         return $$0.fJ() ? k : j;
      }
   }
}
