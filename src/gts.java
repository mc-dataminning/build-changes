public class gts extends gvl<cmv, had, gds> {
   private static final ald a = ald.b("textures/entity/creeper/creeper.png");

   public gts(guf.a $$0) {
      super($$0, new gds($$0.a(ghc.am)), 0.5F);
      this.a(new gxw(this, $$0.f()));
   }

   protected void a(had $$0, fho $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azk.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azk.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(had $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azk.a($$1, 0.5F, 1.0F);
   }

   public ald b(had $$0) {
      return a;
   }

   public had a() {
      return new had();
   }

   public void a(cmv $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = $$0.m();
   }
}
