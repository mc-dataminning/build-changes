public class ggb implements gfo<dqq> {
   private final fvt<?> a;

   public ggb(gfp.a $$0) {
      this.a = new fvt($$0.a(fwz.bk));
   }

   public void a(dqq $$0, float $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
      je $$6 = je.b;
      if ($$0.m()) {
         dsc $$7 = $$0.i().a_($$0.ay_());
         if ($$7.b() instanceof dly) {
            $$6 = $$7.c(dly.b);
         }
      }

      cti $$8 = $$0.u();
      grd $$9;
      if ($$8 == null) {
         $$9 = ged.i;
      } else {
         $$9 = ged.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fxa $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      fac $$13 = $$9.a($$3, gdw::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
