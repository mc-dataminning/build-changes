public class fxx implements fxl<dlb> {
   private final fwf a;

   public fxx(fxm.a $$0) {
      this.a = $$0.b();
   }

   public void a(dlb $$0, float $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      cvn $$6 = $$0.i();
      if ($$6 != null) {
         hz $$7 = $$0.aE_().a($$0.g().g());
         dlf $$8 = $$0.k();
         if (!$$8.i()) {
            fwh.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cyq.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dkz.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dmh $$9 = $$8.a(cyq.br) ? dmh.b : dmh.a;
               dlf $$10 = cyq.bz.o().a(dkz.c, $$9).a(dkz.a, $$8.c(dky.a));
               $$10 = $$10.a(dkz.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hz $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dky.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fwh.b();
         }
      }
   }

   private void a(hz $$0, dlf $$1, esa $$2, fvl $$3, cvn $$4, boolean $$5, int $$6) {
      fvt $$7 = fvg.b($$1);
      ese $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, awo.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aT_() {
      return 68;
   }
}
