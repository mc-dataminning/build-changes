public class fwf implements fvt<djl> {
   private final fun a;

   public fwf(fvu.a $$0) {
      this.a = $$0.b();
   }

   public void a(djl $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      ctx $$6 = $$0.i();
      if ($$6 != null) {
         hx $$7 = $$0.aE_().a($$0.g().g());
         djp $$8 = $$0.k();
         if (!$$8.i()) {
            fup.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cxa.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(djj.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dkr $$9 = $$8.a(cxa.br) ? dkr.b : dkr.a;
               djp $$10 = cxa.bz.o().a(djj.c, $$9).a(djj.a, $$8.c(dji.a));
               $$10 = $$10.a(djj.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hx $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dji.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fup.b();
         }
      }
   }

   private void a(hx $$0, djp $$1, eqk $$2, ftt $$3, ctx $$4, boolean $$5, int $$6) {
      fub $$7 = fto.b($$1);
      eqo $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, auw.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aS_() {
      return 68;
   }
}
