public class fzc implements fyq<dma> {
   private final fxk a;

   public fzc(fyr.a $$0) {
      this.a = $$0.b();
   }

   public void a(dma $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      cwe $$6 = $$0.i();
      if ($$6 != null) {
         ib $$7 = $$0.aD_().a($$0.f().g());
         dme $$8 = $$0.j();
         if (!$$8.i()) {
            fxm.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(czh.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dly.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dng $$9 = $$8.a(czh.br) ? dng.b : dng.a;
               dme $$10 = czh.bz.o().a(dly.c, $$9).a(dly.a, $$8.c(dlx.a));
               $$10 = $$10.a(dly.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ib $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dlx.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fxm.b();
         }
      }
   }

   private void a(ib $$0, dme $$1, etd $$2, fwq $$3, cwe $$4, boolean $$5, int $$6) {
      fwy $$7 = fwl.b($$1);
      eth $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, awt.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aS_() {
      return 68;
   }
}
