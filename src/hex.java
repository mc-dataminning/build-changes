public class hex implements hes {
   private final gkh a;
   private boolean b;
   private boolean c = true;

   public hex(gkh $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dhi $$0 = this.a.dW();
      dxv $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dko.ny)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dko.ny) && !this.a.aa_()) {
            boolean $$2 = $$1.c(dkt.b);
            if ($$2) {
               this.a.a(axf.db, 1.0F, 1.0F);
            } else {
               this.a.a(axf.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
