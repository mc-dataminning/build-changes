public class ger implements gem {
   private final fpw a;
   private boolean b;
   private boolean c = true;

   public ger(fpw $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      csa $$0 = this.a.dN();
      dhi $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cvc.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cvc.nd) && !this.a.O_()) {
            boolean $$2 = $$1.c(cvg.b);
            if ($$2) {
               this.a.a(aqr.cu, 1.0F, 1.0F);
            } else {
               this.a.a(aqr.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
