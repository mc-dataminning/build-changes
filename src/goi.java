public class goi implements gnw<dxr> {
   private final gmo a;

   public goi(gnx.a $$0) {
      this.a = $$0.b();
   }

   public void a(dxr $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      dhi $$6 = $$0.i();
      if ($$6 != null) {
         jh $$7 = $$0.aB_().a($$0.f().g());
         dxv $$8 = $$0.j();
         if (!$$8.l()) {
            gmq.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dko.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dxp.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dyw $$9 = $$8.a(dko.by) ? dyw.b : dyw.a;
               dxv $$10 = dko.bG.m().b(dxp.c, $$9).b(dxp.a, $$8.c(dxo.a));
               $$10 = $$10.b(dxp.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jh $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dxo.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gmq.b();
         }
      }
   }

   private void a(jh $$0, dxv $$1, fgs $$2, gll $$3, dhi $$4, boolean $$5, int $$6) {
      glv $$7 = gld.b($$1);
      fgw $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, bam.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aW_() {
      return 68;
   }
}
