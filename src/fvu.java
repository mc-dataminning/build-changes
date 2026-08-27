public class fvu implements fvh<did> {
   private final flq<?> a;

   public fvu(fvi.a $$0) {
      this.a = new flq($$0.a(fmw.bh));
   }

   public void a(did $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      ic $$6 = ic.b;
      if ($$0.n()) {
         djh $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof ddo) {
            $$6 = $$7.c(ddo.b);
         }
      }

      clm $$8 = $$0.w();
      ggq $$9;
      if ($$8 == null) {
         $$9 = ftw.i;
      } else {
         $$9 = ftw.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fmx $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eqf $$13 = $$9.a($$3, ftp::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
