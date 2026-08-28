public class hhy implements hht {
   private final gkt a;
   private boolean b;
   private boolean c = true;

   public hhy(gkt $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dgg $$0 = this.a.dW();
      dwv $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(djm.nF)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(djm.nF) && !this.a.Z_()) {
            boolean $$2 = $$1.c(djr.b);
            if ($$2) {
               this.a.a(avz.db, 1.0F, 1.0F);
            } else {
               this.a.a(avz.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
