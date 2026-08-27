public class gbi extends gcg<cah, fmk<cah>> {
   private static final aiy a = new aiy("textures/entity/fox/fox.png");
   private static final aiy i = new aiy("textures/entity/fox/fox_sleep.png");
   private static final aiy j = new aiy("textures/entity/fox/snow_fox.png");
   private static final aiy k = new aiy("textures/entity/fox/snow_fox_sleep.png");

   public gbi(gba.a $$0) {
      super($$0, new fmk<>($$0.a(fpi.Z)), 0.4F);
      this.a(new gey(this, $$0.d()));
   }

   protected void a(cah $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gm() || $$0.gg()) {
         float $$6 = -awi.i($$4, $$0.N, $$0.dE());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public aiy a(cah $$0) {
      if ($$0.w() == cah.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
