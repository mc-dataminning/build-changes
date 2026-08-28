public class gga implements gfo<dry> {
   private final gei a;

   public gga(gfp.a $$0) {
      this.a = $$0.b();
   }

   public void a(dry $$0, float $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
      dby $$6 = $$0.i();
      if ($$6 != null) {
         iz $$7 = $$0.ay_().a($$0.f().g());
         dsc $$8 = $$0.j();
         if (!$$8.i()) {
            gek.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfb.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(drw.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dte $$9 = $$8.a(dfb.br) ? dte.b : dte.a;
               dsc $$10 = dfb.bz.o().a(drw.c, $$9).a(drw.a, $$8.c(drv.a));
               $$10 = $$10.a(drw.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               iz $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(drv.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gek.b();
         }
      }
   }

   private void a(iz $$0, dsc $$1, ezy $$2, gdo $$3, dby $$4, boolean $$5, int $$6) {
      gdw $$7 = gdj.b($$1);
      fac $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azh.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
