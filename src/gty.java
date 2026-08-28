public class gty extends guj<cib, had, gdp> {
   private static final aku a = aku.b("textures/entity/iron_golem/iron_golem.png");

   public gty(gtd.a $$0) {
      super($$0, new gdp($$0.a(ggb.bq)), 0.7F);
      this.a(new gxi(this));
      this.a(new gxj(this, $$0.d()));
   }

   public aku a(had $$0) {
      return a;
   }

   public had b() {
      return new had();
   }

   public void a(cib $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.n() > 0.0F ? (float)$$0.n() - $$2 : 0.0F;
      $$1.b = $$0.q();
      $$1.c = $$0.m();
   }

   protected void a(had $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.ae < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.ad + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
