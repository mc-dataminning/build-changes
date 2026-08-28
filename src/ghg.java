public class ghg implements ggt<drp> {
   private final fwx<?> a;

   public ghg(ggu.a $$0) {
      this.a = new fwx($$0.a(fyd.bl));
   }

   public void a(drp $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      ji $$6 = ji.b;
      if ($$0.m()) {
         dta $$7 = $$0.i().a_($$0.az_());
         if ($$7.b() instanceof dmw) {
            $$6 = $$7.c(dmw.b);
         }
      }

      ctg $$8 = $$0.u();
      gsj $$9;
      if ($$8 == null) {
         $$9 = gfi.i;
      } else {
         $$9 = gfi.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fye $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      fbg $$13 = $$9.a($$3, gfb::e);
      this.a.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
