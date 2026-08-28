public class gsw extends gth<chi, gzb, gcn> {
   private static final aku a = aku.b("textures/entity/iron_golem/iron_golem.png");

   public gsw(gsb.a $$0) {
      super($$0, new gcn($$0.a(gez.bo)), 0.7F);
      this.a(new gwg(this));
      this.a(new gwh(this, $$0.d()));
   }

   public aku a(gzb $$0) {
      return a;
   }

   public gzb b() {
      return new gzb();
   }

   public void a(chi $$0, gzb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      $$1.b = $$0.x();
      $$1.c = $$0.p();
   }

   protected void a(gzb $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.ae < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.ad + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
