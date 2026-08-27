public class fvt implements fvh<djd> {
   private final fub a;

   public fvt(fvi.a $$0) {
      this.a = $$0.b();
   }

   public void a(djd $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      ctp $$6 = $$0.i();
      if ($$6 != null) {
         hx $$7 = $$0.aB_().a($$0.g().g());
         djh $$8 = $$0.k();
         if (!$$8.i()) {
            fud.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cws.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(djb.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dkj $$9 = $$8.a(cws.br) ? dkj.b : dkj.a;
               djh $$10 = cws.bz.o().a(djb.c, $$9).a(djb.a, $$8.c(dja.a));
               $$10 = $$10.a(djb.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hx $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dja.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fud.b();
         }
      }
   }

   private void a(hx $$0, djh $$1, eqb $$2, fth $$3, ctp $$4, boolean $$5, int $$6) {
      ftp $$7 = ftc.b($$1);
      eqf $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, auv.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
