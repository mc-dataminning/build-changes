public class ggj implements gfx<dsd> {
   private final ger a;

   public ggj(gfy.a $$0) {
      this.a = $$0.b();
   }

   public void a(dsd $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      dcd $$6 = $$0.i();
      if ($$6 != null) {
         ja $$7 = $$0.az_().a($$0.f().g());
         dsh $$8 = $$0.j();
         if (!$$8.i()) {
            get.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfh.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dsb.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dtj $$9 = $$8.a(dfh.br) ? dtj.b : dtj.a;
               dsh $$10 = dfh.bz.o().a(dsb.c, $$9).a(dsb.a, $$8.c(dsa.a));
               $$10 = $$10.a(dsb.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ja $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dsa.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            get.b();
         }
      }
   }

   private void a(ja $$0, dsh $$1, fag $$2, gdx $$3, dcd $$4, boolean $$5, int $$6) {
      gef $$7 = gds.b($$1);
      fak $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, aym.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aS_() {
      return 68;
   }
}
