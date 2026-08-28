public class gsz implements gsm<eac> {
   private final gre a;

   public gsz(gsn.a $$0) {
      this.a = $$0.b();
   }

   public void a(eac $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      dja $$7 = $$0.i();
      if ($$7 != null) {
         iu $$8 = $$0.ax_().a($$0.f().g());
         eah $$9 = $$0.j();
         if (!$$9.l()) {
            grg.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dmh.bJ) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(eaa.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               ebj $$10 = $$9.a(dmh.by) ? ebj.b : ebj.a;
               eah $$11 = dmh.bJ.m().b(eaa.c, $$10).b(eaa.a, $$9.c(dzz.a));
               $$11 = $$11.b(eaa.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               iu $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(dzz.c, Boolean.valueOf(true));
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            grg.b();
         }
      }
   }

   private void a(iu $$0, eah $$1, fjj $$2, gqa $$3, dja $$4, boolean $$5, int $$6) {
      gqk $$7 = gps.b($$1);
      fjn $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azv.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aR_() {
      return 68;
   }
}
