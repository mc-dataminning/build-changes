public class hmj implements hme {
   private final gox a;
   private boolean b;
   private boolean c = true;

   public hmj(gox $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dja $$0 = this.a.dV();
      eah $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dmh.nJ)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dmh.nJ) && !this.a.V_()) {
            boolean $$2 = $$1.c(dmm.b);
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
