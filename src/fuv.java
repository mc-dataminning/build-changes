public class fuv implements fui<dhl> {
   private final fkr<?> a;

   public fuv(fuj.a $$0) {
      this.a = new fkr($$0.a(flx.bh));
   }

   public void a(dhl $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      ia $$6 = ia.b;
      if ($$0.n()) {
         dip $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof dcx) {
            $$6 = $$7.c(dcx.b);
         }
      }

      ckv $$8 = $$0.w();
      gfs $$9;
      if ($$8 == null) {
         $$9 = fsx.i;
      } else {
         $$9 = fsx.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fly $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eph $$13 = $$9.a($$3, fsq::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
