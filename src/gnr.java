public class gnr extends gnl<cgf, fwc<cgf>> {
   private final gek a;
   private final gjx b;

   public gnr(gkv<cgf, fwc<cgf>> $$0, gek $$1, gjx $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(faa $$0, gdq $$1, int $$2, cgf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = ffh.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cur $$12 = new cur(dfd.ee);
            if ($$10) {
               dse $$13 = dfd.ee.o();
               grc $$14 = this.a.a($$13);
               int $$15 = gka.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gdy.r(gpa.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cuo.f, false, $$0, $$1, $$3.dP(), $$2, gka.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
