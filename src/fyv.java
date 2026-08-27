public class fyv extends fzt<byi, fjz<byi>> {
   private static final ahg a = new ahg("textures/entity/fox/fox.png");
   private static final ahg i = new ahg("textures/entity/fox/fox_sleep.png");
   private static final ahg j = new ahg("textures/entity/fox/snow_fox.png");
   private static final ahg k = new ahg("textures/entity/fox/snow_fox_sleep.png");

   public fyv(fyn.a $$0) {
      super($$0, new fjz<>($$0.a(fmw.aa)), 0.4F);
      this.a(new gcl(this, $$0.d()));
   }

   protected void a(byi $$0, eqb $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gk() || $$0.ge()) {
         float $$5 = -auo.i($$4, $$0.O, $$0.dE());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public ahg a(byi $$0) {
      if ($$0.w() == byi.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
