public class gaf implements fzs<dlq> {
   private final fpy<?> a;

   public gaf(fzt.a $$0) {
      this.a = new fpy($$0.a(fre.bk));
   }

   public void a(dlq $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      ih $$6 = ih.b;
      if ($$0.m()) {
         dnb $$7 = $$0.i().a_($$0.aC_());
         if ($$7.b() instanceof dha) {
            $$6 = $$7.c(dha.b);
         }
      }

      cpd $$8 = $$0.s();
      glf $$9;
      if ($$8 == null) {
         $$9 = fyh.i;
      } else {
         $$9 = fyh.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      frf $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      euf $$13 = $$9.a($$3, fya::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
