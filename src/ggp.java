public class ggp implements ggd<dsg> {
   private final gex a;

   public ggp(gge.a $$0) {
      this.a = $$0.b();
   }

   public void a(dsg $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
      dcf $$6 = $$0.i();
      if ($$6 != null) {
         ja $$7 = $$0.az_().a($$0.f().g());
         dsk $$8 = $$0.j();
         if (!$$8.i()) {
            gez.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfj.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dse.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dtm $$9 = $$8.a(dfj.br) ? dtm.b : dtm.a;
               dsk $$10 = dfj.bz.o().a(dse.c, $$9).a(dse.a, $$8.c(dsd.a));
               $$10 = $$10.a(dse.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ja $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dsd.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gez.b();
         }
      }
   }

   private void a(ja $$0, dsk $$1, fam $$2, ged $$3, dcf $$4, boolean $$5, int $$6) {
      gel $$7 = gdy.b($$1);
      faq $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ayo.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aT_() {
      return 68;
   }
}
