public class gsr extends gsm<gva, fzz> {
   private final giz a;
   private final gox b;

   public gsr(gpv<gva, fzz> $$0, giz $$1, gox $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fdt $$0, ghw $$1, int $$2, gva $$3, float $$4, float $$5) {
      gzu $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cvx $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof cuc $$10) {
               dvd $$11 = $$10.d().m();
               gzu $$12 = this.a.a($$11);
               int $$13 = gpa.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gig.r(gxr.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cvv.f, false, $$0, $$1, $$2, gpa.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
