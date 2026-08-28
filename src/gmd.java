public class gmd implements glr<dvr> {
   private final gkj a;

   public gmd(gls.a $$0) {
      this.a = $$0.b();
   }

   public void a(dvr $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      dfm $$6 = $$0.i();
      if ($$6 != null) {
         jh $$7 = $$0.aA_().a($$0.f().g());
         dvv $$8 = $$0.j();
         if (!$$8.l()) {
            gkl.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dis.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dvp.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dww $$9 = $$8.a(dis.br) ? dww.b : dww.a;
               dvv $$10 = dis.bz.m().b(dvp.c, $$9).b(dvp.a, $$8.c(dvo.a));
               $$10 = $$10.b(dvp.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jh $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dvo.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gkl.b();
         }
      }
   }

   private void a(jh $$0, dvv $$1, fer $$2, gjg $$3, dfm $$4, boolean $$5, int $$6) {
      gjq $$7 = giy.b($$1);
      fev $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azu.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}
