public class fyn extends fzl<byc, fjr<byc>> {
   private static final ahd a = new ahd("textures/entity/fox/fox.png");
   private static final ahd i = new ahd("textures/entity/fox/fox_sleep.png");
   private static final ahd j = new ahd("textures/entity/fox/snow_fox.png");
   private static final ahd k = new ahd("textures/entity/fox/snow_fox_sleep.png");

   public fyn(fyf.a $$0) {
      super($$0, new fjr<>($$0.a(fmo.aa)), 0.4F);
      this.a(new gcd(this, $$0.d()));
   }

   protected void a(byc $$0, ept $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gk() || $$0.ge()) {
         float $$5 = -aui.i($$4, $$0.O, $$0.dE());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public ahd a(byc $$0) {
      if ($$0.w() == byc.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
