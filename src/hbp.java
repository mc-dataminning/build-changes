public class hbp implements hbk {
   private final ghd a;
   private boolean b;
   private boolean c = true;

   public hbp(ghd $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dfb $$0 = this.a.dX();
      dvj $$1 = $$0.c(this.a.cS().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dig.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dig.nd) && !this.a.R_()) {
            boolean $$2 = $$1.c(dik.b);
            if ($$2) {
               this.a.a(awl.db, 1.0F, 1.0F);
            } else {
               this.a.a(awl.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
