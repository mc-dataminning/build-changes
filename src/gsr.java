public class gsr implements gse<dzu> {
   private final gqw a;

   public gsr(gsf.a $$0) {
      this.a = $$0.b();
   }

   public void a(dzu $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      div $$7 = $$0.i();
      if ($$7 != null) {
         iu $$8 = $$0.aw_().a($$0.f().g());
         dzz $$9 = $$0.j();
         if (!$$9.l()) {
            gqy.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dmc.bH) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(dzs.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               ebb $$10 = $$9.a(dmc.by) ? ebb.b : ebb.a;
               dzz $$11 = dmc.bH.m().b(dzs.c, $$10).b(dzs.a, $$9.c(dzr.a));
               $$11 = $$11.b(dzs.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               iu $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(dzr.c, Boolean.valueOf(true));
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            gqy.b();
         }
      }
   }

   private void a(iu $$0, dzz $$1, fjc $$2, gps $$3, div $$4, boolean $$5, int $$6) {
      gqc $$7 = gpk.b($$1);
      fjg $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azv.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
