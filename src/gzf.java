public class gzf extends gzq<ckc, hfl, gis> {
   private static final alk a = alk.b("textures/entity/iron_golem/iron_golem.png");

   public gzf(gyk.a $$0) {
      super($$0, new gis($$0.a(glf.bA)), 0.7F);
      this.a(new hco(this));
      this.a(new hcp(this, $$0.d()));
   }

   public alk a(hfl $$0) {
      return a;
   }

   public hfl b() {
      return new hfl();
   }

   public void a(ckc $$0, hfl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.n() > 0.0F ? (float)$$0.n() - $$2 : 0.0F;
      $$1.b = $$0.q();
      $$1.c = $$0.m();
   }

   protected void a(hfl $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.ae < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.ad + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
