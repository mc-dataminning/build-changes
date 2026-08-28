public class gsl implements gsg {
   private final gcz a;
   private boolean b;
   private boolean c = true;

   public gsl(gcz $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dcd $$0 = this.a.dP();
      dsh $$1 = $$0.c(this.a.cK().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfh.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfh.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dfl.b);
            if ($$2) {
               this.a.a(avf.db, 1.0F, 1.0F);
            } else {
               this.a.a(avf.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
