public class gqx implements gqk<dyi> {
   private final gpc a;

   public gqx(gql.a $$0) {
      this.a = $$0.b();
   }

   public void a(dyi $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      dhp $$6 = $$0.i();
      if ($$6 != null) {
         jj $$7 = $$0.aw_().a($$0.f().g());
         dym $$8 = $$0.j();
         if (!$$8.l()) {
            gpe.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dkw.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dyg.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               dzo $$9 = $$8.a(dkw.by) ? dzo.b : dzo.a;
               dym $$10 = dkw.bG.m().b(dyg.c, $$9).b(dyg.a, $$8.c(dyf.a));
               $$10 = $$10.b(dyg.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jj $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dyf.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gpe.b();
         }
      }
   }

   private void a(jj $$0, dym $$1, fho $$2, gny $$3, dhp $$4, boolean $$5, int $$6) {
      goi $$7 = gnr.b($$1);
      fhs $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azs.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aQ_() {
      return 68;
   }
}
