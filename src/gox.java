public class gox implements gol<dwu> {
   private final gnd a;

   public gox(gom.a $$0) {
      this.a = $$0.b();
   }

   public void a(dwu $$0, float $$1, ffv $$2, glz $$3, int $$4, int $$5) {
      dgj $$6 = $$0.i();
      if ($$6 != null) {
         ji $$7 = $$0.aA_().a($$0.f().g());
         dwy $$8 = $$0.j();
         if (!$$8.l()) {
            gnf.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(djp.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dws.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dxz $$9 = $$8.a(djp.by) ? dxz.b : dxz.a;
               dwy $$10 = djp.bG.m().b(dws.c, $$9).b(dws.a, $$8.c(dwr.a));
               $$10 = $$10.b(dws.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ji $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dwr.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gnf.b();
         }
      }
   }

   private void a(ji $$0, dwy $$1, ffv $$2, glz $$3, dgj $$4, boolean $$5, int $$6) {
      gmj $$7 = gls.b($$1);
      ffz $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azh.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}
