public class hnd implements hmy {
   private final gpo a;
   private boolean b;
   private boolean c = true;

   public hnd(gpo $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      djm $$0 = this.a.dU();
      eat $$1 = $$0.c(this.a.cQ().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dmt.nJ)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dmt.nJ) && !this.a.V_()) {
            boolean $$2 = $$1.c(dmy.b);
            if ($$2) {
               this.a.a(awn.db, 1.0F, 1.0F);
            } else {
               this.a.a(awn.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
