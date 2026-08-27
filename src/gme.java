public class gme implements glz {
   private final fwu a;
   private boolean b;
   private boolean c = true;

   public gme(fwu $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cxb $$0 = this.a.dM();
      dnb $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dae.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dae.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dai.b);
            if ($$2) {
               this.a.a(aty.da, 1.0F, 1.0F);
            } else {
               this.a.a(aty.cY, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
