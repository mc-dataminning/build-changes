public class gxt extends gye<cjp, hdz, ghf> {
   private static final alg a = alg.b("textures/entity/iron_golem/iron_golem.png");

   public gxt(gwy.a $$0) {
      super($$0, new ghf($$0.a(gjs.bA)), 0.7F);
      this.a(new hbc(this));
      this.a(new hbd(this, $$0.d()));
   }

   public alg a(hdz $$0) {
      return a;
   }

   public hdz b() {
      return new hdz();
   }

   public void a(cjp $$0, hdz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.n() > 0.0F ? (float)$$0.n() - $$2 : 0.0F;
      $$1.b = $$0.q();
      $$1.c = $$0.m();
   }

   protected void a(hdz $$0, fkd $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.ae < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.ad + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
