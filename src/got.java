public class got implements goh<dwr> {
   private final gmz a;

   public got(goi.a $$0) {
      this.a = $$0.b();
   }

   public void a(dwr $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      dgg $$6 = $$0.i();
      if ($$6 != null) {
         ji $$7 = $$0.aA_().a($$0.f().g());
         dwv $$8 = $$0.j();
         if (!$$8.l()) {
            gnb.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(djm.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dwp.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dxw $$9 = $$8.a(djm.by) ? dxw.b : dxw.a;
               dwv $$10 = djm.bG.m().b(dwp.c, $$9).b(dwp.a, $$8.c(dwo.a));
               $$10 = $$10.b(dwp.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ji $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dwo.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gnb.b();
         }
      }
   }

   private void a(ji $$0, dwv $$1, ffs $$2, glv $$3, dgg $$4, boolean $$5, int $$6) {
      gmf $$7 = glo.b($$1);
      ffw $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azg.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}
