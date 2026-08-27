public class gac implements fzq<dmv> {
   private final fyk a;

   public gac(fzr.a $$0) {
      this.a = $$0.b();
   }

   public void a(dmv $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      cwz $$6 = $$0.i();
      if ($$6 != null) {
         ib $$7 = $$0.aC_().a($$0.f().g());
         dmz $$8 = $$0.j();
         if (!$$8.i()) {
            fym.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dac.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dmt.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dob $$9 = $$8.a(dac.br) ? dob.b : dob.a;
               dmz $$10 = dac.bz.o().a(dmt.c, $$9).a(dmt.a, $$8.c(dms.a));
               $$10 = $$10.a(dmt.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ib $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dms.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fym.b();
         }
      }
   }

   private void a(ib $$0, dmz $$1, etz $$2, fxq $$3, cwz $$4, boolean $$5, int $$6) {
      fxy $$7 = fxl.b($$1);
      eud $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, axd.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aR_() {
      return 68;
   }
}
