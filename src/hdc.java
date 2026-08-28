public class hdc extends hcw<hgn, gkb> {
   private final gtd a;

   public hdc(haf<hgn, gkb> $$0, gtd $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(flo $$0, gsa $$1, int $$2, hgn $$3, float $$4, float $$5) {
      if ($$3.a) {
         if (!$$3.z || $$3.ao) {
            $$0.a();
            this.d().b().a($$0);
            float $$6 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            ebe $$7 = dne.ev.m();
            gtn $$8 = this.a.a($$7);
            int $$9 = gzj.a($$3, 0.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            flr $$10 = $$3.ao && $$3.z ? $$1.getBuffer(gsl.s(hkz.c)) : $$1.getBuffer(grs.c($$7));
            this.a.b().a($$0.c(), $$10, $$8, 0.0F, 0.0F, 0.0F, $$2, $$9);
            $$0.b();
         }
      }
   }
}
