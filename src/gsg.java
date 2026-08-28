public class gsg extends gsb<guo, fzo> {
   private final gio a;
   private final gom b;

   public gsg(gpk<guo, fzo> $$0, gio $$1, gom $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fdi $$0, ghl $$1, int $$2, guo $$3, float $$4, float $$5) {
      gzi $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cvs $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof ctu $$10) {
               dus $$11 = $$10.d().n();
               gzi $$12 = this.a.a($$11);
               int $$13 = gop.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(ghv.r(gxf.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cvp.f, false, $$0, $$1, $$2, gop.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
