public class glu implements gli<dvk> {
   private final gka a;

   public glu(glj.a $$0) {
      this.a = $$0.b();
   }

   public void a(dvk $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      dff $$6 = $$0.i();
      if ($$6 != null) {
         jh $$7 = $$0.aB_().a($$0.f().g());
         dvo $$8 = $$0.j();
         if (!$$8.l()) {
            gkc.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dil.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dvi.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dwp $$9 = $$8.a(dil.br) ? dwp.b : dwp.a;
               dvo $$10 = dil.bz.m().b(dvi.c, $$9).b(dvi.a, $$8.c(dvh.a));
               $$10 = $$10.b(dvi.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jh $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dvh.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gkc.b();
         }
      }
   }

   private void a(jh $$0, dvo $$1, fek $$2, gix $$3, dff $$4, boolean $$5, int $$6) {
      gjh $$7 = gip.b($$1);
      feo $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azv.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aV_() {
      return 68;
   }
}
