public class fyf implements fxt<dlf> {
   private final fwn a;

   public fyf(fxu.a $$0) {
      this.a = $$0.b();
   }

   public void a(dlf $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      cvr $$6 = $$0.i();
      if ($$6 != null) {
         hz $$7 = $$0.aE_().a($$0.g().g());
         dlj $$8 = $$0.k();
         if (!$$8.i()) {
            fwp.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cyu.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dld.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dml $$9 = $$8.a(cyu.br) ? dml.b : dml.a;
               dlj $$10 = cyu.bz.o().a(dld.c, $$9).a(dld.a, $$8.c(dlc.a));
               $$10 = $$10.a(dld.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hz $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dlc.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fwp.b();
         }
      }
   }

   private void a(hz $$0, dlj $$1, esh $$2, fvt $$3, cvr $$4, boolean $$5, int $$6) {
      fwb $$7 = fvo.b($$1);
      esl $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, awp.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aT_() {
      return 68;
   }
}
