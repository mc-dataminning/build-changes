public class hcf implements hca {
   private final ght a;
   private boolean b;
   private boolean c = true;

   public hcf(ght $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dff $$0 = this.a.dY();
      dvo $$1 = $$0.c(this.a.cT().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dil.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dil.nd) && !this.a.R_()) {
            boolean $$2 = $$1.c(dip.b);
            if ($$2) {
               this.a.a(awo.db, 1.0F, 1.0F);
            } else {
               this.a.a(awo.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
