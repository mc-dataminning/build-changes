public class gfw implements gfj<dql> {
   private final fvo<?> a;

   public gfw(gfk.a $$0) {
      this.a = new fvo($$0.a(fwu.bk));
   }

   public void a(dql $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      je $$6 = je.b;
      if ($$0.m()) {
         drx $$7 = $$0.i().a_($$0.aA_());
         if ($$7.b() instanceof dlt) {
            $$6 = $$7.c(dlt.b);
         }
      }

      ctd $$8 = $$0.u();
      gqy $$9;
      if ($$8 == null) {
         $$9 = gdy.i;
      } else {
         $$9 = gdy.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fwv $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      ezx $$13 = $$9.a($$3, gdr::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
