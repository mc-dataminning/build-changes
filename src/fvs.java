public class fvs implements fvg<djc> {
   private final fua a;

   public fvs(fvh.a $$0) {
      this.a = $$0.b();
   }

   public void a(djc $$0, float $$1, eqa $$2, ftg $$3, int $$4, int $$5) {
      cto $$6 = $$0.i();
      if ($$6 != null) {
         hx $$7 = $$0.aB_().a($$0.g().g());
         djg $$8 = $$0.k();
         if (!$$8.i()) {
            fuc.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cwr.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dja.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dki $$9 = $$8.a(cwr.br) ? dki.b : dki.a;
               djg $$10 = cwr.bz.o().a(dja.c, $$9).a(dja.a, $$8.c(diz.a));
               $$10 = $$10.a(dja.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hx $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(diz.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fuc.b();
         }
      }
   }

   private void a(hx $$0, djg $$1, eqa $$2, ftg $$3, cto $$4, boolean $$5, int $$6) {
      fto $$7 = ftb.b($$1);
      eqe $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, auu.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
