public class gub implements gtw {
   private final gei a;
   private boolean b;
   private boolean c = true;

   public gub(gei $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dca $$0 = this.a.dU();
      dtc $$1 = $$0.c(this.a.cP().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfe.ob)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfe.ob) && !this.a.O_()) {
            boolean $$2 = $$1.c(dfi.b);
            if ($$2) {
               this.a.a(avo.dg, 1.0F, 1.0F);
            } else {
               this.a.a(avo.de, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
