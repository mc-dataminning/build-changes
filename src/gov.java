public class gov implements goj<dws> {
   private final gnb a;

   public gov(gok.a $$0) {
      this.a = $$0.b();
   }

   public void a(dws $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      dgh $$6 = $$0.i();
      if ($$6 != null) {
         ji $$7 = $$0.aA_().a($$0.f().g());
         dww $$8 = $$0.j();
         if (!$$8.l()) {
            gnd.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(djn.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dwq.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dxx $$9 = $$8.a(djn.by) ? dxx.b : dxx.a;
               dww $$10 = djn.bG.m().b(dwq.c, $$9).b(dwq.a, $$8.c(dwp.a));
               $$10 = $$10.b(dwq.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ji $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dwp.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gnd.b();
         }
      }
   }

   private void a(ji $$0, dww $$1, fft $$2, glx $$3, dgh $$4, boolean $$5, int $$6) {
      gmh $$7 = glq.b($$1);
      ffx $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azh.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}
