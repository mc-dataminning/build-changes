public class gyc extends gxd<cop, hhh, ghx> {
   private static final alk a = alk.b("textures/entity/zombie/drowned.png");

   public gyc(gyk.a $$0) {
      super($$0, new ghx($$0.a(glf.aG)), new ghx($$0.a(glf.aH)), new ghx($$0.a(glf.aL)), new ghx($$0.a(glf.aM)), new ghx($$0.a(glf.aI)), new ghx($$0.a(glf.aJ)));
      this.a(new hcg(this, $$0.f()));
   }

   public hhh a() {
      return new hhh();
   }

   @Override
   public alk a(hhh $$0) {
      return a;
   }

   protected void a(hhh $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azq.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected giq.a a(cop $$0, bxn $$1) {
      daa $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.gl() && $$2.a(dae.xd) ? giq.a.e : giq.a.a;
   }
}
