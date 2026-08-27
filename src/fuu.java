public class fuu implements fui<dil> {
   private final ftc a;

   public fuu(fuj.a $$0) {
      this.a = $$0.b();
   }

   public void a(dil $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      csy $$6 = $$0.i();
      if ($$6 != null) {
         hv $$7 = $$0.aB_().a($$0.g().g());
         dip $$8 = $$0.k();
         if (!$$8.i()) {
            fte.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cwb.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dij.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               djr $$9 = $$8.a(cwb.br) ? djr.b : djr.a;
               dip $$10 = cwb.bz.o().a(dij.c, $$9).a(dij.a, $$8.c(dii.a));
               $$10 = $$10.a(dij.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hv $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dii.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fte.b();
         }
      }
   }

   private void a(hv $$0, dip $$1, epd $$2, fsi $$3, csy $$4, boolean $$5, int $$6) {
      fsq $$7 = fsd.b($$1);
      eph $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, auf.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aS_() {
      return 68;
   }
}
