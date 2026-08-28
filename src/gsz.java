public class gsz extends gtk<chk, gze, gcq> {
   private static final akv a = akv.b("textures/entity/iron_golem/iron_golem.png");

   public gsz(gse.a $$0) {
      super($$0, new gcq($$0.a(gfc.bo)), 0.7F);
      this.a(new gwj(this));
      this.a(new gwk(this, $$0.d()));
   }

   public akv a(gze $$0) {
      return a;
   }

   public gze b() {
      return new gze();
   }

   public void a(chk $$0, gze $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      $$1.b = $$0.x();
      $$1.c = $$0.p();
   }

   protected void a(gze $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.ae < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.ad + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
