public class ghm implements ggz<drr> {
   private final fxd<?> a;

   public ghm(gha.a $$0) {
      this.a = new fxd($$0.a(fyj.bl));
   }

   public void a(drr $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      ji $$6 = ji.b;
      if ($$0.m()) {
         dtc $$7 = $$0.i().a_($$0.aD_());
         if ($$7.b() instanceof dmy) {
            $$6 = $$7.c(dmy.b);
         }
      }

      cti $$8 = $$0.u();
      gsq $$9;
      if ($$8 == null) {
         $$9 = gfo.i;
      } else {
         $$9 = gfo.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fyk $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      fbm $$13 = $$9.a($$3, gfh::e);
      this.a.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
