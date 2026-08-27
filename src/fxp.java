public class fxp extends fxk<bvk, fgy<bvk>> {
   private final fot a;
   private final fua b;

   public fxp(fux<bvk, fgy<bvk>> $$0, fot $$1, fua $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(elk $$0, fnz $$1, int $$2, bvk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.q()) {
         boolean $$10 = eqq.O().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cja $$12 = new cja(csr.ef);
            if ($$10) {
               dfe $$13 = csr.ef.n();
               gba $$14 = this.a.a($$13);
               int $$15 = fud.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(foh.q(fyy.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cix.f, false, $$0, $$1, $$3.dK(), $$2, fud.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
