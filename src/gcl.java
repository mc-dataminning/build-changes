public class gcl implements gbz<dov> {
   private final gat a;

   public gcl(gca.a $$0) {
      this.a = $$0.b();
   }

   public void a(dov $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      cyx $$6 = $$0.i();
      if ($$6 != null) {
         ib $$7 = $$0.aA_().a($$0.f().g());
         doz $$8 = $$0.j();
         if (!$$8.i()) {
            gav.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dca.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dot.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dqb $$9 = $$8.a(dca.br) ? dqb.b : dqb.a;
               doz $$10 = dca.bz.n().a(dot.c, $$9).a(dot.a, $$8.c(dos.a));
               $$10 = $$10.a(dot.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ib $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dos.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gav.b();
         }
      }
   }

   private void a(ib $$0, doz $$1, ewi $$2, fzz $$3, cyx $$4, boolean $$5, int $$6) {
      gah $$7 = fzu.b($$1);
      ewm $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, axr.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
