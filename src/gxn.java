public class gxn extends gwo<coy, hgv, ghi> {
   private static final alr a = alr.b("textures/entity/zombie/drowned.png");

   public gxn(gxv.a $$0) {
      super($$0, new ghi($$0.a(gkq.aG)), new ghi($$0.a(gkq.aH)), new ghi($$0.a(gkq.aL)), new ghi($$0.a(gkq.aM)), new ghi($$0.a(gkq.aI)), new ghi($$0.a(gkq.aJ)));
      this.a(new hbr(this, $$0.f()));
   }

   public hgv a() {
      return new hgv();
   }

   @Override
   public alr a(hgv $$0) {
      return a;
   }

   protected void a(hgv $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.J;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ae;
         float $$6 = azz.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.x / 2.0F / $$3, 0.0F);
      }
   }

   protected gib.a a(coy $$0, bxw $$1) {
      dak $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.gl() && $$2.a(dao.xd) ? gib.a.e : gib.a.a;
   }
}
