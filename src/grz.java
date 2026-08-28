public class grz extends gsm<gul, fyc> {
   private final gox a;

   public grz(gpv<gul, fyc> $$0, gox $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fdt $$0, ghw $$1, int $$2, gul $$3, float $$4, float $$5) {
      gzu $$6 = $$3.b();
      cvx $$7 = $$3.aX_();
      if ($$6 != null && !$$7.f()) {
         boolean $$8 = $$3.d;
         boolean $$9 = $$3.ae;
         $$0.a();
         $$0.a(this.d().b.b / 16.0F, this.d().b.c / 16.0F, this.d().b.d / 16.0F);
         if ($$9) {
            float $$10 = 0.75F;
            $$0.b(0.75F, 0.75F, 0.75F);
         }

         $$0.a(a.f.rotation($$3.a));
         $$0.a(a.d.rotationDegrees($$4));
         $$0.a(a.b.rotationDegrees($$5));
         if ($$3.ae) {
            if ($$8) {
               $$0.a(0.4F, 0.26F, 0.15F);
            } else {
               $$0.a(0.06F, 0.26F, -0.5F);
            }
         } else if ($$8) {
            $$0.a(0.46F, 0.26F, 0.22F);
         } else {
            $$0.a(0.06F, 0.27F, -0.5F);
         }

         $$0.a(a.b.rotationDegrees(90.0F));
         if ($$8) {
            $$0.a(a.f.rotationDegrees(90.0F));
         }

         this.a.a($$7, cvv.h, false, $$0, $$1, $$2, gxj.d, $$6);
         $$0.b();
      }
   }
}
