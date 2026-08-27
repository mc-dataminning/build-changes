public class fxz implements fxm<dkb> {
   private final fnu<?> a;

   public fxz(fxn.a $$0) {
      this.a = new fnu($$0.a(fpb.bg));
   }

   public void a(dkb $$0, float $$1, esa $$2, fvm $$3, int $$4, int $$5) {
      ie $$6 = ie.b;
      if ($$0.n()) {
         dlf $$7 = $$0.i().a_($$0.aE_());
         if ($$7.b() instanceof dfm) {
            $$6 = $$7.c(dfm.b);
         }
      }

      cnn $$8 = $$0.w();
      gix $$9;
      if ($$8 == null) {
         $$9 = fwb.i;
      } else {
         $$9 = fwb.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fpc $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      ese $$13 = $$9.a($$3, fvu::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
