public class hbe implements haz {
   private final ggs a;
   private boolean b;
   private boolean c = true;

   public hbe(ggs $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dev $$0 = this.a.dX();
      dvd $$1 = $$0.c(this.a.cS().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dia.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dia.nd) && !this.a.R_()) {
            boolean $$2 = $$1.c(die.b);
            if ($$2) {
               this.a.a(awk.db, 1.0F, 1.0F);
            } else {
               this.a.a(awk.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
