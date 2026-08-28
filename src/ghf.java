public class ghf implements ggt<dsw> {
   private final gfn a;

   public ghf(ggu.a $$0) {
      this.a = $$0.b();
   }

   public void a(dsw $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      dcu $$6 = $$0.i();
      if ($$6 != null) {
         jd $$7 = $$0.az_().a($$0.f().g());
         dta $$8 = $$0.j();
         if (!$$8.i()) {
            gfp.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfy.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dsu.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               duc $$9 = $$8.a(dfy.br) ? duc.b : duc.a;
               dta $$10 = dfy.bz.o().a(dsu.c, $$9).a(dsu.a, $$8.c(dst.a));
               $$10 = $$10.a(dsu.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jd $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dst.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gfp.b();
         }
      }
   }

   private void a(jd $$0, dta $$1, fbc $$2, get $$3, dcu $$4, boolean $$5, int $$6) {
      gfb $$7 = geo.b($$1);
      fbg $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ayv.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aT_() {
      return 68;
   }
}
