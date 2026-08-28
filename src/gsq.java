public class gsq extends guj<cme, gzc, gcs> {
   private static final aku a = aku.b("textures/entity/creeper/creeper.png");

   public gsq(gtd.a $$0) {
      super($$0, new gcs($$0.a(ggb.ak)), 0.5F);
      this.a(new gwu(this, $$0.f()));
   }

   protected void a(gzc $$0, fgr $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + ayz.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = ayz.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gzc $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : ayz.a($$1, 0.5F, 1.0F);
   }

   public aku b(gzc $$0) {
      return a;
   }

   public gzc a() {
      return new gzc();
   }

   public void a(cme $$0, gzc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = $$0.m();
   }
}
