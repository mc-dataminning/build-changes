public class gtq implements gtd<eao> {
   private final gru a;

   public gtq(gte.a $$0) {
      this.a = $$0.b();
   }

   public void a(eao $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      djm $$7 = $$0.i();
      if ($$7 != null) {
         iv $$8 = $$0.ax_().a($$0.f().g());
         eat $$9 = $$0.j();
         if (!$$9.l()) {
            grw.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dmt.bJ) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(eam.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               ebv $$10 = $$9.a(dmt.by) ? ebv.b : ebv.a;
               eat $$11 = dmt.bJ.m().b(eam.c, $$10).b(eam.a, $$9.c(eal.a));
               $$11 = $$11.b(eam.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               iv $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(eal.c, Boolean.valueOf(true));
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            grw.b();
         }
      }
   }

   private void a(iv $$0, eat $$1, fkd $$2, gqr $$3, djm $$4, boolean $$5, int $$6) {
      grc $$7 = gqj.b($$1);
      fkh $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azv.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aR_() {
      return 68;
   }
}
