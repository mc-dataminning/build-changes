public class hjd implements hiy {
   private final glv a;
   private boolean b;
   private boolean c = true;

   public hjd(glv $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dgz $$0 = this.a.dU();
      dxq $$1 = $$0.c(this.a.cQ().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dkg.nF)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dkg.nF) && !this.a.U_()) {
            boolean $$2 = $$1.c(dkl.b);
            if ($$2) {
               this.a.a(awa.db, 1.0F, 1.0F);
            } else {
               this.a.a(awa.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
