public class gbi implements gbd {
   private final fmn a;
   private boolean b;
   private boolean c = true;

   public gbi(fmn $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cpm $$0 = this.a.dK();
      dfa $$1 = $$0.c(this.a.cG().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(csn.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(csn.nd) && !this.a.G_()) {
            boolean $$2 = $$1.c(csr.a);
            if ($$2) {
               this.a.a(aow.cu, 1.0F, 1.0F);
            } else {
               this.a.a(aow.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
