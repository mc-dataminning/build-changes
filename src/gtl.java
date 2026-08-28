public class gtl implements gsy<eaj> {
   private final grp a;

   public gtl(gsz.a $$0) {
      this.a = $$0.b();
   }

   public void a(eaj $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      djh $$7 = $$0.i();
      if ($$7 != null) {
         iv $$8 = $$0.ax_().a($$0.f().g());
         eao $$9 = $$0.j();
         if (!$$9.l()) {
            grr.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dmo.bJ) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(eah.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               ebq $$10 = $$9.a(dmo.by) ? ebq.b : ebq.a;
               eao $$11 = dmo.bJ.m().b(eah.c, $$10).b(eah.a, $$9.c(eag.a));
               $$11 = $$11.b(eah.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               iv $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(eag.c, Boolean.valueOf(true));
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            grr.b();
         }
      }
   }

   private void a(iv $$0, eao $$1, fjy $$2, gqm $$3, djh $$4, boolean $$5, int $$6) {
      gqx $$7 = gqe.b($$1);
      fkc $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azv.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aR_() {
      return 68;
   }
}
