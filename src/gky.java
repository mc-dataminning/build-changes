public class gky extends glz<ceo, fvs<ceo>> {
   private static final akt a = new akt("textures/entity/fox/fox.png");
   private static final akt b = new akt("textures/entity/fox/fox_sleep.png");
   private static final akt g = new akt("textures/entity/fox/snow_fox.png");
   private static final akt k = new akt("textures/entity/fox/snow_fox_sleep.png");

   public gky(gkq.a $$0) {
      super($$0, new fvs<>($$0.a(fyr.ag)), 0.4F);
      this.a(new gos(this, $$0.d()));
   }

   protected void a(ceo $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gE() || $$0.gy()) {
         float $$6 = -aym.i($$4, $$0.Q, $$0.dM());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akt a(ceo $$0) {
      if ($$0.t() == ceo.v.a) {
         return $$0.fU() ? b : a;
      } else {
         return $$0.fU() ? k : g;
      }
   }
}
