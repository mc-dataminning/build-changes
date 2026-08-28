public class gfz implements gfn<drx> {
   private final geh a;

   public gfz(gfo.a $$0) {
      this.a = $$0.b();
   }

   public void a(drx $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      dbx $$6 = $$0.i();
      if ($$6 != null) {
         iz $$7 = $$0.ay_().a($$0.f().g());
         dsb $$8 = $$0.j();
         if (!$$8.i()) {
            gej.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfa.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(drv.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dtd $$9 = $$8.a(dfa.br) ? dtd.b : dtd.a;
               dsb $$10 = dfa.bz.o().a(drv.c, $$9).a(drv.a, $$8.c(dru.a));
               $$10 = $$10.a(drv.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               iz $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dru.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gej.b();
         }
      }
   }

   private void a(iz $$0, dsb $$1, ezx $$2, gdn $$3, dbx $$4, boolean $$5, int $$6) {
      gdv $$7 = gdi.b($$1);
      fab $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azg.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
