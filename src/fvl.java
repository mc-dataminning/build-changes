public class fvl implements fuz<diw> {
   private final ftt a;

   public fvl(fva.a $$0) {
      this.a = $$0.b();
   }

   public void a(diw $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      cti $$6 = $$0.i();
      if ($$6 != null) {
         hx $$7 = $$0.aB_().a($$0.g().g());
         dja $$8 = $$0.k();
         if (!$$8.i()) {
            ftv.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cwl.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(diu.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dkc $$9 = $$8.a(cwl.br) ? dkc.b : dkc.a;
               dja $$10 = cwl.bz.o().a(diu.c, $$9).a(diu.a, $$8.c(dit.a));
               $$10 = $$10.a(diu.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hx $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dit.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            ftv.b();
         }
      }
   }

   private void a(hx $$0, dja $$1, ept $$2, fsz $$3, cti $$4, boolean $$5, int $$6) {
      fth $$7 = fsu.b($$1);
      epx $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, aup.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
