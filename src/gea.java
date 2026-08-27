public class gea implements gdo<dqd> {
   private final gci a;

   public gea(gdp.a $$0) {
      this.a = $$0.b();
   }

   public void a(dqd $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      dad $$6 = $$0.i();
      if ($$6 != null) {
         in $$7 = $$0.az_().a($$0.f().g());
         dqh $$8 = $$0.j();
         if (!$$8.i()) {
            gck.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(ddg.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dqb.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               drj $$9 = $$8.a(ddg.br) ? drj.b : drj.a;
               dqh $$10 = ddg.bz.n().a(dqb.c, $$9).a(dqb.a, $$8.c(dqa.a));
               $$10 = $$10.a(dqb.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               in $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dqa.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gck.b();
         }
      }
   }

   private void a(in $$0, dqh $$1, exx $$2, gbo $$3, dad $$4, boolean $$5, int $$6) {
      gbw $$7 = gbj.b($$1);
      eyb $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ayg.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
