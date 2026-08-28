public class gpv implements gpj<dxm> {
   private final gob a;

   public gpv(gpk.a $$0) {
      this.a = $$0.b();
   }

   public void a(dxm $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      dgz $$6 = $$0.i();
      if ($$6 != null) {
         ji $$7 = $$0.aA_().a($$0.f().g());
         dxq $$8 = $$0.j();
         if (!$$8.l()) {
            god.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dkg.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dxk.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dys $$9 = $$8.a(dkg.by) ? dys.b : dys.a;
               dxq $$10 = dkg.bG.m().b(dxk.c, $$9).b(dxk.a, $$8.c(dxj.a));
               $$10 = $$10.b(dxk.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ji $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dxj.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            god.b();
         }
      }
   }

   private void a(ji $$0, dxq $$1, fgr $$2, gmx $$3, dgz $$4, boolean $$5, int $$6) {
      gnh $$7 = gmq.b($$1);
      fgv $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azh.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}
