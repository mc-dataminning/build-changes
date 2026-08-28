public class ggr implements ggf<dsh> {
   private final gez a;

   public ggr(ggg.a $$0) {
      this.a = $$0.b();
   }

   public void a(dsh $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      dcg $$6 = $$0.i();
      if ($$6 != null) {
         ja $$7 = $$0.az_().a($$0.f().g());
         dsl $$8 = $$0.j();
         if (!$$8.i()) {
            gfb.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dfk.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dsf.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dtn $$9 = $$8.a(dfk.br) ? dtn.b : dtn.a;
               dsl $$10 = dfk.bz.o().a(dsf.c, $$9).a(dsf.a, $$8.c(dse.a));
               $$10 = $$10.a(dsf.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ja $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dse.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gfb.b();
         }
      }
   }

   private void a(ja $$0, dsl $$1, fao $$2, gef $$3, dcg $$4, boolean $$5, int $$6) {
      gen $$7 = gea.b($$1);
      fas $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ayo.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aT_() {
      return 68;
   }
}
