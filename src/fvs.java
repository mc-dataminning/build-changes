public class fvs implements fvf<dic> {
   private final flo<?> a;

   public fvs(fvg.a $$0) {
      this.a = new flo($$0.a(fmu.bh));
   }

   public void a(dic $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      ic $$6 = ic.b;
      if ($$0.n()) {
         djg $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof ddn) {
            $$6 = $$7.c(ddn.b);
         }
      }

      cll $$8 = $$0.w();
      ggo $$9;
      if ($$8 == null) {
         $$9 = ftu.i;
      } else {
         $$9 = ftu.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fmv $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eqd $$13 = $$9.a($$3, ftn::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
