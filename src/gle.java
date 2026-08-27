public class gle extends gky<cdr, ftr<cdr>> {
   private final gby a;
   private final ghl b;

   public gle(gii<cdr, ftr<cdr>> $$0, gby $$1, ghl $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(exn $$0, gbe $$1, int $$2, cdr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = fcu.Q().b($$3) && $$3.cf();
         if (!$$3.cf() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            csd $$12 = new csd(dcx.ee);
            if ($$10) {
               dpy $$13 = dcx.ee.n();
               goo $$14 = this.a.a($$13);
               int $$15 = gho.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gbm.r(gmn.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, csa.f, false, $$0, $$1, $$3.dN(), $$2, gho.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
