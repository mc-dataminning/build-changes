public class gae implements fzs<dmx> {
   private final fym a;

   public gae(fzt.a $$0) {
      this.a = $$0.b();
   }

   public void a(dmx $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      cxb $$6 = $$0.i();
      if ($$6 != null) {
         ib $$7 = $$0.aC_().a($$0.f().g());
         dnb $$8 = $$0.j();
         if (!$$8.i()) {
            fyo.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dae.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dmv.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dod $$9 = $$8.a(dae.br) ? dod.b : dod.a;
               dnb $$10 = dae.bz.o().a(dmv.c, $$9).a(dmv.a, $$8.c(dmu.a));
               $$10 = $$10.a(dmv.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ib $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dmu.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fyo.b();
         }
      }
   }

   private void a(ib $$0, dnb $$1, eub $$2, fxs $$3, cxb $$4, boolean $$5, int $$6) {
      fya $$7 = fxn.b($$1);
      euf $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, axd.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aR_() {
      return 68;
   }
}
