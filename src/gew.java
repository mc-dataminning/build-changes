public class gew implements gek<dqz> {
   private final gde a;

   public gew(gel.a $$0) {
      this.a = $$0.b();
   }

   public void a(dqz $$0, float $$1, eyu $$2, gck $$3, int $$4, int $$5) {
      daz $$6 = $$0.i();
      if ($$6 != null) {
         io $$7 = $$0.aA_().a($$0.f().g());
         drd $$8 = $$0.j();
         if (!$$8.i()) {
            gdg.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dec.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dqx.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dsf $$9 = $$8.a(dec.br) ? dsf.b : dsf.a;
               drd $$10 = dec.bz.n().a(dqx.c, $$9).a(dqx.a, $$8.c(dqw.a));
               $$10 = $$10.a(dqx.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               io $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dqw.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gdg.b();
         }
      }
   }

   private void a(io $$0, drd $$1, eyu $$2, gck $$3, daz $$4, boolean $$5, int $$6) {
      gcs $$7 = gcf.b($$1);
      eyy $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, aym.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
