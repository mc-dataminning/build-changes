public class ght implements ghg<drq> {
   private final fxl<?> a;

   public ght(ghh.a $$0) {
      this.a = new fxl($$0.a(fyr.bo));
   }

   public void a(drq $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      iw $$6 = iw.b;
      if ($$0.m()) {
         dtc $$7 = $$0.i().a_($$0.az_());
         if ($$7.b() instanceof dmp) {
            $$6 = $$7.c(dmp.b);
         }
      }

      csy $$8 = $$0.t();
      gtc $$9;
      if ($$8 == null) {
         $$9 = gfv.i;
      } else {
         $$9 = gfv.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fys $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      fbg $$13 = $$9.a($$3, gfo::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
