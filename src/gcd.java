public class gcd implements gby {
   private final fni a;
   private boolean b;
   private boolean c = true;

   public gcd(fni $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cpx $$0 = this.a.dL();
      dfl $$1 = $$0.c(this.a.cG().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(csy.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(csy.nd) && !this.a.M_()) {
            boolean $$2 = $$1.c(ctc.a);
            if ($$2) {
               this.a.a(apf.cu, 1.0F, 1.0F);
            } else {
               this.a.a(apf.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
